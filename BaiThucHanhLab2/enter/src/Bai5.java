import java.util.Scanner; 
public class Slide47 {
    public static void main(String[] args) {
        int tong=0;
        int a;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("nhap vao so:");
            a = scanner.nextInt();
            tong += a;
                 
            if (tong > 100)
                break;
        } while (a > 0);
             
        System.out.println("Tong cac so = " + tong );
    }

}