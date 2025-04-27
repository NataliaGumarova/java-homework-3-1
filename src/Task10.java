import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        System.out.println("Задание № 10");
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите первое число");
        int N = scan.nextInt();
        System.out.println("Введите второе число");
        int M = scan.nextInt();
        int i = N ^ M;
        if (i == 0) {
            System.out.println("Числа равны");
        } else{
            int a = 0;
            while (i > 1) {
                a = a + 1;
                i = i >> 1;
            }
            if (a == 0) // если одно из чисел отриц.
            {
                System.out.println((N & (1 << 31)) == (1 << 31) ? N : M);
            } else if ((N & (1 << 31)) == (1 << 31)) // для 2 отриц.чисел
            {
                System.out.println((N & (1 << a)) == (1 << a) ? M : N);
            } else // для 2 полож.чисел
            {
                System.out.println((N & (1 << a)) == (1 << a) ? M : N);
            }
        }
    }
}
