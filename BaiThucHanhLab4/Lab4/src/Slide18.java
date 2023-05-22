import java.util.ArrayList;
import java.util.ListIterator;
import java.util.Iterator;


public class Slide18 {
    public static void main(String[] args) {
        ArrayList<Float> arrList = new ArrayList<>();
        arrList.add (0.7f);
        arrList.add (7.26f);
        arrList.add (1.02f);
        arrList.add (9.3f);
    
        Iterator<Float> iterator = arrList.iterator();
        
        System.out.println("Cac phan tu co trong arrList la: ");
        while (iterator.hasNext()){
            System.out.print(iterator.next()+"\t");
        }
      }
    }
     