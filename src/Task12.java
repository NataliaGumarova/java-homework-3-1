import java.util.Scanner;

public class Task12 {
    public static void main(String[] args) {
        System.out.println("Задание № 12");
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите число");
        int n = scan.nextInt();
        int m = n;
        int i = 0;
        String binary = Integer.toBinaryString(n);
        System.out.println(binary);
        while (m != 0){
            if ((m & (1 << 0)) == 0 ) {
                i = i + 1;
                System.out.println("в двоичной записи числа " + n + " есть нули");
                break;
            }
            m = m >> 1;
        }
        if (i == 0) {
            System.out.println("в двоичной записи числа " + n + " нет нулей");
        }

    }
}
