import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Fourth {

    public static double CalcFunc(int x, int y, String operation) {
        double z = 0;
        switch (operation) {
            case "+" -> z = x + y;
            case "-" -> z = x - y;
            case "*" -> z = x * y;
            case "/" -> z = x / y;
        }
        return z;
    }

    public static void Just_Write_To_File(int num1, int num2, double result, String operation) {
        try (FileWriter notation = new FileWriter("calk_log.txt", true)) {
            notation.append(num1 + " " + operation + " " + num2 + " = " + result);
            notation.append("\n");
            notation.close();
        } catch (IOException e) {
            System.out.println(e.toString());
        }
    }

    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.println("Input first number: ");
        int num1 = iScanner.nextInt();
        System.out.println("Input second number: ");
        int num2 = iScanner.nextInt();
        System.out.println("Input operation type (+, -, *, /): ");
        String operation = iScanner.next();
        double result = CalcFunc(num1, num2, operation);
        System.out.println(result);
        Just_Write_To_File(num1, num2, result, operation);
        iScanner.close();

    }
}
