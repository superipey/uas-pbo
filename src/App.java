import java.util.Scanner;

import Menu.MenuInput;
import Menu.MenuTampil;
import Mobil.Mobil;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        System.out.println("=========================================");
        System.out.println("| Aplikasi [Nama Aplikasi]              |");
        System.out.println("| Dibuat Oleh: [NIM-Kelas-Nama Lengkap] |");
        System.out.println("=========================================");

        int pilih, index = 0;
        MenuInput menuInput = new MenuInput();
        MenuTampil menuTampil = new MenuTampil();
        Mobil mobil[] = new Mobil[100];

        do {
            System.out.println("1. Tambah Data");
            System.out.println("2. Ubah Data");
            System.out.println("3. Lihat Seluruh Data");
            System.out.println("4. Keluar dari Aplikasi");
            System.out.print("Pilih Menu [1-4]: ");
            pilih = input.nextInt();
            
            System.out.println("");

            if (pilih == 1) {
                mobil[index] = menuInput.display();
                index++;
            }
            else if (pilih == 2) {
                int dataIndex = 0;
                menuTampil.display(mobil);
                System.out.print("Masukan data yang akan diubah: ");
                dataIndex = input.nextInt() - 1;
                mobil[dataIndex] = menuInput.display();
            }
            else if (pilih == 3) menuTampil.display(mobil);
            else if (pilih == 4) System.out.println("Keluar dari aplikasi");
            else System.out.println("Pilihan Tidak Sesuai");
        } while (pilih != 4);
    }
}
