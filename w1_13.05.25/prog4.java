public class prog4 {
    public static void main(String[] agrs) {
        System.out.println("hello world");
        subprog sp = new subprog();
        sp.printmsg();
    }
}

class subprog {
    public void printmsg() {
        System.out.println("I am under function");
    }

}
