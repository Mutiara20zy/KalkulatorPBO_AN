package kalkulatorpbo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("=== KALKULATOR BANGUN RUANG ===");
        System.out.println("1. Kubus");
        System.out.println("2. Balok");
        System.out.println("3. Tabung");
        System.out.print("Pilih nomor (1-3): ");
        int pilihan = input.nextInt();

        if (pilihan == 1) {
            System.out.print("Masukkan sisi: ");
            double s = input.nextDouble();
            
            Kubus k = new Kubus(s);
            System.out.println("Volume Kubus = " + k.hitungVolume());
            System.out.println("Luas Kubus   = " + k.hitungLuas());

        } else if (pilihan == 2) {
            System.out.print("Masukkan panjang: ");
            double p = input.nextDouble();
            System.out.print("Masukkan lebar: ");
            double l = input.nextDouble();
            System.out.print("Masukkan tinggi: ");
            double t = input.nextDouble();
            
            Balok b = new Balok(p, l, t);
            System.out.println("Volume Balok = " + b.hitungVolume());
            System.out.println("Luas Balok   = " + b.hitungLuas());

        } else if (pilihan == 3) {
            System.out.print("Masukkan jari-jari: ");
            double r = input.nextDouble();
            System.out.print("Masukkan tinggi: ");
            double t = input.nextDouble();
            
            Tabung tb = new Tabung(r, t);
            System.out.println("Volume Tabung = " + tb.hitungVolume());
            System.out.println("Luas Tabung   = " + tb.hitungLuas());

        } else {
            System.out.println("Pilihan tidak tersedia!");
        }
        
        input.close();
    }
}
