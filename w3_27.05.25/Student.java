// 6.Write a program to create a class Student with data ‘name, city and age’
// along with method printData to display the data. Create the two objects s1
// ,s2 to declare and access the values.
public class Student {
    // Поля класса (свойства)
    String name;
    String city;
    int age;

    // Метод для вывода данных
    public void printData() {
        System.out.println("Имя: " + name);
        System.out.println("Город: " + city);
        System.out.println("Возраст: " + age);
        System.out.println(); // Пустая строка между студентами
    }

    // Главный метод
    public static void main(String[] args) {
        // Создание первого объекта s1
        Student s1 = new Student();
        s1.name = "Алексей";
        s1.city = "Москва";
        s1.age = 20;

        // Создание второго объекта s2
        Student s2 = new Student();
        s2.name = "Мария";
        s2.city = "Санкт-Петербург";
        s2.age = 22;

        // Вывод данных студентов
        System.out.println("Студент 1:");
        s1.printData();

        System.out.println("Студент 2:");
        s2.printData();
    }
}
