import java.util.Scanner;
public class Task7 {
    public static void main(String[] args) {
        System.out.println("Задание № 7");
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите число");
        int N = scan.nextInt();
        System.out.println("Введите номер бита");
        int i = scan.nextInt();
        if ((N & (1 << i)) == (1 << i)) {
            String binary = Integer.toBinaryString(N);
            System.out.println(N + " в двоичном виде = " + binary);
            System.out.println(i + " бит числа " + N + " = 1");
        } else {
            String binary = Integer.toBinaryString(N);
            System.out.println(N + " = " + binary);
            System.out.println(i + " бит числа " + N + " = 0");
        }
    }
}
