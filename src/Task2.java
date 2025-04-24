import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        System.out.println("Задание № 2");
        System.out.println("Введите значение степени числа 2");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int itog = 2 << (n - 1);
        System.out.println(itog);
    }
}
