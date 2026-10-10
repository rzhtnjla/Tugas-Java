/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package najla.menuakademik;

import java.util.Scanner;

public class MenuAkademik {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int pilihan;
        
        // Ketentuan 1 & 7: Menggunakan do-while untuk menu utama, berhenti jika memilih 5
        do {
            System.out.println("==================================");
            System.out.println("MENU AKADEMIK");
            System.out.println("==================================");
            System.out.println("1. Input Nilai Mahasiswa");
            System.out.println("2. Tampilkan Bilangan Genap");
            System.out.println("3. Hitung Faktorial");
            System.out.println("4. Tampilkan Pola Bintang");
            System.out.println("5. Keluar");
            System.out.println("==================================");
            System.out.print("pilih menu: ");
            pilihan = scanner.nextInt();
            System.out.println();
            
            // Ketentuan 2: Menggunakan switch-case untuk pilihan menu
            switch (pilihan) {
                case 1:
                    System.out.println("---1. Input Nilai Mahasiswa ---");
                    System.out.print("Masukkan nilai angka (0 - 100): ");
                    double nilai = scanner.nextDouble();
                    
                    // Ketentuan 6: Menggunakan if-else untuk menetukan kondisi/predikat
                    if (nilai >= 85){
                        System.out.println("Nilai Huruf: A (Sangat Memuaskan");
                    }if (nilai >= 70){
                        System.out.println("Nilai Huruf: B (Memuaskan");
                    }if (nilai >= 60){
                        System.out.println("Nilai Huruf: C (Cukup");
                    }if (nilai >= 50){
                        System.out.println("Nilai Huruf: D (Kurang");
                    }else {
                        System.out.println("Nilai Huruf: E (gagal");
                    }
                    break;
                    
                case 2:
                    System.out.println("---2. Tampilkan Bilangan Genap ---");
                    System.out.print("Masukkan batas maksimal angka: ");
                    int batas = scanner.nextInt();
                    
                    // Ketentuan 3: Menggunakan for pada menu ini
                    System.out.print("Deret bilangan genap: ");
                    for (int i = 1; i <= batas; i++) {
                        if (i % 2 == 0){
                            System.out.println(i + "");
                        }
                    }
                    System.out.println();
                    break;
                    
                case 3:
                    System.out.println("---3. Hitung Faktorial ---");
                    System.out.print("Masukkan angka bulat positif: ");
                    int n = scanner.nextInt();
                    long faktorial = 1;
                    int i = 1;
                    
                    // Ketentuan 4: Menggunakan while pada menu ini
                    while (i <=n){
                        faktorial *= i;
                        i++;
                    }
                    System.out.println("Hasil " + n + "! = " + faktorial);
                    break;
                    
                case 4:
                    System.out.println("---4. Tampilkan Pola Bintang ---");
                    System.out.print("Masukkan jumlah baris bintang: ");
                    int tinggi = scanner.nextInt();
                    
                    // Ketentuan 5: Menggunakan nested loop untuk pola bintang
                    for (int x = 1; x <= tinggi; x++) {
                        for (int y = 1; y <= x; y++) {
                            System.out.print("* ");
                        }
                        System.out.println(); // Pindah baris
                    }
                    break;
                    
                case 5:
                    System.out.println("Terima kasih, program telah selesai.");
                    break;
                    
                default:
                    System.out.println("pilihan tidak valid! Silakan pilih menu 1 - 5");
                    break;
            }
            System.out.println();
            
        } while (pilihan != 5); // ketentuan 7: loop berulang selama pengguna tidak memilih 5
        scanner.close();
    }
}