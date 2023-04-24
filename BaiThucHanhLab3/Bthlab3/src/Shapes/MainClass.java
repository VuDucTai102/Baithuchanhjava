package Shapes;

public class MainClass {

    public static void main (String[] args){
        // Khởi tạo đối tượng hinhTron từ lớp HinhTron

        HinhTron hinhTron = new HinhTron();
         
        // set bán kính cho hinhTron thông qua phương thức setter
        hinhTron.setBanKinh(10);

        // Các tính toán khác 

        float chuVi = hinhTron.tinhChuVi();
        float dienTich = hinhTron.tinhDienTich();
         
        System.out.println("Chu vi hinh tron:" + chuVi + "; Và dien tich:" + dienTich + "" );
    }
    
}
