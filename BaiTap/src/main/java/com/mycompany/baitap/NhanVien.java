/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.baitap;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author ADMIN
 */
public class NhanVien {
    public static final SimpleDateFormat f = new SimpleDateFormat("dd/MM/yyyy");
    private static int dem;
    private int id = ++dem;
    private String hoTen;
    private String gioiTinh;
    private String queQuan;
    private Date ngaySinh;
    private Date ngayVao;
    private String boPhanTrucThuoc;

    public NhanVien(String hoTen, String gioiTinh, String queQuan, Date ngaySinh, Date ngayVao, String boPhanTrucThuoc) {
        this.hoTen = hoTen;
        this.gioiTinh = gioiTinh;
        this.queQuan = queQuan;
        this.ngaySinh = ngaySinh;
        this.ngayVao = ngayVao;
        this.boPhanTrucThuoc = boPhanTrucThuoc;
    }
    
    public NhanVien(String hoTen, String gioiTinh, String queQuan, String ngaySinh, String ngayVao, String boPhanTrucThuoc) throws ParseException{
        this(hoTen, gioiTinh, queQuan, f.parse(ngaySinh), f.parse(ngayVao), boPhanTrucThuoc);
    }
    
    public void hienThi(){
        System.out.printf("ID: %d\nHo ten: %s\nGioi tinh: %s\nQue Quan: %s\nNgay sinh: %s\nNgay Vao Quan: %s\nBo phan truc thuoc: %s\n",
                this.id, this.hoTen, this.gioiTinh, this.queQuan, NhanVien.f.format(this.ngaySinh), NhanVien.f.format(this.ngayVao), this.boPhanTrucThuoc);
    }
    
    
    

    /**
     * @return the dem
     */
    public static int getDem() {
        return dem;
    }

    /**
     * @param aDem the dem to set
     */
    public static void setDem(int aDem) {
        dem = aDem;
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the hoTen
     */
    public String getHoTen() {
        return hoTen;
    }

    /**
     * @param hoTen the hoTen to set
     */
    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    /**
     * @return the gioiTinh
     */
    public String getGioiTinh() {
        return gioiTinh;
    }

    /**
     * @param gioiTinh the gioiTinh to set
     */
    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    /**
     * @return the queQuan
     */
    public String getQueQuan() {
        return queQuan;
    }

    /**
     * @param queQuan the queQuan to set
     */
    public void setQueQuan(String queQuan) {
        this.queQuan = queQuan;
    }

    /**
     * @return the ngaySinh
     */
    public Date getNgaySinh() {
        return ngaySinh;
    }

    /**
     * @param ngaySinh the ngaySinh to set
     */
    public void setNgaySinh(Date ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    /**
     * @return the ngayVao
     */
    public Date getNgayVao() {
        return ngayVao;
    }

    /**
     * @param ngayVao the ngayVao to set
     */
    public void setNgayVao(Date ngayVao) {
        this.ngayVao = ngayVao;
    }

    /**
     * @return the boPhanTrucThuoc
     */
    public String getBoPhanTrucThuoc() {
        return boPhanTrucThuoc;
    }

    /**
     * @param boPhanTrucThuoc the boPhanTrucThuoc to set
     */
    public void setBoPhanTrucThuoc(String boPhanTrucThuoc) {
        this.boPhanTrucThuoc = boPhanTrucThuoc;
    }
    
    
    
    
    
    
}
