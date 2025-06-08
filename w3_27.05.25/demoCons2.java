class A {
    private int a;
    private int b;

    public A() {
    }

    public A(int num) {
        a = num;
        System.out.println(a);
    }

    public A(int num1, int num2) {
        a = num1;
        b = num2;
        System.out.println("the value of A is: " + a);
        System.out.println("the value of B is: " + b);
    }

    // Method overloading
    public void add(int n, int m) {

    }

    public float add(float m,float b)
    {
        float result=
    }
}

public class demoCons2 {
    public static void main(String[] args) {
        A ob = new A(10);
        A ob1 = new A();
        A ob3 = new A(10, 20);

    }
}
