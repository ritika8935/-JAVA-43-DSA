package deepDiveJava.ExceptionalHandling;

//inbuilt Exception--

public class throwThrows  {

    public static int area(int l,int b) throws Exception{
        if(l<0 || b<0)
            throw new Exception();
        return l*b;
    }
    public static void meth1()throws Exception{
        System.out.println("Area is:"+area(2,7));
    }



    public static void main(String[] args)throws Exception {
      meth1();
    }
}
