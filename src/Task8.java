import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        System.out.println("Задание № 8");
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите число");
        int N = scan.nextInt();
        int n = N;
        int number = 0;
        while (n > 1) {
            number = number + 1;
            n = n >> 1;
        }
        int a = N & ~(1 << number);
        String binary = Integer.toBinaryString(a);
        System.out.println(binary);

    }
}
