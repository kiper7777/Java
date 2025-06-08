class demo {
    private int num1, num2;

    public demo(int a, int b) {
        this.num1 = a;
        this.num2 = b;
        System.out.println(this.num1);
        System.out.println(this.num2);
    }
}

public class demoOne {
    public static void main(String[] args) {
        demo ob = new demo(10, 20);
        demo ob1 = new demo(100, 200);

        int res = ob.add();
        System.out.println("the addition: " + res);

        int re = ob1.add();
        System.out.println("the addition: " + re);
    }
}
