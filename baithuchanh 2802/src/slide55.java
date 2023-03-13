import java.util.Scanner; 
public class Slide55 {
    public static void main(String[] args) {
        System.out.println("Cac so chia het cho 5 la: ");
        int i=0, n=200;     
        for (; i <= n; i++) {
            if (i % 5 != 0) {
                continue;
            }
                 
            System.out.println(i);
        }
    }
} 