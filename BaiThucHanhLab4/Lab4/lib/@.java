package BaiThucHanhLab4.Lab4.lib;

  import java.util.ArrayList;
import java.util.Scanner;

class Student {
    private String name;
    private String id;
    private double gpa;
    
    public Student(String name, String id, double gpa) {
        this.name = name;
        this.id = id;
        this.gpa = gpa;
    }
    
    public String getName() {
        return name;
    }
    
    public String getId() {
        return id;
    }
    
    public double getGpa() {
        return gpa;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public void setId(String id) {
        this.id = id;
    }
    
    public void setGpa(double gpa) {
        this.gpa = gpa;
    }
}

public class main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Student> students = new ArrayList<>();
        int n;
        
        // Nhập số lượng sinh viên (n)
        System.out.print("Nhập số lượng sinh viên: ");
        n = scanner.nextInt();
        
        // Nhập thông tin sinh viên và thêm vào danh sách (ArrayList)
        for (int i = 0; i < n; i++) {
            System.out.println("Nhập thông tin sinh viên thứ " + (i+1));
            System.out.print("Họ tên: ");
            String name = scanner.next();
            System.out.print("Mã số sinh viên: ");
            String id = scanner.next();
            System.out.print("Điểm trung bình: ");
            double gpa = scanner.nextDouble();
            
            Student student = new Student(name, id, gpa);
            students.add(student);
        }
        
        // Hiển thị danh sách sinh viên
        System.out.println("Danh sách sinh viên:");
        for (Student student : students) {
            System.out.println("Họ tên: " + student.getName() + ", Mã số sinh viên: " + student.getId() + ", Điểm trung bình: " + student.getGpa());
        }
        
        // Tìm sinh viên theo mã số và sửa thông tin sinh viên đó
        System.out.print("Nhập mã số sinh viên cần sửa thông tin: ");
        String searchId = scanner.next();
        for (Student student : students) {
            if (student.getId().equals(searchId)) {
                System.out.println("Tìm thấy sinh viên cần sửa thông tin");
                System.out.print("Nhập Họ tên mới: ");
                String newName = scanner.next();
                System.out.print("Nhập Điểm trung bình mới: ");
                double newGpa = scanner.nextDouble();
                student.setName(newName);
                student.setGpa(newGpa);
                System.out.println("Sửa thông tin sinh viên thành công");
                break;
            }
        }
        
        // Tìm sinh viên theo mã số và xoá sinh viên đó khỏi danh sách
        System.out.print("Nhập mã số sinh viên cần xoá: ");
        String deleteId = scanner.next();
        for (Student student : students) {
            if (student.getId().equals(deleteId)) {
                students.remove(student);
                System.out.println("Xoá sinh viên khỏi danh sách thành công");
                break;
            }
        }
    }
}
  

