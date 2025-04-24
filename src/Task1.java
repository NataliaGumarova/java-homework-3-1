import java.util.Scanner;
public class Task1 {
    public static void main(String[] args) {
        System.out.println("Задание № 1");
        Scanner scan = new Scanner(System.in);
        System.out.println("Ведите число");
      int number = scan.nextInt();
      if (number % 2 == 0) {
          String binary = Integer.toBinaryString(number);
          System.out.println(binary);
      } else {
          int q = number ^ 1;
          String binary = Integer.toBinaryString(q);
          System.out.println(binary);
      }

    }
}
