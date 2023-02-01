package Mobil;

public class Avanza extends Mobil {
    @Override
    public int tampilKecepatan() {
        if (super.getTahunProduksi() > 2022) return 150;
        else return 100;
    }

    @Override
    public String tampilCaraMenyalakan() {
        if (super.getTahunProduksi() > 2022) return "Engine Start Button";
        return "Kunci";
    }

    @Override
    public String tampilJenisMobil() {
        return "Avanza";
    }
}
