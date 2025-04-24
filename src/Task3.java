import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        System.out.println("Задание № 3");
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите число");
        int N = scan.nextInt();
        System.out.println("Введите разряд бита числа " + N + ", который нужно заменить на 1");
        int i = scan.nextInt();
        int itog = N | (1 << i);
        String binary = Integer.toBinaryString(itog);
        System.out.println(binary);


    }
}
