package app;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.util.Scanner;
import service.MakeupService;

/**
 *
 *
 * @author gedascc
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        MakeupService service = new MakeupService();
        boolean berjalan = true;

        while (berjalan) {
            System.out.println("\n=============================");
            System.out.println("  SISTEM MANAJEMEN MAKEUP    ");
            System.out.println("=============================");
            System.out.println("1. Tambah Produk");
            System.out.println("2. Tampilkan Semua Produk");
            System.out.println("3. Ubah Data Produk");
            System.out.println("4. Hapus Produk");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu (1-5): ");

            String pilihan = scanner.nextLine().trim();

            switch (pilihan) {
                case "1":
                    service.tambahProduk();
                    break;
                case "2":
                    service.tampilkanSemua();
                    break;
                case "3":
                    service.ubahProduk();
                    break;
                case "4":
                    service.hapusProduk();
                    break;
                case "5":
                    berjalan = false;
                    System.out.println("\nTerima kasih telah menggunakan program ini:)");
                    break;
                default:
                    System.out.println("Pilihan tidak valid, masukkan angka 1 sampai 5.");
            }
        }
    }
}