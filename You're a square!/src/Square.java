public class Square {
    public static void main(String[] args) {
        System.out.println(isSquare(202771585));
    }

    public static boolean isSquare(int n) {

       return (int)Math.sqrt(n) * (int)Math.sqrt(n) == n;
    }

}
