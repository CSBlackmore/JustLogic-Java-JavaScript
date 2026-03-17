package exercises;

public class AbsoluteValue {
    public static int absValue(int n) {
    
        return (n < 0) ? n * -1 : n;
    }

    public static void main(String[] args) {
        System.out.println(absValue(-5)); // 5
        System.out.println(absValue(10)); // 10
    }
}
