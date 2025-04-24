import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        System.out.println("Задание № 2");
        System.out.println("Введите значение степени числа 2");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        if (n > 0) {
            int itog = 2 << (n - 1);
            System.out.println("2 в степени " + n + " = " + itog);
            } else if (n == 0) {
            System.out.println("2 в степени " + n + " = " + 1);
            } else if (n < 0) {
            int itog = 2 << (-n - 1);
            System.out.println("2 в степени " + n + " = 1/" + itog);
        }

    }
}
