
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemakademik1;

public class Mahasiswa {

    // Atribut menggunakan modifier private
    private String nim;
    private String nama;
    private double tugas;
    private double uts;
    private double uas;
    private double kehadiran;

    // Constructor
    public Mahasiswa(String nim, String nama, double tugas,
                     double uts, double uas, double kehadiran) {
        this.nim = nim;
        this.nama = nama;
        this.tugas = tugas;
        this.uts = uts;
        this.uas = uas;
        this.kehadiran = kehadiran;
    }

    // Method untuk menghitung nilai akhir
    public double hitungNilaiAkhir() {
        return (tugas * 0.30) + (uts * 0.30) + (uas * 0.40);
    }

    // Method untuk menentukan grade
    public String getGrade() {
        double nilaiAkhir = hitungNilaiAkhir();

        if (nilaiAkhir >= 85) {
            return "A";
        } else if (nilaiAkhir >= 75) {
            return "B";
        } else if (nilaiAkhir >= 65) {
            return "C";
        } else if (nilaiAkhir >= 50) {
            return "D";
        } else {
            return "E";
        }
    }

    // Method untuk menentukan predikat
    public String getPredikat() {
        String grade = getGrade();

        switch (grade) {
            case "A":
                return "Sangat Baik";
            case "B":
                return "Baik";
            case "C":
                return "Cukup";
            case "D":
                return "Kurang";
            default:
                return "Sangat Kurang";
        }
    }

    // Method untuk menentukan status kelulusan
    public String getStatusKelulusan() {
        double nilaiAkhir = hitungNilaiAkhir();

        if (nilaiAkhir >= 60) {
            // Nested if
            if (kehadiran >= 75) {
                return "LULUS";
            } else {
                return "TIDAK LULUS - Kehadiran kurang";
            }
        } else {
            return "TIDAK LULUS - Nilai kurang";
        }
    }

    // Method tambahan untuk remedial
    public String getStatusRemedial() {
        double nilaiAkhir = hitungNilaiAkhir();

        if (nilaiAkhir >= 60) {
            return "LULUS";
        } else if (nilaiAkhir >= 50) {
            return "REMEDIAL";
        } else {
            return "TIDAK LULUS";
        }
    }

    // Method tambahan untuk penghargaan akademik
    public String getPenghargaan() {
        double nilaiAkhir = hitungNilaiAkhir();

        if (nilaiAkhir >= 90) {
            // Nested if
            if (kehadiran >= 90) {
                return "Penghargaan: Mahasiswa Berprestasi";
            }
        }

        return "Tidak ada penghargaan";
    }

    // Method untuk menampilkan seluruh data mahasiswa
    public void tampilkanData() {
        System.out.println("\n===== DATA MAHASISWA =====");
        System.out.println("NIM         : " + nim);
        System.out.println("Nama        : " + nama);
        System.out.println("Nilai Tugas : " + tugas);
        System.out.println("Nilai UTS   : " + uts);
        System.out.println("Nilai UAS   : " + uas);
        System.out.println("Kehadiran   : " + kehadiran + "%");
    }
}