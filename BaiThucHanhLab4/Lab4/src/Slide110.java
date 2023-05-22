import java.util.ArrayList;
import java.util.Scanner;


public class Slide110 {
    public static void main(String[] args) {
        ArrayList<Integer> arrlist = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int number;

        System.out.print("Nhap kich thuoc cua mang: ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.printf("Nhap vao phan tu a[%d]: ", i);
            number = sc.nextInt();
            arrlist.add(number);
        }
        System.out.print("Phan tu trong mang la: ");
        for (Integer integer : arrlist) {
            System.out.print(integer + "\t");
        }

        int max = arrlist.get(0);
        for(int i = 0 ; i < arrlist.size(); i++ ){
        if( arrlist.get(i).compareTo(max)>0){
            max = arrlist.get(i);
        }
       }
        System.out.println("\nPhan tu lon nhat trong mang la:" + max);

            System.out.println("");
            arrlist.sort((o1, o2) -> o2 - o1);
            System.out.print("Sap xep giam dan: ");
            for (Integer integer : arrlist) {
                System.out.print(integer + "\t");
        }
          
        
        System.out.print("\nNhap so nguyen muon xoa: ");
        int tim = sc.nextInt();
        for (int i = arrlist.size() - 1; i >= 0; i--) {
            if (arrlist.get(i) == tim) {
            arrlist.remove(i);
            } else {
                System.out.println("so vua nhap khong co trong danh sach");
            } 
              sc.close();
            }
        }

}



    