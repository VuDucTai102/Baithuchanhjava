import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class Slide113 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        HashSet<String> fruits = new HashSet<>();
        System.out.print("Nhap ten cac loai trai cay: ");
        String[] inputFruits = scanner.nextLine().split(" ");
        for (String fruit : inputFruits) {
            fruits.add(fruit);

        }
        System.out.println("So phan tu co trong HashSet: " + fruits.size());

        System.out.print("Nha ten mot loai trai cay: ");
        String fruitToFind = scanner.nextLine();
        if (fruits.contains(fruitToFind)) {
            System.out.println("Da tim thay " + fruitToFind + " trong HashSet.");
        } 

         else {
            System.out.println("Khong tim thay " + fruitToFind + " trong HashSet.");
        }

        System.out.print("Nhap ten mot loai trai cay de xoa: ");
        String fruitToDelete = scanner.nextLine();
        if (fruits.remove(fruitToDelete)) {
            System.out.println("Da xoa " + fruitToDelete + " khoi HashSet.");
        } 
        
        else {
            System.out.println(fruitToDelete + " khong co trong HashSet.");
        }

        System.out.println("Cac phan tu con lai co trong HashSet: " + fruits);

        List<String> fruitList = new ArrayList<>(fruits);
        fruitList.add("Dau");
        fruitList.add("Chuoi");
        fruits.addAll(fruitList);
        System.out.println("HashSet sau khi them cac phan tu cua List:");
        Iterator<String> iterator1 = fruits.iterator();
        while (iterator1.hasNext()) {
            System.out.println(iterator1.next());
        
        }

        fruitList.removeAll(fruits);
        fruits.removeAll(fruitList);
        System.out.println("HashSet sau khi xoa cac phan tu cua List:");
        Iterator<String> iterator2 = fruits.iterator();
        while (iterator2.hasNext()) {
            System.out.println(iterator2.next());
        }
    }
}

