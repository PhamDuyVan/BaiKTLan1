/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package KiemTraLan1;

/**
 *
 * @author ADMIN
 */

    public class Sach {
    // Các thuộc tính của lớp Sach
    private String masach;
    private String tensach;
    private double giabia;
    private int namxuatban;

    // Phương thức khởi tạo
    public Sach(String masach, String tensach, double giabia, int namxuatban) {
        this.masach = masach;
        this.tensach = tensach;
        this.giabia = giabia;
        this.namxuatban = namxuatban;
    }

    // Getter cho masach
    public String getMasach() {
        return masach;
    }

    // Setter cho masach
    public void setMasach(String masach) {
        this.masach = masach;
    }

    // Getter cho tensach
    public String getTensach() {
        return tensach;
    }

    // Setter cho tensach
    public void setTensach(String tensach) {
        this.tensach = tensach;
    }

    // Getter cho giabia
    public double getGiabia() {
        return giabia;
    }

    // Setter cho giabia
    public void setGiabia(double giabia) {
        this.giabia = giabia;
    }

    // Getter cho namxuatban
    public int getNamxuatban() {
        return namxuatban;
    }

    // Setter cho namxuatban
    public void setNamxuatban(int namxuatban) {
        this.namxuatban = namxuatban;
    }

    // Phương thức toString() để in thông tin của đối tượng Sach
    @Override
    public String toString() {
        return "Sach{" +
                "masach='" + masach + '\'' +
                ", tensach='" + tensach + '\'' +
                ", giabia=" + giabia +
                ", namxuatban=" + namxuatban +
                '}';
    }
    }

