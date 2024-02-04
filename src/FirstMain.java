import java.util.Arrays;

import static com.sun.org.apache.xalan.internal.lib.ExsltStrings.split;

public class FirstMain {
    public static void main(String[] args) {

        FirstMain firstMain = new FirstMain();
        double result = firstMain.add(1, 2);
        System.out.println(result);
        double result2 = firstMain.divide(1, 2);
        System.out.println(result2);
    }

    double add(int a, int b) {
        double result;
        result= a + b;
        return result;
    }
    double divide(int a, int b) {
        return (double) a / b;
    }

}

