package deepDiveJava.ExceptionalHandling;



class lowBalanceException extends Exception{
    public String toString(){
        return "balance should not be less than 5000";
    }
}

public class checkedUnchecked {

    public static void fun1(){
        try {
//            System.out.println(10 / 0);
            throw new lowBalanceException();
        }
        catch(lowBalanceException e){
            System.out.println(e);
        }
    }
    public static void  fun2(){
        fun1();
    }
    public static void  fun3(){
        fun2();
    }


    public static void main(String[] args) {
        fun3();
    }
}
