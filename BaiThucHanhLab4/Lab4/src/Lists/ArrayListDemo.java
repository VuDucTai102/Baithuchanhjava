package Lists;
import java.util.Scanner;
import java.util.ArrayList;
import Student.Student;


    
public class ArrayListDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Student> std = new ArrayList<>();
        Student st = new Student();

        do {
            System.out.println("===Quan ly sinh vien===");
            System.out.println("1. Tao danh sach sinh vien");
            System.out.println("2. Them sinh vien");
            System.out.println("3. Sua thong tin sinh vien");
            System.out.println("4. In thong tin toan bo danh sach sinh vien");
            System.out.println("5. Xoa mot sinh vien");
            System.out.println("0. Ket thuc");
            System.out.print(" Nhap thao tac : ");
            String chon = sc.nextLine();
            switch (chon) {
                case "1":
                    System.out.println("===Nhap thong tin===");
                    System.out.print("Nhap so luong sinh vien: ");
                    int n = Integer.parseInt(sc.nextLine());
                    st.NhapThongTin(std, n, sc);
                    break;
                case "2":
                    st.ThemSinhVien(std);
                    break;
                case "3":
                    st.SuaThongTin(std, sc);
                    break;
                case "4":

                    st.HienThiThongTin(std);
                    break;
                case "5":
                    st.XoaSinhVien(std, sc);
                    break;
                default:
                    System.out.println("Thao tac sai, vui long nhap lai!");
                    System.out.println("");
                    break;
            }
            if (chon.equals("0")) {
                System.exit(0);
            }
        } while (true);
    }
}

