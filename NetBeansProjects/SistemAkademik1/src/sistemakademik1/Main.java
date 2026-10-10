
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sistemakademik1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Mahasiswa mahasiswa = null;
        int pilihan;

        do {
            System.out.println("\n======================================");
            System.out.println("       SISTEM AKADEMIK MAHASISWA");
            System.out.println("======================================");
            System.out.println("1. Input Data Mahasiswa");
            System.out.println("2. Tampilkan Data Mahasiswa");
            System.out.println("3. Tampilkan Nilai Akhir");
            System.out.println("4. Tampilkan Grade");
            System.out.println("5. Tampilkan Predikat");
            System.out.println("6. Tampilkan Status Kelulusan");
            System.out.println("7. Keluar");
            System.out.println("======================================");
            System.out.print("Pilih Menu : ");
            pilihan = scanner.nextInt();
            scanner.nextLine();

            switch (pilihan) {
                case 1:
                    System.out.println("\n===== INPUT DATA MAHASISWA =====");
                    System.out.print("Masukkan NIM       : ");
                    String nim = scanner.nextLine();
                    System.out.print("Masukkan Nama      : ");
                    String nama = scanner.nextLine();
                    double tugas, uts, uas, kehadiran;

                    do {
                        System.out.print("Nilai Tugas (0-100): ");
                        tugas = scanner.nextDouble();
                        if (tugas < 0 || tugas > 100) System.out.println("Nilai harus 0-100!");
                    } while (tugas < 0 || tugas > 100);

                    do {
                        System.out.print("Nilai UTS (0-100)  : ");
                        uts = scanner.nextDouble();
                        if (uts < 0 || uts > 100) System.out.println("Nilai harus 0-100!");
                    } while (uts < 0 || uts > 100);

                    do {
                        System.out.print("Nilai UAS (0-100)  : ");
                        uas = scanner.nextDouble();
                        if (uas < 0 || uas > 100) System.out.println("Nilai harus 0-100!");
                    } while (uas < 0 || uas > 100);

                    do {
                        System.out.print("Kehadiran (0-100)  : ");
                        kehadiran = scanner.nextDouble();
                        if (kehadiran < 0 || kehadiran > 100) System.out.println("Kehadiran harus 0-100!");
                    } while (kehadiran < 0 || kehadiran > 100);

                    mahasiswa = new Mahasiswa(nim, nama, tugas, uts, uas, kehadiran);
                    System.out.println("\nData mahasiswa berhasil disimpan!");
                    break;

                case 2:
                    if (mahasiswa != null) mahasiswa.tampilkanData();
                    else System.out.println("Silakan input data dulu!");
                    break;
                case 3:
                    if (mahasiswa != null) System.out.printf("\nNilai Akhir = %.2f%n", mahasiswa.hitungNilaiAkhir());
                    else System.out.println("Silakan input data dulu!");
                    break;
                case 4:
                    if (mahasiswa != null) System.out.println("\nGrade = " + mahasiswa.getGrade());
                    else System.out.println("Silakan input data dulu!");
                    break;
                case 5:
                    if (mahasiswa != null) System.out.println("\nPredikat = " + mahasiswa.getPredikat());
                    else System.out.println("Silakan input data dulu!");
                    break;
                case 6:
                    if (mahasiswa != null) {
                        System.out.println("\nStatus Kelulusan = " + mahasiswa.getStatusKelulusan());
                        System.out.println("Status Remedial   = " + mahasiswa.getStatusRemedial());
                        System.out.println(mahasiswa.getPenghargaan());
                    } else System.out.println("Silakan input data dulu!");
                    break;
                case 7:
                    System.out.println("\nProgram selesai. Terima kasih!");
                    break;
                default:
                    System.out.println("Pilihan tidak tersedia! Pilih 1-7.");
            }
        } while (pilihan != 7);
        scanner.close();
    }
}