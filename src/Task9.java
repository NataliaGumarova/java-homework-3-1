import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        System.out.println("Задание № 9");
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите первое число");
        int N = scan.nextInt();
        System.out.println("Введите второе число");
        int M = scan.nextInt();
        if ((N & (1 << 31)) == (1 << 31)) {
            if ((M & (1 << 31)) == (1 << 31)) {
                System.out.println("Числа имеют одинаковые знаки");
            } else System.out.println("Числа имеют разные знаки");
        } else {
            if ((M & (1 << 31)) == (1 << 31)) {
                System.out.println("Числа имеют разные знаки");
            } else System.out.println("Числа имеют одинаковые знаки");
        }
    }
}
