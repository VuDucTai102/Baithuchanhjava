import java.util.LinkedList;
import java.text.DecimalFormat;
import java.util.Scanner;


public class Slide111 {
    public static void main(String[] args) {
        int n, node, sum = 0, count = 0;
        double TrungBinhCong;
        
       
        DecimalFormat dcF = new DecimalFormat("$###,###.##");
        Scanner scanner = new Scanner(System.in);
        LinkedList<Integer> linkedList = new LinkedList<>();
             
        System.out.println("Nhap vao so phan tu cua danh sach: ");
        n = scanner.nextInt();
             
        for (int i = 0; i < n; i++) {
            System.out.println("Nhap vao phan tu thu " + i + ": ");
            node = scanner.nextInt();
            linkedList.add(node);
        }
             
        for (int i = 0; i < n; i++) {
            if (linkedList.get(i) % 2 == 0) {
                sum += linkedList.get(i);
                count++;    // biến lưu trữ số các số chẵn
            }
        }
             
        TrungBinhCong = (double)sum / count;
        System.out.println("Trung binh cong cua cac so chan trng danh sach = ") ;
        dcF.format(TrungBinhCong);   
    }
}
