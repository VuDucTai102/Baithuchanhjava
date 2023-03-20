// Nhap vao 2 so bat ky tu ban phim va thuc hien yeu cau:
// 1.Tinh tong, hieu,tich, thuong, chia lay du cua 2 so do.
// 2. Su dung các toan tu so sanh da hoc de so sanh 2 so do.
package BaiThucHanhLab2;

import java.text.DecimalFormat;
import java.util.Scanner;
 
 public class Bai1{
     
 
     public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        DecimalFormat decimalFormat = new DecimalFormat("#.##");

        System.out.println("Nhap vao so thu nhat:");
        int firstNumber = scanner.nextInt();
        System.out.println("Nhap vao so thu hai:");
        int secondNumber = scanner.nextInt();

     //1.Tinh tong, hieu,tich, thuong, chia lay du cua 2 so do.
      
      int tong= firstNumber + secondNumber;
      System.out.println(firstNumber + "+" + secondNumber + "=" + tong);
 
      int hieu= firstNumber - secondNumber;
      System.out.println(firstNumber + "-" + secondNumber + "=" + hieu);

      int tich= firstNumber * secondNumber;
      System.out.println(firstNumber + "*" + secondNumber + "=" + tich);

      float thuong= (float) firstNumber / (float) secondNumber;
      System.out.println(firstNumber + "/" + secondNumber + "=" + thuong);

      int phanDu= firstNumber % secondNumber;
      System.out.println(firstNumber + "%" + secondNumber + "=" + phanDu);

     // 2. Su dung các toan tu so sanh da hoc de so sanh 2 so do. 
        
      System.out.println("Ket qua so sanh bang cua 2 so " + firstNumber + " va " + secondNumber + " la " + (firstNumber == secondNumber));
      System.out.println("Ket qua so sanh khong bang cua 2 so " + firstNumber + " va " + secondNumber + " la " + (firstNumber != secondNumber));
      System.out.println("Ket qua so sanh lon hon cua 2 so " + firstNumber + " va " + secondNumber + " la " + (firstNumber > secondNumber));
      System.out.println("Ket qua so sanh lon hon hoac bang cua 2 so " + firstNumber + " va " + secondNumber + " la " + (firstNumber >= secondNumber));
      System.out.println("Ket qua so sanh nho hon cua 2 so " + firstNumber + " va " + secondNumber + " la " + (firstNumber < secondNumber));
      System.out.println("Ket qua so sanh nho hon hoac bang cua 2 so " + firstNumber + " va " + secondNumber + " la " + (firstNumber <= secondNumber));

     
 }
}