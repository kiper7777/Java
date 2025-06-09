
// 2.Write a Java program to calculate Sum & Average of an integer array.
import java.util.Scanner;

public class ArraySumAverage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Ввод размера массива
        System.out.print("Введите количество элементов в массиве: ");
        int size = sc.nextInt();

        int[] numbers = new int[size];
        int sum = 0;

        // Ввод элементов массива
        System.out.println("Введите элементы массива:");
        for (int i = 0; i < size; i++) {
            numbers[i] = sc.nextInt();
            sum += numbers[i];
        }

        // Вычисление среднего
        double average = (double) sum / size;

        // Вывод результатов
        System.out.println("Сумма элементов массива: " + sum);
        System.out.println("Среднее значение: " + average);

        sc.close();
    }
}
