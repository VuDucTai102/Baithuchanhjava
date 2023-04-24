package Shapes;

import java.util.Scanner;

public class HinhVuong extends HinhChuNhat{

    // Constructor

    public HinhVuong(){
      super.setTen("Hinh Vuong");
    Scanner scanner = new Scanner ("Hình Vuông");


    }
    public void nhapCanh(){
     System.out.println("Cạnh = "); 
      Scanner scanner = new Scanner(System.in);
      super.setDai(scanner.nextFloat());
      super.setRong(super.getDai());
    }  

}
     
    

