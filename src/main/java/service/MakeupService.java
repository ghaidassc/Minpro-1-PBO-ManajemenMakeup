/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

import java.util.ArrayList;
import java.util.Scanner;
import model.ProdukMakeup;

/**
 *
 * @author gedascc
 */
public class MakeupService {
    
    public ArrayList<ProdukMakeup> daftarProduk;
    private Scanner scanner = new Scanner(System.in);

    public MakeupService() {
        daftarProduk = new ArrayList<>();
        daftarProduk.add(new ProdukMakeup("MK01", "Superstay Matte Ink", "Maybelline", 125000, 2));
        daftarProduk.add(new ProdukMakeup("MK02", "Colorfit Velvet Lip", "Wardah", 65000, 3));
    }

    public void tambahProduk() {
        System.out.println("\n===== Tambah Produk Baru =====");

     
        String id = null;
        for (int i = 1; i <= 3; i++) {
            System.out.print("Masukkan ID Produk: ");
            String input = scanner.nextLine().trim();
            if (!input.isEmpty()) {
                if (cariIndexById(input) != -1) {
                    System.out.println("ID sudah terdaftar, masukkan ID lain!!");
                    return;
                }
                id = input;
                break;
            }
            System.out.println("ID tidak boleh kosong!! (Percobaan " + i + "/3)");
        }
        if (id == null) {
            System.out.println("Anda gagal mengisi ID 3 kali. Otomatis kembali ke menu utama.");
            return;
        }

   
        String nama = null;
        for (int i = 1; i <= 3; i++) {
            System.out.print("Masukkan Nama Produk: ");
            String input = scanner.nextLine().trim();
            if (!input.isEmpty()) {
                nama = input;
                break;
            }
            System.out.println("Nama tidak boleh kosong!! (Percobaan " + i + "/3)");
        }
        if (nama == null) {
            System.out.println("Anda gagal mengisi Nama 3 kali. Otomatis kembali ke menu utama.");
            return;
        }

  
        String merk = null;
        for (int i = 1; i <= 3; i++) {
            System.out.print("Masukkan Merk Produk: ");
            String input = scanner.nextLine().trim();
            if (!input.isEmpty()) {
                merk = input;
                break;
            }
            System.out.println("Merk tidak boleh kosong!! (Percobaan " + i + "/3)");
        }
        if (merk == null) {
            System.out.println("Anda gagal mengisi Merk 3 kali. Otomatis kembali ke menu utama.");
            return;
        }

       
        double harga = -1;
        for (int i = 1; i <= 3; i++) {
            System.out.print("Masukkan Harga Produk (Rp): ");
            String input = scanner.nextLine().trim();
            if (input.isEmpty()) {
                System.out.println("Harga tidak boleh kosong!! (Percobaan " + i + "/3)");
                continue;
            }
            try {
                double tempHarga = Double.parseDouble(input);
                if (tempHarga <= 0) {
                    System.out.println("Harga harus lebih dari 0!! (Percobaan " + i + "/3)");
                    continue;
                }
                harga = tempHarga;
                break;
            } catch (NumberFormatException e) {
                System.out.println("Format harga harus angka!! (Percobaan " + i + "/3)");
            }
        }
        if (harga == -1) {
            System.out.println("Anda gagal mengisi Harga 3 kali. Otomatis kembali ke menu utama.");
            return;
        }

  
        int stok = -1;
        for (int i = 1; i <= 3; i++) {
            System.out.print("Masukkan Stok Produk (pcs): ");
            String input = scanner.nextLine().trim();
            if (input.isEmpty()) {
                System.out.println("Stok tidak boleh kosong! (Percobaan " + i + "/3)");
                continue;
            }
            try {
                int tempStok = Integer.parseInt(input);
                if (tempStok <= 0) {
                    System.out.println("Stok minimal 1 (tidak boleh 0 atau negatif)!! (Percobaan " + i + "/3)");
                    continue;
                }
                stok = tempStok;
                break;
            } catch (NumberFormatException e) {
                System.out.println("Format stok harus angka bulat!! (Percobaan " + i + "/3)");
            }
        }
        if (stok == -1) {
            System.out.println("Anda gagal mengisi Stok 3 kali. Otomatis kembali ke menu utama.");
            return;
        }

        daftarProduk.add(new ProdukMakeup(id, nama, merk, harga, stok));
        System.out.println("Produk berhasil ditambahkan!!");
    }

