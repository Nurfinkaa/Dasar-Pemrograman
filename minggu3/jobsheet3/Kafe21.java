import java.util.Scanner;

public class Kafe21 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // 1. input 
        boolean keanggotaan;
        int jmlKopi, jmlTeh, jmlRoti;
        double hargaKopi = 12000.0, hargaTeh = 7000.0, hargaRoti = 20000.0;
        float diskon = 10 / 100f;
        double totalHarga;
        double nominalBayar;

        // 2. Hitung
        System.out.print("Masukan keanggotaan (true/false): ");
        keanggotaan = input.nextBoolean();
        System.out.print("Masukan jumlah pembelian kopi: ");
        jmlKopi = input.nextInt();
        System.out.print("Masukan jumlah pembelian teh: ");
        jmlTeh = input.nextInt();
        System.out.print("Masukan jumlah pembelian roti: ");
        jmlRoti = input.nextInt();
        totalHarga = (jmlKopi * hargaKopi) + (jmlTeh * hargaTeh) + (jmlRoti * hargaRoti);
        byte totalByte = (byte) totalHarga ;
        nominalBayar = totalHarga - (diskon * totalHarga) ;
        int nominalint = (int ) nominalBayar;

        // Menampilkan informasi
        System.out.println("Keanggotaan pelanggan: " + keanggotaan);
        System.out.println("Item pembelian: " + jmlKopi + " kopi, " + jmlTeh + " teh, " + jmlRoti + " roti");
        System.out.println("Nominal Bayar: Rp " + nominalBayar);
        System.out.println("Nomial Int : Rp " + nominalint);
        System.out.println("Total harga : Rp " + totalByte);

        input.close();
    }
}
