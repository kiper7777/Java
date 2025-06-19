import java.util.ArrayList;
import java.util.Comparator;

public class arraylist {
    public static void main(String[] args) {
        ArrayList<Integer> num = new ArrayList<>();

        num.add(8);
        num.add(40);
        num.add(24);
        num.add(120);
        num.add(75);
        num.sort(Comparator.naturalOrder());
        System.out.println(num);
    }

}
