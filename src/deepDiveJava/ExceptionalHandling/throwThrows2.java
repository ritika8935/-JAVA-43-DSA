package deepDiveJava.ExceptionalHandling;

//Own Exception object--
class NegativeDimensionException extends Exception{
    public String toString(){
        return "Dimension cannot be negative!";
    }
}

public class throwThrows2 {
    public static int area(int l,int b) throws NegativeDimensionException{
        if(l<0 || b<0)
            throw new NegativeDimensionException();
        return l*b;
    }
    public static void meth1()throws NegativeDimensionException{
        System.out.println("Area is:"+area(-2,7));
    }



    public static void main(String[] args)throws NegativeDimensionException {
        meth1();
    }
}
