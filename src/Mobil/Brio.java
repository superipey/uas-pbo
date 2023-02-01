package Mobil;

public class Brio extends Mobil {

    @Override
    public int tampilKecepatan() {
        if (super.getTahunProduksi() > 2022) return 220;
        else return 160;
    }

    @Override
    public String tampilCaraMenyalakan() {
        if (super.getTahunProduksi() > 2022) return "Engine Start Button";
        return "Kunci";
    }

    @Override
    public String tampilJenisMobil() {
        return "Brio";
    }

}
