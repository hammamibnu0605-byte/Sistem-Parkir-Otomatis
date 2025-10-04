package model;

public class ParkirItem {
    private Kendaraan kendaraan;
    private long waktuMasuk;
    private long waktuKeluar;
    private int biaya;

    public ParkirItem(Kendaraan kendaraan) {
        this.kendaraan = kendaraan;
        this.waktuMasuk = System.currentTimeMillis();
    }

    public Kendaraan getKendaraan() {
        return kendaraan;
    }

    public long getWaktuMasuk() {
        return waktuMasuk;
    }

    public void setWaktuKeluar(long waktuKeluar) {
        this.waktuKeluar = waktuKeluar;
    }

    public long getWaktuKeluar() {
        return waktuKeluar;
    }

    public void setBiaya(int biaya) {
        this.biaya = biaya;
    }

    public int getBiaya() {
        return biaya;
    }
}
