public class example {
    public static void main(String[] args) {
        int n = 5;
        if ((n == 10) || n < 10) {
            if (n < 10) {
                System.out.println("the value of n is 10");
            }
            if (n < 6) {
                System.out.println("the value of n even less than 6 as well.");
            }
        } else {
            System.out.println("The value of n is greater than 10");
        }

        for (int i = 0; i < 10; i++) {
            if (i == 5) {
                System.out.println("break from if");
                break;
            }
            System.out.println(i);
        }

        System.out.println("odd numbers are  ");
        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0)
                continue;
            else
                System.out.println(i);
        }
        System.out.println("from 1 to 10");

        int m = 10;
        String msg = m > 5 ? "m is greater than 5" : "m is not greater than 5";
        System.out.println(msg);

        int p = 2;
        String msg2 = p > 5 ? "p is greater than 5" : (p > 2 ? "p is greater than 2" : "p is not greater than 2");
        System.out.println(msg2);

    }

}
