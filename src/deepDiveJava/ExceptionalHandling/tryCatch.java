package deepDiveJava.ExceptionalHandling;
import java.util.Scanner;

public class tryCatch {
    public static void main(String[] args) {
        int a,b,c;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter two number:-");
        a=sc.nextInt();
        b=sc.nextInt();
        try{
            c=a/b;
            System.out.println("division is: "+c);
        }
        catch(ArithmeticException e){
            System.out.println(e);
        }
        System.out.println("bye");
    }
}
