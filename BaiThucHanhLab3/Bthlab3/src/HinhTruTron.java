import java.util.Scanner;


class HinhTruTron {

    final float PI = 3.14f;
     float r;
     float chieuCao;
     float chuVi; 
     float dienTich; 
     float theTich;
       

     public void nhapChieuCao() {
        
        System.out.println("Chieu cao = ");
        Scanner scanner = new Scanner(System.in);
        chieuCao = scanner.nextFloat();
     }
     {
     Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap ban kinh r = : ");
        r = scanner.nextFloat();
     }

      void tinhChuVi()
      { 
      chuVi = 2 * r * PI;
      }
      void tinhDienTich()
      {
       dienTich = r * r * PI;
        
      }
      void theTich()
      {
        theTich = dienTich * chieuCao;
      }

      public void inthongtin(){
        System.out.printf("Chu vi hình trụ tròn là: %f", chuVi);
        System.out.printf("\nDiện tích hình trụ tròn là: %f", dienTich);
        System.out.printf("\nThể tích hình trụ tròn là: %f", theTich);

      }
        
    }
        
    

    

