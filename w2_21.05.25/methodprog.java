import java.util.Scanner;

public class methodprog {
   // Метод сложения двух чисел
   static int add(int a, int b) {
      return a + b;
   }

   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

      System.out.print("Enter first number: ");
      while (!sc.hasNextInt()) {
         System.out.println("Please enter a valid integer!");
         sc.next(); // пропустить неверный ввод
      }
      int num1 = sc.nextInt();

      System.out.print("Enter second number: ");
      while (!sc.hasNextInt()) {
         System.out.println("Please enter a valid integer!");
         sc.next();
      }
      int num2 = sc.nextInt();

      int result = add(num1, num2);
      System.out.println("Addition: " + result);

      sc.close(); // Закрытие Scanner — хорошая практика
   }
}
