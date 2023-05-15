import java.util.ArrayList;
import java.util.ListIterator;

public class Slide16 {
    
    public static void main(String[] args) throws Exception {
        ArrayList<String> arrList = new ArrayList<>();
        arrList.add ("JAVA");
        arrList.add ("PHP");
        arrList.add ("C#");
        arrList.add ("C++");
        
        System.out.print("Cac phan tu co trong arrList la:");
        for ( int i = 0; i < arrList.size(); i++){
            System.out.print(arrList.get(i)+"\t");
        }
}
}
