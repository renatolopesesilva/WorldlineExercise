public class LargestNumber {

    public static void main(String[] args) {
        LargestNumber l = new LargestNumber();
        String test1 = l.largestNumber( new int[]{50,2,1,9});
        String test2 = l.largestNumber( new int[]{5,50,56});
        String test3 = l.largestNumber( new int[]{420,42,423});

        assetEquals( "95021", test1 );
        assetEquals( "56550", test2 );
        assetEquals( "42423420", test3);
    }

    public String largestNumber(int[] nums) {



        return "";
    }


    private static void assetEquals(String expected, String actual) {
        if (!expected.equals(actual)) {
            throw new AssertionError(String.format("Expected %s but got %s", expected, actual));
        } else {
            System.out.println("Passed");
        }
    }
}