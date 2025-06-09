// 3.Write a Java program to show 0-arguments constructor.
public class ZeroArgConstructor {
    // Переменные экземпляра
    int a;
    int b;

    // Конструктор без аргументов
    public ZeroArgConstructor() {
        a = 10;
        b = 20;
        System.out.println("Конструктор без аргументов вызван.");
    }

    // Метод для отображения значений
    public void display() {
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("Сумма = " + (a + b));
    }

    // Главный метод
    public static void main(String[] args) {
        // Создание объекта вызывает конструктор без аргументов
        ZeroArgConstructor obj = new ZeroArgConstructor();

        // Вызов метода отображения
        obj.display();
    }
}
