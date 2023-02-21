//Viết chương trình nhập vào 1 số nguyên n bất kỳ(n>0) và tính tổng các chữ số của số đó
import java.util.Scanner;
public class timsonguyen {
   public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int myNumber, sumDigit = 0;
    System.out.println("Nhap vao so nguyen:");
    myNumber = sc.nextInt();
    
    while(myNumber > 0)
    {
        sumDigit += myNumber%10;
        myNumber = myNumber/10;

    }
    System.out.println("Tong cac chu so la=" +sumDigit);
    // throw Exception;
    }

}