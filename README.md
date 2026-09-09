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
**1. Program dijalankan melalui file Main.java.**
   
  <img width="179" height="110" alt="image" src="https://github.com/user-attachments/assets/9f8f10e2-8077-4eac-9093-df61873f75d8" />


**2. Program menampilkan menu utama Sistem Manajemen Makeup.**

  <img width="175" height="116" alt="image" src="https://github.com/user-attachments/assets/497365e6-0a14-4f51-8a04-e73fbfe08a52" />

  Pengguna memilih menu yang diinginkan dengan mengetik pilihan menu dari angka 1 sampai 5.

  
**3. Jika memilih Menu 1 (Tambah Produk), pengguna diminta memasukkan data produk baru.**

  <img width="261" height="120" alt="image" src="https://github.com/user-attachments/assets/b6266ada-68c5-41c0-bb65-de36f568f755" />

  Pengguna mengisi ID, nama, merk, harga, dan stok produk makeup.

  <img width="359" height="231" alt="image" src="https://github.com/user-attachments/assets/67b6ba20-a579-441e-b618-0ce9bf286f8d" />

  Di Menu 1 (Tambah Produk), program mengecek apakah data yang diketik pengguna sudah benar atau belum, dengan jatah salah maksimal tiga kali. Di gambar terlihat program menolak ketikan kosong pada ID, tulisan huruf pada harga, serta huruf dan angka nol pada stok. Karena salah mengisi stok sampai tiga kali berturut-turut, proses tambah produk otomatis dibatalkan dan langsung kembali ke menu utama


**4. Jika memilih Menu 2 (Tampilkan Semua Produk), program menampilkan seluruh daftar makeup.**

  <img width="200" height="295" alt="image" src="https://github.com/user-attachments/assets/30f3da7d-e080-4ba9-b45f-1fd53332a4bf" />

Di Menu 2 (Tampilkan Semua Produk), program menampilkan seluruh koleksi makeup yang tersimpan di dalam daftar. Pada gambar terlihat ada tiga produk yang muncul lengkap dengan ID, nama, merk, harga, dan jumlah stoknya. Menu ini murni dipakai untuk mengecek data yang sudah ada tanpa mengubah apa pun.


**5. Jika memilih Menu 3 (Ubah Data Produk), pengguna dapat memperbarui informasi produk.**

<img width="248" height="238" alt="image" src="https://github.com/user-attachments/assets/2d765023-12fc-4a11-821d-552afb431b4f" />
  
Di Menu 3 (Ubah Data Produk), pengguna bisa mengedit informasi produk berdasarkan ID yang dicari. Pada gambar, pengguna memilih ID `MK02`, lalu program menampilkan detail data lamanya terlebih dahulu. Pengguna cukup menekan *Enter* untuk melewati nama serta merk yang tidak ingin diganti, memilih `n` pada harga, dan memilih `y` untuk mengubah stok dari 3 menjadi 1 pcs hingga muncul keterangan berhasil.


**6. Jika memilih Menu 4 (Hapus Produk), program akan menghapus produk pilihan.**

<img width="247" height="68" alt="image" src="https://github.com/user-attachments/assets/dbe1742b-2adb-4ff2-84ca-d5534e434285" />

Di Menu 4 (Hapus Data Produk), program mencari data produk berdasarkan ID yang diketik pengguna sebelum melakukan penghapusan. Pada gambar, pengguna memasukkan ID MK05 yang memang belum pernah didaftarkan. Program langsung mendeteksi bahwa data tersebut tidak ada di daftar, lalu memunculkan pesan bahwa produk tidak ditemukan dan akan kembali ke menu utama.


<img width="248" height="78" alt="image" src="https://github.com/user-attachments/assets/bf4faf07-9389-4017-9119-85574c9a6b86" />

Di Menu 4 (Hapus Data Produk), sistem meminta konfirmasi terlebih dahulu sebelum benar-benar membuang data dari daftar. Pada gambar, pengguna memasukkan ID MK01 dan program langsung menampilkan nama barangnya (Superstay Matte Ink) untuk memastikan pilihan. Karena pengguna mengetik y, data tersebut resmi dihapus permanen dari memori hingga muncul keterangan berhasil.


<img width="198" height="218" alt="image" src="https://github.com/user-attachments/assets/f0d93987-e136-4305-9d93-5be4e88d60fe" />

Setelah melakukan penghapusan, pengguna kembali membuka Menu 2 (Tampilkan Semua Produk) untuk memastikan perubahannya. Pada gambar terlihat jumlah data berkurang menjadi dua produk saja (MK02 dan MK03), sedangkan produk MK01 (Superstay Matte Ink) sudah benar-benar hilang dari daftar. Hal ini membuktikan fitur hapus data berhasil bekerja.





