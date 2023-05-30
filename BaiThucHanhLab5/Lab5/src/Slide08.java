public class Slide08 {
    public class TestMultipleCatchBlock{

        public static void main(String args[]){
            try{
                 int a[] = new int[5];
                 
            } catch(Exception e){
                System.out.println("common task completed");
            }
            catch(ArithmeticException e){
                System.out.println("task 1 is completed");
            }
            catch(ArrayIndexOutOfBoundsException e){
                System.out.println("task 2 is completed");
            }
            System.out.println("rest of the code. . .");
        }
    }
    
}
