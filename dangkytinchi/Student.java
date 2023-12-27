/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dangkytinchi;

/**
 *
 * @author Admin
 */
class Student {
    private String ma,ten,sotin,nhomto;
    public Student(){
    }
    public Student(String ma, String ten, String sotin, String nhomto){
        this.ma=ma;
        this.ten=ten;
        this.sotin=sotin;
        this.nhomto=nhomto;
    }

    public void setNhomto(String nhomto) {
        this.nhomto = nhomto;
    }

    public String getNhomto() {
        return nhomto;
    }
    public String getMa() {
        return ma;
    }
    public String getTen() {
        return ten;
    }
    public String getSotin() {
        return sotin;
    }
    public void setMa(String ma) {
        this.ma = ma;
    }
    public void setTen(String ten) {
        this.ten = ten;
    }
    public void setSotin(String sotin) {
        this.sotin = sotin;
    } 
}
