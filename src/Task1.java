import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        System.out.println("Задание № 1");
        Scanner scan = new Scanner(System.in);
        System.out.println("Ведите число");
      int number = scan.nextInt();
      int itog = number & ~1;
      String binary = Integer.toBinaryString(itog);
      System.out.println(binary);
    }
}
