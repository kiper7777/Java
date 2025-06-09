// 1.Write a program to calculate the sum of two numbers using a constructor.

// import java.util.Scanner;

public class Sum {
    int num1;
    int num2;
    int result;

    // Конструктор
    public Sum(int a, int b) {
        num1 = a;
        num2 = b;
        result = num1 + num2;
    }

    // Метод для вывода результата
    public void display() {
        System.out.println("The sum of two numbers is: " + result);
    }

    // Точка входа
    public static void main(String[] args) {
        // Создание объекта и передача чисел через конструктор
        Sum obj = new Sum(10, 20);

        // Вывод результата
        obj.display();
    }
}
