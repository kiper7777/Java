public class forloop {
    public static void main(String[] args) {
        // int b = 10;
        // while (b < 10) {
        // System.out.println("hi");
        // b++;
        // }

        int b = 10;
        do {
            System.out.println("The value of b : " + b);
            b++;
        } while (b < 5);

        int[] num = { 1, 2, 3, 4, 5, 6 };
        for (int k = 0; k < num.length; k++) {
            System.out.println(num[k]);
        }

        String[] arr = { "tom", "tim", "John", "Simon" };
        for (String arrele : arr) {
            System.out.println(arrele);
        }

        int[] element = { 1, 2, 3, 4, 5 };
        for (int ele : element) {
            System.out.println(ele);
        }
    }
}
