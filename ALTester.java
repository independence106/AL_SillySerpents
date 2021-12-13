import java.util.ArrayList;

public class ALTester {
    public static boolean sorted(ArrayList<Integer> data) {
        for (int i = 0; i < data.size() - 1; i++) {
            if (data.get(i) > data.get(i + 1)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        ArrayList<Integer> e = new ArrayList<Integer>();
        e.add(3);
        e.add(3);
        e.add(3);
        e.add(3);
        e.add(3);
        e.add(3);
        e.add(3);
        System.out.println(sorted(e));
    }
}