package app;

import exception.ValidationException;
import model.Kendaraan;
import model.ParkirItem;
import service.ParkirService;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ParkirService parkirService = new ParkirService();
        boolean running = true;

        while (running) {
            System.out.println("\n=== SISTEM PARKIR OTOMATIS ===");
            System.out.println("1. Kendaraan Masuk");
            System.out.println("2. Kendaraan Keluar");
            System.out.println("3. Daftar Kendaraan");
            System.out.println("4. Total Pendapatan");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");
            
            String input = scanner.nextLine();

            switch (input) {
                case "1":
                    try {
                        System.out.print("Plat Nomor: ");
                        String plat = scanner.nextLine();
                        System.out.print("Jenis (1=Motor, 2=Mobil): ");
                        int jenis = Integer.parseInt(scanner.nextLine());
                        Kendaraan k = new Kendaraan(plat, jenis == 1 ? "Motor" : "Mobil");
                        parkirService.kendaraanMasuk(k);
                    } catch (ValidationException e) {
                        System.out.println("Error: " + e.getMessage());
                    } catch (Exception e) {
                        System.out.println("Input tidak valid!");
                    }
                    break;

                case "2":
                    System.out.print("Plat Nomor: ");
                    String platKeluar = scanner.nextLine();
                    parkirService.kendaraanKeluar(platKeluar);
                    break;

                case "3":
                    parkirService.lihatDaftarParkir();
                    break;

                case "4":
                    System.out.println("Total Pendapatan: Rp " + parkirService.getTotalPendapatan());
                    break;

                case "0":
                    running = false;
                    break;

                default:
                    System.out.println("Pilihan tidak valid.");
            }
        }

        scanner.close();
    }
}
