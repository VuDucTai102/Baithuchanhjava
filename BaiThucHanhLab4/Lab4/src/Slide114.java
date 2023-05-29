import java.util.Map;
import java.util.HashMap;
import java.util.Scanner;

public class  Slide114  {
    public class SinhVien{
     private int maSV;
     private String hoTen;
     private String lop;

     public SinhVien( int maSV, String hoTen, String lop){
        this.maSV = maSV;
        this.hoTen = hoTen;
        this.lop= lop;
     }
    public int getMaSV(){
        return maSV;

    }   
    public String getHoTen(){
        return hoTen;
    }
    public String getLop(){
        return lop;
    } 
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in); 
        Map<String, SinhVien> danhSachSinhVien = new HashMap<>();

        System.out.print("Nhap so uong sinh vien:");
        int n = scanner.nextInt();
        
        scanner.nextLine();


        for (int i = 1; i <= n; i++){
        System.out.print("Nhap ma sinh vien cua sinh vien thu" + i + " : ");
        int maSV = scanner.nextInt();
        
        System.out.print("Nhap ho ten cua sinh vien thu" + i + " : ");
        String hoTen = scanner.nextLine();

        System.out.print("Nhap lop cua sinh vien thu" + i + " : ");
        String lop = scanner.nextLine();

       
        danhSachSinhVien.put(maSV, new SinhVien(maSV, hoTen, lop));
    }

    System.out.print("Nhap lop can tim: ");
    String lopCanTim = scanner.nextLine();
    System.out.println("Danh sach sinh vien thuoc lop " + lopCanTim + ":");
    for (Map.Entry<String, SinhVien> entry : danhSachSinhVien.entrySet()) {
        SinhVien sv = entry.getValue();
        if (sv.getLop().equals(lopCanTim)) {
            System.out.println(sv.getMaSV() + " - " + sv.getHoTen() + " - " + sv.getLop());
        }
    }

    System.out.print("Nhap ma sinh vien can tim: ");
    String maSvCanTim = scanner.nextLine();
    SinhVien svCanTim = danhSachSinhVien.get(maSvCanTim);
     if (svCanTim != null) {
        System.out.println("Thong tin cua sinh vien voi ma  " + maSvCanTim + ": " + svCanTim.getHoTen() + " - " + svCanTim.getLop());
    
     else System.out.println("Khong tim thay sinh vien voi ma " + "maSvCanTim");
        
      }
}
    }
}