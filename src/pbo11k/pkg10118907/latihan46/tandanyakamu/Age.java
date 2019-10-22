/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo11k.pkg10118907.latihan46.tandanyakamu;

/**
 *
 * @author
 * NAMA     : Yazid Fadlullah At-Taukily
 * KELAS    : PBO11K
 * NIM      : 10118907
 * Deskripsi Program : Latihan pencetak nama menggunakan konsep OOP
 * 
 */
public class Age {
    private int yearBirth, yearNow;
    private String red = "\033[31m";

    public Age(int yearNow) {
        this.yearNow = yearNow;
    }

    public int getYearBirth() {
        return yearBirth;
    }

    public int getYearNow() {
        return yearNow;
    }

    public void setYearBirth(int yearBirth) {
        this.yearBirth = yearBirth;
    }
    
    public int hitungUmur() {
        return yearNow - yearBirth;
    }
    
    public String tandanyaKamu(int umur) {
        if(0 <= umur && umur <= 5) {
            red += "LAGI LUCU-LUCU NYA";
        } else if(5 < umur && umur <= 10) {
            red += "MASIH ANAK-ANAK";
        }  else if(10 < umur && umur <= 13) {
            red += "MASIH REMAJA";
        }  else if(13 < umur && umur <= 19) {
            red += "ALAY";
        }  else if(19 < umur && umur <= 29) {
            red += "LAGI GALAU NYARI JODOH";
        }  else if(29 < umur && umur <= 35) {
            red += "LAGI SIBUK NYARI UANG";
        }  else if(35 < umur && umur <= 150) {
            red += "SUDAH TUA";
        }  else {
            red +="TIDAK TERDETEKSI DI KEHIDUPAN";
        }
        
        return red;
    }
}
