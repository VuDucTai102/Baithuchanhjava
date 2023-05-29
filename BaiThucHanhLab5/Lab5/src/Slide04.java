
public class Slide04 {
    



class MyUncheckedException extends RuntimeException{
    public MyUncheckedException(String msg){
        super(msg);

    }
    public static void main(String[] args){
        UncheckedExceptionDemo.testUncheckException();

    }
    public static void testUncheckException() throws MyUncheckedException{
        System.out.println("Unchecked exception demo");
    }
}
}