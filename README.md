# Sistem Manajemen Perlengkapan dan Produk Makeup💄✨🛍️

## Deskripsi Singkat
Sistem Manajemen Produk Makeup adalah program yang berbasis Java. Program ini digunakan untuk mengelola data koleksi produk makeup untuk pemakaian pribadi. Program ini menerapkan konsep Pemrograman Berorientasi Objek (PBO) dan memiliki fitur CRUD (Create, Read, Update, dan Delete) untuk menambah, menampilkan, mengubah, dan menghapus data produk makeup.

## Fitur Program
- Menampilkan seluruh data produk makeup,
- Menambah data produk baru,
- Mengubah (update) data produk berdasarkan ID,
- Menghapus data produk dari daftar,
- Validasi input ketat (maksimal 3 kali percobaan dan nilai batas minimal),
- Menu interaktif.

## Data Produk Makeup
Data produk yang dikelola meliputi:
- **ID Produk**  
  (Contoh: `MK01`, `MK02`, dan seterusnya),
- **Nama Produk**  
  (Contoh: `Superstay Matte Ink`, `Colorfit Velvet Lip`),
- **Merk Produk**  
  (Contoh: `Maybelline`, `Wardah`),
- **Harga Produk**  
  (Contoh: `125000`, `65000`(Rp)),
- **Stok Produk**  
  (Contoh: `2`, `3` (pcs)).

## Alur Program
1. **Program dijalankan melalui file Main.java.**
   
  <img width="179" height="110" alt="image" src="https://github.com/user-attachments/assets/9f8f10e2-8077-4eac-9093-df61873f75d8" />

2. **Program menampilkan menu utama Sistem Manajemen Makeup.**

  <img width="175" height="116" alt="image" src="https://github.com/user-attachments/assets/497365e6-0a14-4f51-8a04-e73fbfe08a52" />

  Pengguna memilih menu yang diinginkan dengan mengetik pilihan menu dari angka 1 sampai 5.
  
3. **Jika memilih Menu 1 (Tambah Produk), pengguna diminta memasukkan data produk baru.**

  <img width="261" height="120" alt="image" src="https://github.com/user-attachments/assets/b6266ada-68c5-41c0-bb65-de36f568f755" />

  Pengguna mengisi ID, nama, merk, harga, dan stok produk makeup.

  <img width="359" height="231" alt="image" src="https://github.com/user-attachments/assets/67b6ba20-a579-441e-b618-0ce9bf286f8d" />

  Di Menu 1 (Tambah Produk), program mengecek apakah data yang diketik pengguna sudah benar atau belum, dengan jatah salah maksimal tiga kali. Di gambar terlihat program menolak ketikan kosong pada ID, tulisan huruf pada harga, serta huruf dan angka nol pada stok. Karena salah mengisi stok sampai tiga kali berturut-turut, proses tambah produk otomatis dibatalkan dan langsung kembali ke menu utama

4. 
