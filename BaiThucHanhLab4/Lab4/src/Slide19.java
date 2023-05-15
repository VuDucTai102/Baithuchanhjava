
import java.util.ArrayList;
import java.util.ListIterator;

public class Slide19 {
    public static void main(String[] args) {
        ArrayList<Character> arrList = new ArrayList<>();
        arrList.add ('a');
        arrList.add ('e');
        arrList.add ('b');
        arrList.add ('c');

        ListIterator<Character> listIterator = arrList.listIterator();
        System.out.println("Cac phan tu co trong arrListChar la: ");
        while(listIterator.hasNext() ){
            System.out.print(listIterator.next() + "\t" );
        }
}
}

