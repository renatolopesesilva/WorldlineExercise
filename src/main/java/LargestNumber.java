import java.util.ArrayList;
import java.util.List;

public class LargestNumber {

    public static void main(String[] args) {
        LargestNumber l = new LargestNumber();
        assetEquals("95021", l.largestNumber(new int[]{50, 2, 1, 9}));
        assetEquals("56550", l.largestNumber(new int[]{5, 50, 56}));
        assetEquals("42423420", l.largestNumber(new int[]{420, 42, 423}));
        assetEquals("95021", l.largestNumber(new int[]{9, 2, 50, 1}));
        assetEquals("95021", l.largestNumber(new int[]{1, 50, 2, 9}));
    }

    public String largestNumber(int[] nums) {
        List<String> s = new ArrayList<>();
        for (int num : nums) {
            s.add(String.valueOf(num));
        }
        s.sort((a, b) -> (b + a).compareTo(a + b));
        return String.join("", s);
    }


    private static void assetEquals(String expected, String actual) {
        if (!expected.equals(actual)) {
            throw new AssertionError(String.format("Expected %s but got %s", expected, actual));
        } else {
            System.out.printf("Passed. %s%n", actual);
        }
    }
}