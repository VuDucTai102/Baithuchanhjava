import java.util.Scanner;

public class Nhanvien {

    String ten,mnv;

    final int lcb = 1490000;
    int hsl, tuoi,luong;
    public void nhapthongtin(){
      Scanner sc = new Scanner(System.in);

    System.out.println("Nhap ten nhan vien: ");
    ten = sc.nextLine();
    System.out.println("Nhap ma nhan vien: ");
    mnv = sc.nextLine();
    System.out.println("Nhap so tuoi nhan vien: ");
    tuoi = sc.nextInt();
    System.out.println("Nhap he so luong cua nhan vien; ");
    hsl = sc.nextInt();
    
    }
    public void TinhLuong(){
        luong = lcb * hsl;
    }
    public  void InThongTin(){
        System.out.printf("Nhan vien %s \nMa NV:%s \n%d Tuoi \nHe so luong:%d \nluong = %d",  ten,mnv,tuoi,hsl,luong);
    }
}
