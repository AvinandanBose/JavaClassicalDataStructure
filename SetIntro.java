import java.util.Set;
import java.util.HashSet;
public class SetIntro {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<Integer>();
        set.add(1);
        set.add(2);
        Set<Integer> set1 = new HashSet<Integer>();
        set1.add(3);
        set1.add(4);
        set.addAll(set1);
        System.out.println(set);

    }
}
