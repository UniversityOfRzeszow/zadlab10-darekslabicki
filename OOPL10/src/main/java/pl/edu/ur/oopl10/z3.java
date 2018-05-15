package pl.edu.ur.oopl10;

public class z3 {

    public static void dzielenie() {
        int a = 10;
        int b = 0;
        try {
            int c = a / b;
        } catch (ArithmeticException e) {
            System.err.println("Dzielenie przez 0");
        }
    }

}