    public void tampilkanSemua() {
        System.out.println("\n====== Daftar Produk Makeup ======");
        if (daftarProduk.isEmpty()) {
            System.out.println("Belum ada data makeup tersimpan!!");
            return;
        }

        for (int i = 0; i < daftarProduk.size(); i++) {
            System.out.println("Data ke-" + (i + 1));
            daftarProduk.get(i).tampilkanData();
            System.out.println("--------------------------------");
        }
    }

    public void ubahProduk() {
        System.out.println("\n===== Ubah Data Produk =====");
        if (daftarProduk.isEmpty()) {
            System.out.println("Data kosong, tidak ada produk yang bisa diubah!!");
            return;
        }

        System.out.print("Masukkan ID Produk yang ingin diubah: ");
        String id = scanner.nextLine().trim();
        int index = cariIndexById(id);

        if (index == -1) {
            System.out.println("Produk dengan ID '" + id + "' tidak ditemukan!!");
            return;
        }

        ProdukMakeup produk = daftarProduk.get(index);
        System.out.println("\nData saat ini:");
        produk.tampilkanData();
        System.out.println("--------------------------------------");

        System.out.print("Nama baru (kosongkan jika tidak diubah): ");
        String namaBaru = scanner.nextLine().trim();
        if (!namaBaru.isEmpty()) {
            produk.setNama(namaBaru);
        }

        System.out.print("Merk baru (kosongkan jika tidak diubah): ");
        String merkBaru = scanner.nextLine().trim();
        if (!merkBaru.isEmpty()) {
            produk.setMerk(merkBaru);
        }

        System.out.print("Ingin mengubah harga? (y/n): ");
        if (scanner.nextLine().trim().equalsIgnoreCase("y")) {
            System.out.print("Masukkan harga baru (Rp): ");
            try {
                produk.setHarga(Double.parseDouble(scanner.nextLine().trim()));
            } catch (NumberFormatException e) {
                System.out.println("Harga tidak valid, perubahan harga dilewati.");
            }
        }

        System.out.print("Ingin mengubah stok? (y/n): ");
        if (scanner.nextLine().trim().equalsIgnoreCase("y")) {
            System.out.print("Masukkan stok baru (pcs): ");
            try {
                produk.setStok(Integer.parseInt(scanner.nextLine().trim()));
            } catch (NumberFormatException e) {
                System.out.println("Stok tidak valid, perubahan stok dilewati.");
            }
        }

        System.out.println("Data produk berhasil diperbarui!!");
    }

    public void hapusProduk() {
        System.out.println("\n===== Hapus Data Produk =====");
        if (daftarProduk.isEmpty()) {
            System.out.println("Data kosong, tidak ada produk yang bisa dihapus!!");
            return;
        }

        System.out.print("Masukkan ID Produk yang ingin dihapus: ");
        String id = scanner.nextLine().trim();
        int index = cariIndexById(id);

        if (index == -1) {
            System.out.println("Produk dengan ID '" + id + "' tidak ditemukan!!");
            return;
        }

        System.out.print("Yakin hapus '" + daftarProduk.get(index).getNama() + "'? (y/n): ");
        if (scanner.nextLine().trim().equalsIgnoreCase("y")) {
            daftarProduk.remove(index);
            System.out.println("Produk berhasil dihapus!!");
        } else {
            System.out.println("Penghapusan dibatalkan.");
        }
    }

    private int cariIndexById(String id) {
        for (int i = 0; i < daftarProduk.size(); i++) {
            if (daftarProduk.get(i).getId().equalsIgnoreCase(id)) {
                return i;
            }
        }
        return -1;
    }
}