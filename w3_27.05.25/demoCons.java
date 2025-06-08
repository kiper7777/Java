class A {
    private int a;
    private int b;

    public void setValue(int num1, int num2) {
        a = num1;
        b = num2;
        System.out.println("the value of a is: " + a);
        System.out.println("the value of b is: " + b);
    }
}

public class demoCons {
    public static void main(String[] args) {
        A ob = new A();
        ob.setValue(10, 20);
    }
}
