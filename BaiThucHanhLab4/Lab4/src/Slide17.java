import java.util.ArrayList;

public class Slide17 {

    public static void main(String[] args){

        ArrayList<Integer> arrayListInteger = new ArrayList<>();

    // Them cac phan tu su dung phuong thuc add ()
    arrayListInteger.add(0);
    arrayListInteger.add(7);
    arrayListInteger.add(1);
    arrayListInteger.add(9);

    System.out.println(" Cac phan tu co trong arrListInteger la:");
     for (int  number : arrayListInteger){
        System.out.print(number + "\t");
     }
    }
    
}
