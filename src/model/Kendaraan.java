package model;

public class Kendaraan {
    private String platNomor;
    private String jenis;

    public Kendaraan(String platNomor, String jenis) {
        this.platNomor = platNomor;
        this.jenis = jenis;
    }

    public String getPlatNomor() {
        return platNomor;
    }

    public String getJenis() {
        return jenis;
    }
}
