/**
 * Comparing values of two objects in a Java generic class
 */
public class Generics {

    @SuppressWarnings("unchecked")
    private static <E extends Comparable> E compareObjects(E a, E b) {
        if (a.compareTo(b) > 0)
            return a;
        else
            return b;
    }

    public static void main(String[] args) {
        String a = "Hello";
        String b = "Jack";

        /* Out */
        System.out.println("The larger value is: " + compareObjects(a, b)); // The larger value is: Jack
    }
}
