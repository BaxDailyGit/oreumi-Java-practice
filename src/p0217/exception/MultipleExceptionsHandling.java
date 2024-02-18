package p0217.exception;

public class MultipleExceptionsHandling {
    public static void main(String[] args) {
        try {
            int[] arr = new int[5];
            arr[10] = 30 / 0; // ArrayIndexOutOfBoundsException과 ArithmeticException 발생
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException 캐치: " + e.getMessage());
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException 캐치: " +
                    e.getMessage());
        } catch (Exception e) {
            System.out.println("Exception 캐치: " + e.getMessage());
        }
    }
}