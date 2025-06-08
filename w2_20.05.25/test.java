import java.util.Arrays;

public class test {
    public static void main(String[] args) {
        // int x = 10;
        // if (x == 20) {
        // System.out.println("hello");
        // } else {
        // System.out.println("hi");
        // }

        boolean x1 = true;
        if (x1 = false) {
            System.out.println("hello");
        } else {
            System.out.println("hi");
        }

        boolean x2 = false;
        if (x2 == false) {
            System.out.println("hello");
        } else {
            System.out.println("hi");
        }

        int[] no = { 1, 2, 3, 4 };
        System.out.println(no.getClass().getName());

        int[] num = new int[4];
        num[0] = 99;
        num[1] = 11;
        num[2] = 111;
        num[3] = 1;
        System.out.println(num);
        Arrays.sort(num);
        System.out.println(Arrays.toString(num));

        int[] z = new int[3];
        System.out.println(z);
        System.out.println(z[0]);

        int[][] p = new int[2][3];
        System.out.println(p);
        System.out.println(p[0][0]);

    }

}
