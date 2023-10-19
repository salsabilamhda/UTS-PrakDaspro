// Nama : Salsabila Mahda Runisha 
// NIM : 2341720257
import java.util.Scanner;
public class UtsNimGanjil {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double totalHarga = 0;
        int jumlahMinuman = 0, jumlahBarang = 0;
    

        while (true) {
            System.out.print("Masukkan jenis barang (minuman/makanan): ");
            String jenisBarang = input.nextLine();
            if (jenisBarang.equalsIgnoreCase("selesai")) {
                break;
            }
            System.out.print("Masukkan Nama Barang: ");
            String namaBarang = input.nextLine();

            System.out.print("Masukkan harga barang: ");
            double hargaBarang = input.nextDouble();
            input.nextLine(); 

            if (jenisBarang.equalsIgnoreCase("minuman")) {
                jumlahMinuman++;
                totalHarga += hargaBarang;
                if (jumlahMinuman == 3) {
                    double potongan = 0.05 * totalHarga;
                    totalHarga -= potongan;
                }
            } else {
                totalHarga += hargaBarang;
            }
        }

        System.out.print("Mau beli kantong plastik (ya/tidak)? ");
        String beliKantongPlastik = input.nextLine();

        if (beliKantongPlastik.equalsIgnoreCase("ya")) {
            totalHarga += 200;
        }

        if (totalHarga >= 1000000) {
            double ppn = totalHarga * 0.07;
            totalHarga = totalHarga + ppn;
        }

        System.out.println("Total biaya yang harus dibayarkan: Rp. " + totalHarga);

        input.close();
    }
}

    

