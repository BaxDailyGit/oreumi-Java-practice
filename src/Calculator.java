public class Calculator {
    int postfixOperator(int a) {
        return ++a;
    }

    public static void main(String[] args) {
        int a = 1;
        Calculator calculator = new Calculator();
        a = calculator.postfixOperator(a);
        System.out.println(a);
    }
}