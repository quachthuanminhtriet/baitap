/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.baitap;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class QuanLyNhanVien {
    private static final Scanner sc = new Scanner(System.in);
    private List<NhanVien> ds = new ArrayList<>();
    
    public void themNhanVien() throws ParseException {
        System.out.print("Nhap Ten Nhan Vien: ");
        String ten =  sc.nextLine();
        System.out.print("Nhap Gioi Tinh: ");
        String gt = sc.nextLine();
        System.out.print("Nhap Que Quan: ");
        String que = sc.nextLine();
        System.out.print("Nhap Ngay Sinh: ");
        String ngaySinh = sc.nextLine();
        System.out.print("Nhap Ngay Vao: ");
        String ngayVao = sc.nextLine();
        System.out.print("Nhap Bo Phan Truc Thuoc: ");
        String bptt = sc.nextLine();
        
        NhanVien nv = new NhanVien(ten, gt, que, ngaySinh, ngayVao, bptt);
        
        this.ds.add(nv);
       
    }
    
    public void hienThi() {
        this.getDs().forEach(s -> s.hienThi());
    
    }

    public NhanVien traCuu(int id) {
        return this.ds.stream().filter(s -> s.getId() == id).findFirst().get();
    }
    
    public void xoaNhanVien(NhanVien p){
        this.ds.remove(p);
    }
    
    
    
    
    
    

    /**
     * @return the ds
     */
    public List<NhanVien> getDs() {
        return ds;
    }

    /**
     * @param ds the ds to set
     */
    public void setDs(List<NhanVien> ds) {
        this.ds = ds;
    }
    
    
    
    
    
    
}
