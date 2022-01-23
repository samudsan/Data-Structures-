package recursion;

public class _1_Factorial {
    public static void main(String[] args) {

        System.out.println("factorial of 5 is: "+ fact(5));

    }

    public static int fact(int n) {
        if (n < 1)
            return 1;
        else
            return n*fact(n-1);
    }
}
