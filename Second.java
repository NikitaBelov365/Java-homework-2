import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

public class Second {

    public static void Just_Write_To_File(int[] line) {
        try (FileWriter notation = new FileWriter("log.txt", true)) {
            for (int i : line) {
                notation.append(i + " ");
            }
            notation.append("\n");
            notation.close();
        } catch (IOException e) {
            System.out.println(e.toString());
        }
    }

    public static void main(String[] args) {
        int[] mas = { 11, 3, 14, 16, 7 };

        boolean isSorted = false;
        int buf;
        while (!isSorted) {
            isSorted = true;
            for (int i = 0; i < mas.length - 1; i++) {
                if (mas[i] > mas[i + 1]) {
                    isSorted = false;

                    buf = mas[i];
                    mas[i] = mas[i + 1];
                    mas[i + 1] = buf;
                    Just_Write_To_File(mas);
                    
                }
            }
        }
        System.out.println(Arrays.toString(mas));
    }
}
