import java.util.Scanner;

    public class ChuViHinhTron {

        final float PI = 3.14f;
        float r;
        float cv;
        void nhapBanKinh()
        {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap ban kinh r = : ");
        r = scanner.nextFloat();
        }
        void tinhChuVi()
        {
            cv = 2 * r * PI;
        }
        void inChuVi(String name)
     {
        System.out.printf("Chu vi hinh tron: ");
        System.out.printf("----------------------------");
       
     }
}