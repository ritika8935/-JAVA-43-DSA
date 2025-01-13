package deepDiveJava.ExceptionalHandling;

public class multipleTryCatch {
    public static void main(String[] args) {
        int arr[]={2,0,8,10,24};
        try {
            int res = arr[0] / arr[3];
            System.out.println(res);
            System.out.println(arr[5]);
        }
        catch(ArithmeticException e){
            System.out.println("Denominator should not be 0");
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Index is invalid");
        }
        System.out.println("bye");
    }
}
