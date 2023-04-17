
package main;

import Shapes.HinhChuNhat;
import Shapes.HinhTron;
import Shapes.HinhTru;
import Shapes.HinhVuong;

public class mainclass {
    public static void main(String[] args) {

    HinhTron hinhTron = new HinhTron();
    hinhTron.xuatTen();
    hinhTron.nhapBanKinh();
    hinhTron.tinhChuVi();
    hinhTron.tinhDienTich();
    hinhTron.inChuVi();
    hinhTron.inDienTich();

    HinhTru hinhTru = new HinhTru();
    hinhTru.xuatTen();
    hinhTru.nhapChieuCao();
    hinhTru.tinhChuVi();
    hinhTru.tinhDienTich();
    hinhTru.tinhTheTich();
    hinhTru.inChuVi();
    hinhTru.inDienTich();
    hinhTru.inTheTich();

    HinhChuNhat hcn = new HinhChuNhat();
    hcn.xuatTen();
    hcn.nhapChieuDai();
    hcn.nhapChieuRong();
    hcn.tinhChuVi();
    hcn.tinhDienTich();
    hcn.inChuVi();
    hcn.inDienTich();

    HinhVuong hv = new HinhVuong();
    hv.xuatTen();
    hv.nhapCanh();
    hv.tinhChuVi();
    hv.tinhDienTich();
    hv.inChuVi();
    hv.inDienTich();
 }

    
}
