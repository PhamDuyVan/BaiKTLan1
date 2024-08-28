/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package KiemTraLan1;

import static KiemTraLan1.QuanLySach.sc;

/**
 *
 * @author ADMIN
 */
public class Program {
     public static void menu() {
        String tiep = "y";
        while ("y".equals(tiep)) {
            System.out.println("\n=====QUAN LY Sach=====");
            System.out.print("\n*****Menu*****"
                    + "\n1. Nhap san pham"
                    + "\n2. Sap xep giam dan theo gia"
                    + "\n3. Xoa san pham theo ten"
                    + "\n4. Tinh gia trung binh cua sach"
                    + "\nChon hanh dong ban muon thuc hien: ");
            int menu = sc.nextInt();
            switch (menu) {
                case 1:
                    nhapmasach();
                    break;
                case 2:
                    xepGiamTheoGia();
                    break;
                case 3:
                    xoaTheoTen();
                    break;
                case 4:
                    tinhTB();
                    break;
                default:
                    System.out.println("Chon ko hop le!");
                    break;
            }
            System.out.print("\nBan co muon quan ly tiep?(y/n) ");
            tiep = sc.next();
        }
    }

    private static void nhapSP() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private static void nhapmasach() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private static void xepGiamTheoGia() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private static void xoaTheoTen() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private static void tinhTB() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
