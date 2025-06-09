class demo1 {
    private int num1, num2;

    // Конструктор
    public demo1(int a, int b) {
        this.num1 = a;
        this.num2 = b;
        System.out.println("num1: " + this.num1);
        System.out.println("num2: " + this.num2);
    }

    // Метод для сложения
    public int add() {
        return num1 + num2;
    }
}

public class demoOne {
    public static void main(String[] args) {
        demo1 ob = new demo1(10, 20);
        demo1 ob1 = new demo1(100, 200);

        int res = ob.add();
        System.out.println("The addition: " + res);

        int re = ob1.add();
        System.out.println("The addition: " + re);
    }
}
