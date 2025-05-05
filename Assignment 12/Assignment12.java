public class Assignment12 {
    public static int recursiveFibonacci(int n) {
        if (n <= 1) return n;
        return recursiveFibonacci(n - 1) + recursiveFibonacci(n - 2);
    }
    public static int iterativeFibonacci(int n) {
        if (n <= 1) return n;
        int actual = 1;
        int prev = 1; 
        for (int i = 2; i <= n; i++) {
            int temp = actual;
            actual += prev;
            prev = temp;
        }
        return actual;
    }

    public static String recursiveDecimalToBinary(int n) {
        if (n == 0) return "0";
        return recursiveDecimalToBinary(n / 2) + (n % 2);
    }

    public static String iterativeDecimalToBinary(int n) {
        if (n == 0) return "0";
        String output = "";
        while (n > 0) {
            output += (n % 2);
            n /= 2;
        }
        return output.toString();
    }
}
