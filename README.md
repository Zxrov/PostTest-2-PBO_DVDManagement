📖 #Sistem Manajemen Penyewaan DVD
Deskripsi

Program ini adalah aplikasi berbasis console sederhana untuk manajemen penyewaan DVD/Film.
Fitur utama mencakup operasi CRUD (Create, Read, Update, Delete), serta fungsi tambahan untuk menyewa dan mengembalikan DVD.

Dibuat menggunakan Java (NetBeans) dengan penerapan:

OOP (Object Oriented Programming)

ArrayList sebagai penyimpanan data

Packages untuk memisahkan fungsi (MVC sederhana)

Access Modifier & Constructor

Validasi Input pada menu

Fitur Program Penyewaan DVD

Tambah DVD baru

Lihat daftar DVD

Update data DVD

Hapus DVD

Sewa DVD (ubah status menjadi Dipinjam)

Kembalikan DVD (ubah status menjadi Tersedia)

Keluar dari program

🗂️ Struktur Packages
DVDPenyewaan
 └── Source Packages
      └── dvdpenyewaan
           ├── main
           │    └── MainApp.java       (Entry point, menu user)
           ├── model
           │    └── DVD.java           (Struktur data DVD)
           └── service
                └── DVDService.java    (CRUD & penyewaan)


Contoh Running Program
=== Sistem Manajemen Penyewaan DVD ===
1. Tambah DVD
2. Lihat Daftar DVD
3. Update DVD
4. Hapus DVD
5. Sewa DVD
6. Kembalikan DVD
7. Keluar
Pilih menu: 1
Masukkan ID DVD: D01
Masukkan Judul DVD: Spiderman
Masukkan Genre DVD: Action
DVD berhasil ditambahkan!

Pilih menu: 2
Daftar DVD:
ID: D01, Judul: Spiderman, Genre: Action, Status: Tersedia

Pilih menu: 5
Masukkan ID DVD yang ingin disewa: D01
DVD berhasil disewa!

Pilih menu: 2
Daftar DVD:
ID: D01, Judul: Spiderman, Genre: Action, Status: Dipinjam

Pilih menu: 6
Masukkan ID DVD yang ingin dikembalikan: D01
DVD berhasil dikembalikan!

Pilih menu: 7
Keluar dari program...
