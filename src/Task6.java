import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        System.out.println("Задание № 6");
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите число");
        int N = scan.nextInt();
        System.out.println("Введите количество последних битов числа,которые не нужно обнулять");
        int i = scan.nextInt();
        int number1 = N << (32-i);
        int number2 = number1 >>> (32-i);
        String binary = Integer.toBinaryString(number2);
        System.out.println(binary);
    }
}
