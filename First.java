import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

// подскажите, пожалуйста, а есть какой то более красивый вариант этой задачки?

public class First {
    public static void main(String[] args) throws IOException {
        File f = new File("1.txt");
        BufferedReader fin = new BufferedReader(new FileReader(f));
        String line = fin.readLine();
        StringBuilder sb = new StringBuilder();
        int index_name = line.indexOf("name\":\""); //7
        int index_country = line.indexOf("\", \"country\":\""); //14
        int index_city = line.indexOf("\", \"city\":\""); //11
        int index_age = line.indexOf("\", \"age\":\""); //10
        int last_ind = line.indexOf("\"}");
        int index_of_null = line.indexOf("null");

        sb.append("select * from students where ");

        if (index_of_null > index_name && index_of_null < index_country) {
        } else {sb.append("name = " + line.substring(index_name+7, index_country));}

        if (index_of_null > index_country && index_of_null < index_city) {
        } else {sb.append(" and country = " + line.substring(index_country+14, index_city));}

        if (index_of_null > index_city && index_of_null < index_age) {
        } else {sb.append(" and city = " + line.substring(index_city+11, index_age));}
        
        if (index_of_null > index_age && index_of_null < last_ind) {
        } else {sb.append(" and age = " + line.substring(index_age+10, last_ind));}

        System.out.println(sb);
    }
}