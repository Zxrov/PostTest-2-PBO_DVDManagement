/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dvdpenyewaan.service;

import dvdpenyewaan.model.DVD;
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author Muhammad Romadhoni
 */
public class DVDService {
    private ArrayList<DVD> daftarDVD = new ArrayList<>();
    private Scanner scanner;

    // Constructor dengan Scanner
    public DVDService(Scanner scanner) {
        this.scanner = scanner;
    }

    // Menu utama
    public void tampilkanMenu() {
        int pilihan;
        do {
            System.out.println("\n=== Sistem Manajemen Penyewaan DVD ===");
            System.out.println("1. Tambah DVD");
            System.out.println("2. Lihat Daftar DVD");
            System.out.println("3. Update DVD");
            System.out.println("4. Hapus DVD");
            System.out.println("5. Sewa DVD");
            System.out.println("6. Kembalikan DVD");
            System.out.println("7. Keluar");
            System.out.print("Pilih menu: ");
            while (!scanner.hasNextInt()) {
                System.out.print("Input harus angka! Pilih menu: ");
                scanner.next(); 
            }
            pilihan = scanner.nextInt();
            scanner.nextLine(); 

            switch (pilihan) {
                case 1 -> tambahDVD();
                case 2 -> tampilkanDVD();
                case 3 -> updateDVD();
                case 4 -> hapusDVD();
                case 5 -> sewaDVD();
                case 6 -> kembalikanDVD();
                case 7 -> System.out.println("Keluar dari program...");
                default -> System.out.println("Pilihan tidak valid!");
            }
        } while (pilihan != 7);
    }

    private void tambahDVD() {
        System.out.print("Masukkan ID DVD: ");
        String id = scanner.nextLine();
        System.out.print("Masukkan Judul DVD: ");
        String judul = scanner.nextLine();
        System.out.print("Masukkan Genre DVD: ");
        String genre = scanner.nextLine();
        daftarDVD.add(new DVD(id, judul, genre));
        System.out.println("DVD berhasil ditambahkan!");
    }

    private void tampilkanDVD() {
        System.out.println("\nDaftar DVD:");
        if (daftarDVD.isEmpty()) {
            System.out.println("(Kosong)");
        } else {
            for (DVD dvd : daftarDVD) {
                System.out.println(dvd);
            }
        }
    }

    private void updateDVD() {
        System.out.print("Masukkan ID DVD yang ingin diupdate: ");
        String id = scanner.nextLine();
        for (DVD dvd : daftarDVD) {
            if (dvd.getId().equals(id)) {
                System.out.print("Masukkan Judul baru: ");
                dvd.setJudul(scanner.nextLine());
                System.out.print("Masukkan Genre baru: ");
                dvd.setGenre(scanner.nextLine());
                System.out.println("DVD berhasil diupdate!");
                return;
            }
        }
        System.out.println("DVD dengan ID " + id + " tidak ditemukan.");
    }
    
    private void sewaDVD() {
    System.out.print("Masukkan ID DVD yang ingin disewa: ");
    String id = scanner.nextLine();
    for (DVD dvd : daftarDVD) {
        if (dvd.getId().equals(id)) {
            if (dvd.getStatus().equals("Tersedia")) {
                dvd.setStatus("Dipinjam");
                System.out.println("DVD berhasil disewa!");
            } else {
                System.out.println("DVD sedang dipinjam, tidak bisa disewa.");
            }
            return;
        }
    }
        System.out.println("DVD dengan ID " + id + " tidak ditemukan.");
}

private void kembalikanDVD() {
    System.out.print("Masukkan ID DVD yang ingin dikembalikan: ");
    String id = scanner.nextLine();
    for (DVD dvd : daftarDVD) {
        if (dvd.getId().equals(id)) {
            if (dvd.getStatus().equals("Dipinjam")) {
                dvd.setStatus("Tersedia");
                System.out.println("DVD berhasil dikembalikan!");
            } else {
                System.out.println("DVD tidak sedang dipinjam.");
            }
            return;
        }
    }
        System.out.println("DVD dengan ID " + id + " tidak ditemukan.");
    }
    
    private void hapusDVD() {
        System.out.print("Masukkan ID DVD yang ingin dihapus: ");
        String id = scanner.nextLine();
        boolean removed = daftarDVD.removeIf(dvd -> dvd.getId().equals(id));
        if (removed) {
            System.out.println("DVD berhasil dihapus.");
        } else {
            System.out.println("DVD dengan ID " + id + " tidak ditemukan.");
        }
    }
}