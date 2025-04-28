import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        System.out.println("Задание № 5");
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите число");
        int N = scan.nextInt();
        System.out.println("Введите разряд бита, который нужно обнулить");
        int i = scan.nextInt();
        int itog = N & ~ (1 << i);
        String binary = Integer.toBinaryString(itog);
        System.out.println(binary);
    }
}
