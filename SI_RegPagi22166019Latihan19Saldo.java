/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package si_regpagi.pkg22166019.latihan19.saldo;

/**
 *
 * @author ASUS
 * NAMA                 : Rachma Fadilah Kurnianto
 * KELAS                : PBO1
 * NIM                  : 222166019
 * Deskripsi Program    : Berisi cara menghitung saldo tabungan tiap bulan selama 6 bulan. 
 */
public class SI_RegPagi22166019Latihan19Saldo {
    public static void main(String[] args) {
        
        //Deklarasi dan besaran variabel
        double saldoawal = 2500.00, bunga = 0.15, saldoakhir;
        int bulan = 6;
        saldoakhir = saldoawal;
        
        //Menghitung saldo perbulan dengan bunga
        for (int i = 1; i <= bulan; i++) {
            saldoakhir += (saldoakhir * bunga);
            System.out.printf("Saldo di bulan ke-%d: Rp %.2f%n", i, saldoakhir);
        }
    }
}
