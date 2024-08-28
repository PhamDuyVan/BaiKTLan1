/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package KiemTraLan1;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class QuanLySach {

    private final List<Sach> danhSach;
     static Scanner sc = new Scanner(System.in);
     static Sach sp = null;

    // Constructor khởi tạo danh sách sách
    public QuanLySach() {
        danhSach = new ArrayList<>();
        danhSach.add(new Sach("K011", "Lap trinh java", 95000, 2017));
        danhSach.add(new Sach("K012", "Co so du lieu", 85000, 2001));
        danhSach.add(new Sach("K013", "Nhap mon Lap trinh", 72000, 2013));
        danhSach.add(new Sach("K014", "Lap trinh Python", 39000, 2018));
        danhSach.add(new Sach("K015", "Lap trinh C#", 82000, 2015));
    }
    
    public void xuatToanBoSach() {
        double tongTriGia = 0;
        for (Sach sach : danhSach) {
            System.out.println(sach);
            tongTriGia += sach.getGiabia();
        }
        System.out.println("Tổng trị giá: " + tongTriGia);
    }
    public void sachXuatBanTruoc2015() {
        for (Sach sach : danhSach) {
            if (sach.getNamxuatban() < 2015) {
                System.out.println(sach);
            }
        }
    }
    public void sachTenDauLapTrinh() {
        for (Sach sach : danhSach) {
            if (sach.getTensach().startsWith("Lap trinh")) {
                System.out.println(sach);
            }
        }
    }
    
 public void XepTangDan(){
     new Comparator<Sach>()  {
         @Override
         public int compare(Sach sp1, Sach sp2) {
             return Double.compare(sp1.giabia(), sp2.giabia());
         }
     };
 }
 public static void xoaTheoMa() {
        String xoaTiep = "y";
        while ("y".equals(xoaTiep)) {
            System.out.print("\nNhap ma san pham can xoa: ");
            String spXoa = sc.next();
            for (int i = 0; i < listSach.size(); i++) {
                if (danhsach.getTen().equals(spXoa)) {
                    listSach.remove(sp);
                }
            }
            System.out.print("\nBan co muon xoa tiep?(y/n) ");
            xoaTiep = sc.next();
        }

    }
       public void suaGiaBiaTheoMa(String maSach, double giaBiaMoi) {
        for (Sach sach : danhSach) {
            if (sach.getMasach().equals(maSach)) {
                sach.setGiabia(giaBiaMoi);
                break;
            }
        }
    }

    // Tính tổng trị giá các sách
    public double tinhTongTriGia() {
        double tongTriGia = 0;
        for (Sach sach : danhSach) {
            tongTriGia += sach.getGiabia();
        }
        return tongTriGia;
    }
    
}
    

