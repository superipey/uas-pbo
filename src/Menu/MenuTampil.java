package Menu;

import Mobil.Mobil;

public class MenuTampil extends Menu {

    @Override
    public void display(Mobil[] mobil) {
        System.out.println("== Tampil Data ==");
        System.out.println("No, Nama Mobil, Jenis Mobil, Tahun Produksi, Warna, Dinyalakan Dengan, Maksimum Kecepatan");
        for (int i = 0; i < mobil.length; i++) {
            if (mobil[i] == null) continue;

            System.out.printf("%d,%s,%s,%d,%s,%s,%d\n",
                i+1,
                mobil[i].getNama(),
                mobil[i].tampilJenisMobil(),
                mobil[i].getTahunProduksi(),
                mobil[i].getWarna(),
                mobil[i].tampilCaraMenyalakan(),
                mobil[i].tampilKecepatan()
            );
        }

        System.out.println("");
    }

    @Override
    public Mobil display() {
        return null;
    }
    
}
