package Menu;

import java.util.Scanner;

import Mobil.Avanza;
import Mobil.Brio;
import Mobil.Mobil;

public class MenuInput extends Menu {

    @Override
    public Mobil display() {
        Scanner input = new Scanner(System.in);

        System.out.println("== Tambah Data ==");
        System.out.println("Jenis Mobil:");
        System.out.println("1. Avanza");
        System.out.println("2. Brio");
        System.out.print("Pilih [1-2]: ");
        int pilih = input.nextInt();
        input.nextLine(); // Clear Buffer

        if (pilih == 1) {
            Mobil avanza = new Avanza();
            System.out.println("Jenis Mobil\t\t: Avanza");

            System.out.print("Masukan Nama Mobil\t: ");
            avanza.setNama(input.nextLine());

            System.out.print("Masukan Tahun Produksi\t: ");
            avanza.setTahunProduksi(input.nextInt());

            input.nextLine(); // Clear Buffer

            System.out.print("Masukan Warna Mobil\t: ");
            avanza.setWarna(input.nextLine());
            return avanza;
        } else if (pilih == 2) {
            Mobil brio = new Brio();
            System.out.println("Jenis Mobil\t\t: Brio");

            System.out.print("Masukan Nama Mobil\t: ");
            brio.setNama(input.nextLine());

            System.out.print("Masukan Tahun Produksi\t: ");
            brio.setTahunProduksi(input.nextInt());

            input.nextLine(); // Clear Buffer

            System.out.print("Masukan Warna Mobil\t: ");
            brio.setWarna(input.nextLine());
            return brio;
        } else {
            return null;
        }
    }

    @Override
    public void display(Mobil[] mobil) {
    }

}
