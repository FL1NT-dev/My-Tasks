import java.util.function.Supplier;

public class Solution {
    public static void main(String[] args) {
        Supplier<Character> supplier = makeLooper("abc");
        System.out.println(supplier.get());
        System.out.println(supplier.get());
        System.out.println(supplier.get());
        System.out.println(supplier.get());
    }
    static Supplier<Character> makeLooper(String str) {
        int[] index = {0};
        return () -> {
            char c = str.charAt(index[0]);
            index[0] = (index[0] + 1) % str.length();
            return c;
        };
    }
}