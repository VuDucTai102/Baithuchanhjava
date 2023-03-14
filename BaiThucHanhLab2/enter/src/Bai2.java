// Viet chuong trinh kiem tra  so vua nhap vao la so chan hay le.
package BaiThucHanhLab2;


import java.util.Scanner;
 
 public class Bai2{
    public static void main(String[]args){
        int number;
        int x;
        Scanner scanner = new Scanner(System.in);

        System.out.println(x: "Nhap so nguyen:" ); 
        int number = scanner.nextInt();
        // so chan chia het cho 2
    if (number % 2 == 0){
        System.out.println(number + "la so chan,");
        // nguoc lai la so le
    } else{
        System.out.println(number + "la so le,");  
    }

    scanner.close();
    }
 }    