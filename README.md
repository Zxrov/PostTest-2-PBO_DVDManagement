# Sistem Manajemen Penyewaan DVD  

## 📌 Deskripsi Program
Aplikasi sederhana ini dibuat untuk mengelola **penyewaan DVD/Film** secara digital.  
Konsepnya santai aja: data DVD bisa kita tambahin, liat, update, hapus, sampai nyewa dan balikin lagi.  

Project ini dibuat dengan Java menggunakan konsep OOP dan pola MVC sederhana agar strukturnya lebih teratur.
Meski masih berbasis console, alurnya sudah menggambarkan proses penyewaan DVD seperti sistem rental pada umumnya.

Fitur utama mencakup:  
- CRUD (Create, Read, Update, Delete) data DVD  
- Penyewaan DVD  
- Pengembalian DVD 

---

## ✨ Fitur Program  
- Tambah DVD baru  
- Lihat daftar DVD  
- Update data DVD  
- Hapus DVD  
- Sewa DVD  
- Kembalikan DVD  
- Keluar dari aplikasi  

---

## 🚀 Cara Menjalankan  
1. Clone repository ini.  
2. Buka di **NetBeans** atau IDE Java lainnya.  
3. Pastikan `MainApp` diset sebagai **Main Class**.  
4. Jalankan program dengan **Run Project (F6)**.  

---

## 📖 Contoh Jalannya Program
=== Sistem Manajemen Penyewaan DVD ===

Tambah DVD

Lihat Daftar DVD

Update DVD

Hapus DVD

Sewa DVD

Kembalikan DVD

Keluar


---

## 🏗 Konsep yang Diterapkan  
- **ArrayList** sebagai tempat penyimpanan data DVD  
- **Constructor & Access Modifier** pada class `DVD`  
- **Pemisahan package**: `model`, `service`, `main`  
- **Percabangan & perulangan** untuk menu interaktif  
- **MVC sederhana** untuk memisahkan logika, data, dan tampilan


### 📌 Penjelasan MVC
- **Model (`model/DVD.java`)**  
  Berisi struktur data DVD: `id`, `judul`, `genre`, dan `status`.  
  - Menerapkan **constructor** untuk inisialisasi data.  
  - Menggunakan **access modifier (private)** dengan getter dan setter.  

- **View & Controller (`main/MainApp.java`)**  
  - View: Menampilkan menu dan menerima input dari user (Scanner).  
  - Controller: Menghubungkan input user ke logika program (memanggil method di `DVDService`).  

- **Service (`service/DVDService.java`)**  
  Berisi logika utama program:  
  - Menyimpan data DVD di dalam `ArrayList`.  
  - Operasi CRUD (tambah, lihat, update, hapus).  
  - Operasi khusus penyewaan dan pengembalian DVD.  

---

## 🔄 Alur Program  
1. Program dimulai dari `MainApp` → menampilkan menu utama.  
2. User memilih menu menggunakan input angka (percabangan `switch-case`).  
3. `MainApp` memanggil method di `DVDService` sesuai pilihan.  
4. `DVDService` memproses logika (CRUD, sewa, kembalikan, hapus).  
5. Hasil (output) ditampilkan kembali di console.  
6. Program terus berjalan (looping `while`) sampai user memilih **Keluar**.  




