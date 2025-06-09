class B {
    private int a;
    private int b;

    // Конструктор без параметров
    public B() {
        System.out.println("Конструктор без параметров вызван");
    }

    // Конструктор с одним параметром
    public B(int num) {
        a = num;
        System.out.println("Значение a: " + a);
    }

    // Конструктор с двумя параметрами
    public B(int num1, int num2) {
        a = num1;
        b = num2;
        System.out.println("Значение a: " + a);
        System.out.println("Значение b: " + b);
    }

    // Перегруженный метод add с целыми числами
    public void add(int n, int m) {
        int result = n + m;
        System.out.println("Сумма int: " + result);
    }

    // Перегруженный метод add с float
    public float add(float x, float y) {
        float result = x + y;
        return result;
    }
}

public class DemoCons2 {
    public static void main(String[] args) {
        B ob = new B(10);
        B ob1 = new B();
        B ob3 = new B(10, 20);

        ob.add(5, 15); // вызов int версии
        float res = ob.add(5.5f, 4.5f); // вызов float версии
        System.out.println("Сумма float: " + res);
    }
}
