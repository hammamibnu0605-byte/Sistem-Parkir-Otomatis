/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

/**
 *
 * @author ACER
 */
import exception.ValidationException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import model.Kendaraan;
import model.ParkirItem;

public class ParkirService {
    private List<ParkirItem> daftarParkir = new ArrayList<>();
    private static int totalPendapatan = 0;

    public void kendaraanMasuk(Kendaraan kendaraan) {
        for (ParkirItem item : daftarParkir) {
            if (item.getKendaraan().getPlatNomor().equalsIgnoreCase(kendaraan.getPlatNomor())) {
                throw new ValidationException("Kendaraan dengan plat " + kendaraan.getPlatNomor() + " sudah parkir.");
            }
        }
        daftarParkir.add(new ParkirItem(kendaraan));
        System.out.println("Kendaraan " + kendaraan.getPlatNomor() + " berhasil masuk parkir.");
    }

    public void kendaraanKeluar(String platNomor) {
        Iterator<ParkirItem> iterator = daftarParkir.iterator();
        while (iterator.hasNext()) {
            ParkirItem item = iterator.next();
            if (item.getKendaraan().getPlatNomor().equalsIgnoreCase(platNomor)) {
                item.setWaktuKeluar(System.currentTimeMillis());

                // hitung durasi dalam jam
                long durasiMs = item.getWaktuKeluar() - item.getWaktuMasuk();
                int durasiJam = (int) Math.ceil(durasiMs / (1000.0 * 60 * 60));

                // tarif per jenis kendaraan
                int tarif = item.getKendaraan().getJenis().equalsIgnoreCase("Motor") ? 2000 : 5000;
                int biaya = tarif * durasiJam;
                item.setBiaya(biaya);

                totalPendapatan += biaya;

                System.out.println("Kendaraan " + platNomor + " keluar. Durasi: " + durasiJam + " jam. Biaya: Rp " + biaya);

                iterator.remove();
                return;
            }
        }
        System.out.println("Kendaraan dengan plat " + platNomor + " tidak ditemukan.");
    }

    public void lihatDaftarParkir() {
        if (daftarParkir.isEmpty()) {
            System.out.println("Tidak ada kendaraan yang sedang parkir.");
        } else {
            System.out.println("Daftar Kendaraan yang sedang parkir:");
            for (ParkirItem item : daftarParkir) {
                System.out.println("- Plat: " + item.getKendaraan().getPlatNomor() + " | Jenis: " + item.getKendaraan().getJenis());
            }
        }
    }

    public int getTotalPendapatan() {
        return totalPendapatan;
    }
}