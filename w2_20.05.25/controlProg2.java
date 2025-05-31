public class controlProg2 {
    public static void main(String[] args) {
        int day = 1;
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Please enter valid day");
        }

        String weekday = "Tuesday";
        switch (weekday) {
            case "Tuesday", "Wednesday" -> System.out.println("7am");
            case "Friday" -> System.out.println("8am");
            default -> System.out.println("Anytime you can wakeup");
        }

        String wd = "Tuesday";
        String result = switch (wd) {
            case "Tuesday", "Wednesday" -> "7am";
            case "Friday" -> "8am";
            default -> "Anytime";
        };
        System.out.println(result);

        int j = 2;
        while (j < 10) {
            System.out.println("I am in loop" + j);
            j++;
        }

        // do while
        do {
            System.out.println("I am in SAE");
        } while (j < 1);

        int b = 10;
        do {
            System.out.println("The value of b : " + b);
            b++;
        } while (b < 5);

        // for (int m = 10; m > 0; m++) {
        // System.out.println(m);
        // }

        int[] number = { 1, 2, 3, 4, 5, 6 };
        String[] name = { "john", "bob", "robin" };

        int[][] n = new int[2][];
        n[0] = new int[2];
        n[1] = new int[3];

        System.out.println("");

    }
}
