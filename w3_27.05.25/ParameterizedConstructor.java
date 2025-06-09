// 4.Write a Java program to show parameterized constructors.
public class ParameterizedConstructor {
    // Переменные экземпляра
    String name;
    int age;

    // Параметризованный конструктор
    public ParameterizedConstructor(String n, int a) {
        name = n;
        age = a;
    }

    // Метод для отображения информации
    public void display() {
        System.out.println("Имя: " + name);
        System.out.println("Возраст: " + age);
    }

    // Главный метод
    public static void main(String[] args) {
        // Создание объектов с передачей параметров
        ParameterizedConstructor person1 = new ParameterizedConstructor("Алексей", 25);
        ParameterizedConstructor person2 = new ParameterizedConstructor("Мария", 30);

        // Отображение информации
        System.out.println("Объект 1:");
        person1.display();

        System.out.println("\nОбъект 2:");
        person2.display();
    }
}
