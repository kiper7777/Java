class Add {
    public void addNo() {
        int a = 10;
        int b = 20;
        int result = a + b;
        System.out.println(result);
    }
}

// Класс B
class B {
    private String name;
    private int age;

    public void setval(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

// Класс Calculate
class Calculate {
    private int x, y;

    public void setval(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int mul() {
        return x * y;
    }
}

// Основной класс
public class DamTwo {
    public static void main(String[] args) {
        System.out.println("Hi");

        Add ob = new Add();
        ob.addNo();

        B ob1 = new B();
        ob1.setval("John", 20);
        ob1.display();

        Calculate cal = new Calculate();
        cal.setval(10, 20);
        int res = cal.mul();
        System.out.println("The result of multiplication is " + res);
    }
}
