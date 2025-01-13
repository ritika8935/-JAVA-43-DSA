package deepDiveJava.ExceptionalHandling;

public class nestedTryCatch {
    public static void main(String[] args) {
        int arr[] = {2, 0, 8, 10, 24};
        try {
            int res = arr[0] / arr[3];
            System.out.println(res);
            try {
                System.out.println(arr[5]);
            }
            catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("index not valid");
            }
            }
        catch (ArithmeticException e) {
                System.out.println("dominator should not divide by 0");
            }
            System.out.println("bye");
    }
}
