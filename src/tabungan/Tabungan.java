/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tabungan;

/**
 *
 * @author 'KoalaX'
 * NAMA     : Fiqri Akbar Pratama
 * KELAS    : PBO1/IF1
 * NIM      : 10118020
 * Deksripsi Program : Program ini berisi program untuk menghitung saldo tabungan
 * 
 */
public class Tabungan {

  private int saldo;
  
  public Tabungan (int saldo){
      this.saldo = saldo;
  }
  
  public int ambilUang(int jumlah){
      return saldo - jumlah;
  }
    
}
