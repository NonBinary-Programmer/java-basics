public class Main {
    public static void main(String[] args) {
        System.out.println(max(2, 5, 3));
        System.out.println(max(-1,0,1));
        System.out.println(max(3,2,1));
        System.out.println(otherMax(3,9,6));
        System.out.println(otherMax(-3,-1,-2));
        System.out.println(Integer.MAX_VALUE + Integer.MIN_VALUE);
    }

    public static int max(int a, int b, int c) {
        if (a > b) {
            if (a > c){
                return a;
            }
        } else if (b > c) {
            return b;
        }
        return c;
    }

    public static int otherMax(int a, int b, int c) {
        return Math.max(Math.max(a,b),c);
    }
}
