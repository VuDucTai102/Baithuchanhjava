//Viết chương trình thực hiện các công việc sau:
//Nhập liệu cho mảng A có n phần tử nguyên từ bàn phím. Sắp xếp mảng số đã nhập tăng dần theo giá trị của các phần tử có trong mảng. In ra màn hình mảng số ban đầu và mảng đã sắp xếp theo thứ tự tăng dần.

import java.util.Scanner;

public class Bai11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, i, j;
        do{
            System.out.print("Nhap vao kich thuoc cua mang: ");
            n = sc.nextInt();
        }while(n <= 0);

        int arrA[] = new int [n];
        for(i = 0; i< n; i++){
            System.out.printf("Nhap vao gia tri thu %d: ", i+1);
            arrA[i] = sc.nextInt();
        }
        System.out.print("Mang ban dau la: " );
        for (i = 0; i < n; i++) {
            System.out.print(arrA[i] +" ");
        }

        int min = arrA[0];
        for(i = 0; i < n-1; i++){
            for(j= i + 1; j < n; j++){
                if( arrA[i] > arrA[j]){
                    min = arrA[i];
                    arrA[i] = arrA[j];
                    arrA[j] = min; 
                }
            }
        }
        System.out.println();
        System.out.print("Mang da sap xep la: ");
        for (i = 0; i < n; i++) {
            System.out.print(arrA[i] +" ");
        }
    }
    
}