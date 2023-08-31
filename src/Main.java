public class Main {
    public static void main(String[] args) {
        System.out.println(max(2, 5, 3)); // -> 5
        System.out.println(max(-1,0,1)); // -> 1
        System.out.println(max(3,2,1)); // -> 3
        System.out.println(otherMax(3,9,6)); // -> 9
        System.out.println(otherMax(-3,-1,-2)); // -> -1
        System.out.println(Integer.MAX_VALUE + Integer.MIN_VALUE); // -> -1
        System.out.println(random(2, 5));
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

    public static int random(int lowerBound, int upperBound) {
        return lowerBound + (int) (Math.random() * (upperBound - lowerBound + 1));
    }
}
