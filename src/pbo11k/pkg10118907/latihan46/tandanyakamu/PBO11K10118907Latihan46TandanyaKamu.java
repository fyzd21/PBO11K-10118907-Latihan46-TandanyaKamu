/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo11k.pkg10118907.latihan46.tandanyakamu;

import java.util.Scanner;

/**
 *
 * @author
 * NAMA     : Yazid Fadlullah At-Taukily
 * KELAS    : PBO11K
 * NIM      : 10118907
 * Deskripsi Program : Latihan pencetak nama menggunakan konsep OOP
 * 
 */
public class PBO11K10118907Latihan46TandanyaKamu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.print("Masukkan tahun lahir Anda : ");
        Scanner s = new Scanner(System.in);
        
        Age a = new Age(2019);
        a.setYearBirth(Integer.parseInt(s.nextLine()));
        System.out.println("Tahun lahir Anda : "+a.getYearBirth());
        System.out.println("Hari ini tahun : "+a.getYearNow());
        System.out.println("Umur kamu sampai hari ini adalah "+a.hitungUmur()+" tahun");
        System.out.println("Tandanya kamu "+a.tandanyaKamu(a.hitungUmur()));
    }
    
}
