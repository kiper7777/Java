// 5.Write a Java program to show constructor overloading.
public class ConstructorOverloading {
    String name;
    int age;

    // Конструктор без параметров
    public ConstructorOverloading() {
        name = "Неизвестно";
        age = 0;
    }

    // Параметризованный конструктор с одним параметром
    public ConstructorOverloading(String n) {
        name = n;
        age = 0;
    }

    // Параметризованный конструктор с двумя параметрами
    public ConstructorOverloading(String n, int a) {
        name = n;
        age = a;
    }

    // Метод для отображения информации
    public void display() {
        System.out.println("Имя: " + name);
        System.out.println("Возраст: " + age);
        System.out.println();
    }

    // Главный метод
    public static void main(String[] args) {
        ConstructorOverloading obj1 = new ConstructorOverloading();
        ConstructorOverloading obj2 = new ConstructorOverloading("Анна");
        ConstructorOverloading obj3 = new ConstructorOverloading("Иван", 28);

        System.out.println("Объект 1 (конструктор без параметров):");
        obj1.display();

        System.out.println("Объект 2 (один параметр):");
        obj2.display();

        System.out.println("Объект 3 (два параметра):");
        obj3.display();
    }
}
