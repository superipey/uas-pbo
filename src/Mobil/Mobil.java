package Mobil;

public abstract class Mobil {
    private String nama;
    private String warna;
    private int tahunProduksi;
    
    public String getNama() {
        return nama;
    }
    public void setNama(String nama) {
        this.nama = nama;
    }
    public String getWarna() {
        return warna;
    }
    public void setWarna(String warna) {
        this.warna = warna;
    }
    public int getTahunProduksi() {
        return tahunProduksi;
    }
    public void setTahunProduksi(int tahunProduksi) {
        this.tahunProduksi = tahunProduksi;
    }
    public abstract int tampilKecepatan();
    public abstract String tampilCaraMenyalakan();
    public abstract String tampilJenisMobil();
}
