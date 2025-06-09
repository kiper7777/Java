class C {
    private int a;
    private int b;

    public C(int num) {
        a = num;
        b = 0;
        System.out.println("Конструктор с 1 параметром вызван");
    }

    public void printValues() {
        System.out.println("Значение a: " + a);
        System.out.println("Значение b: " + b);
    }
}

public class DemoCons1 {
    public static void main(String[] args) {
        C ob = new C(10);
        ob.printValues();
    }
}
