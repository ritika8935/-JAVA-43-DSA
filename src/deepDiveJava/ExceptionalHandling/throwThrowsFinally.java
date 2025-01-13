package deepDiveJava.ExceptionalHandling;

public class throwThrowsFinally {

    public static void tryFunal()throws Exception{
        try{
            throw new Exception();
        }
        finally {
            System.out.println("hello budies");
        }

    }
    public static void main(String[] args)throws Exception {
//        try {
//            System.out.println(10 / 0);
//        }
//        finally{
//            System.out.println("final message");
//        }
        tryFunal();
    }
}
