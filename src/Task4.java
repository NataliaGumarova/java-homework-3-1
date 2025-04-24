import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        System.out.println("Задание № 4");
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите число");
        int N = scan.nextInt();
        System.out.println("Введите разряд бита числа " + N + ", который нужно инвертировать");
        int i = scan.nextInt();
        int itog = N & ~(1 << i);
        if (itog == N) {
            int w = N | (1 << i);
            String binary = Integer.toBinaryString(w);
            System.out.println(binary);
        } else {
        String binary = Integer.toBinaryString(itog);
        System.out.println(binary);}
    }
}
