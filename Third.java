import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Third {

    public static void Separator(String str) {
        StringBuilder sb = new StringBuilder();
        
        int index_name = str.indexOf("{\"фамилия\":\""); //12
        int index_grade = str.indexOf("\",\"\u043E\u0446\u0435\u043D\u043A\u0430\":\""); //12
        int index_class = str.indexOf("\",\"\u043F\u0440\u0435\u0434\u043C\u0435\u0442\":\""); //13
        int index_last = str.indexOf("\"}");

        sb.append("Студент " + str.substring(index_name+12, index_grade));
        sb.append(" получил " + str.substring(index_grade+12, index_class));
        sb.append(" по предмету " + str.substring(index_class+13, index_last) + ".");
        System.out.println(sb);
    }
    public static void main(String[] args) throws IOException {
        File f = new File("3.txt");
        BufferedReader fin = new BufferedReader(new FileReader(f));
        String line = fin.readLine();
        String[] arr = line.split(",\\{");
        for (String string : arr) {
            Separator(string);
        }
    }
}
