import javax.swing.*;
import java.util.function.Function;
import java.util.Scanner;
import java.util.ArrayList;
import java.io.IOException;

public class Calculator {

    private static Scanner in = new Scanner(System.in);

    public static int a = 1;
    static int b = 2;
    public static int even;
    public static int odd;

    public static void main(String[] args) throws IOException {

        //основые арифметические
        System.out.println("Результат: a=b " + (a == b));
        System.out.println("Результат: a>b " + (a > b));
        System.out.println("Результат: a<b " + (a < b));

        System.out.println("Результат: " + (a + b));
        System.out.println("Результат: " + (a - b));
        System.out.println("Результат: " + (a * b));
        System.out.println("Результат: " + (a / b));
        //сравнение
        if (a != b) {
            System.out.println("Строки неидентичны");
        } else if (a == b) {
            System.out.println("Строки идентичны");
        }
        //сравнение строк

        String s = "a";
        String s1 = "b";
        if (s == s1) {
            System.out.println("Строки идентичны");
        } else {
            System.out.println("Строки неидентичны");
        }
        // вывод четных

        ArrayList<Integer> list = new ArrayList<>();
        System.out.println();
        int[] x = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};    //заданный массив
        for (int i = 0; i < x.length; i++) {
            if (i % 2 == 0) {
                list.add(i);
            }
        }
        System.out.println(list);
    }
}
