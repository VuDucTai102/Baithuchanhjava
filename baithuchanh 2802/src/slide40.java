import java.util.Scanner; 
public class Slide40 {
   
    public static void main(String[] args) {
        int ngay;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap so ngay trong tuan");
        ngay = scanner.nextInt();
        switch (ngay){
            case 1:System.out.println("Ngay thu hai");
            break; 
            case 2:System.out.println("Ngay thu ba"); 
            break;
            case 3:System.out.println("Ngay thu tu");
            break; 
            case 4:System.out.println("Ngay thu nam");
            break; 
            case 5:System.out.println("Ngay thu sau");
            break; 
            case 6:System.out.println("Ngay thu bay");
            break; 
            case 7:System.out.println("Ngay chu nhat"); 
            break;
            default: 
            System.out.println("Nhap ngay không hop le.");
        }
    }
}