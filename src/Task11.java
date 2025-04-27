import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите число");
        int N = scan.nextInt();
        int i = 0;
        int a = 0;
        int n = N;
        while (n != 0) {
            if ((n & (1 << i)) == 1 ) {
                a = a + 1;
            }
            n = n >> 1;
        }
        String binary = Integer.toBinaryString(N);
        System.out.println("Число " + N + " в двоичном виде:\n" + binary + "\nединичных бит - " + a);
    }
}
