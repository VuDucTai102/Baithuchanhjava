package Shapes;

import java.util.Scanner;

    public class HinhTron extends HinhHoc{

        final float PI = 3.14f;
        float r;
        float cv;
        float dt;
        {
         ten = "Hình Tròn";
        }
         public void nhapBanKinh() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap ban kinh r = : ");
        r = scanner.nextFloat();
        }
         public void tinhChuVi()
        {
            cv = 2 * r * PI;
        }
         public void tinhDienTich(){
           dienTich = r*r * PI;
        }
        public void inChuVi(String name)
     {
        System.out.printf("Chu vi hinh tron: ");
        System.out.printf("Dien tinh hinh tron");
       
     }
}