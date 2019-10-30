/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tabungan;

import java.util.Scanner;

/**
 *
 * @author 'KoalaX'
 * NAMA     : Fiqri Akbar Pratama
 * KELAS    : PBO1/IF1
 * NIM      : 10118020
 * Deksripsi Program : Program ini berisi program untuk menghitung saldo tabungan
 * 
 */
public class Utama {
    
    public static void main(String[] args){
        int jumlah;
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("====Program Penarikan Uang====");
        System.out.printf("Masukkan Saldo Awal : ");
        Tabungan tbg = new Tabungan(scanner.nextInt());
        System.out.printf("Jumlah Uang yang diambil : ");
        jumlah = scanner.nextInt();
        System.out.println("Saldo Anda Sekarang : "+tbg.ambilUang(jumlah));
        System.out.println("\nDevelop By : Fiqri Akbar Pratama");
    }
}
