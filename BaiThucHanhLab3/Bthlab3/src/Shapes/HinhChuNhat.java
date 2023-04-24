package Shapes;
import java.util.Scanner;

public class HinhChuNhat extends HinhHoc {

    float dai;  // Chiều dài
    float rong; // Chiều rộng
    float cv;   // Chu vi
    float dt;   // Diện tích

    public HinhChuNhat(){
        ten = "Hình Chữ Nhât";
    }

    public void nhapChieuDai() {
        System.out.println( "Hãy nhập vào Chiều dài Hình chữ nhật:");
        Scanner scanner = new Scanner(System.in);
        dai = scanner.nextFloat();

    };

    public void nhapChieuRong() {
        System.out.println( "Hãy nhập vào Chiều rộng Hình chữ nhật:");
        Scanner scanner = new Scanner(System.in);
        dai = scanner.nextFloat();

    }
    
    public void tinhChuVi(){
        cv = 2 * (dai + rong);

    }
    public void tinhDienTich(){
        dt = dai * rong;
    }
    public void inChuVi(){
        System.out.println("Chu vi Hình chữ Nhật: " + cv);
    }
    public void inDienTich(){
        System.out.println("Diện tích Hình chữ Nhật: " + dt);

    }
 }
