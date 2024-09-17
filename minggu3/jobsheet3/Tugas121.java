import java.util.Scanner;

public class Tugas121 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 

        double penggunaanListrik ; 
        double tarifPerKwh = 1500 ; 
        double totalTagihan ; 
        boolean melebihiBatas = false ; 

        System.out.print("Masukan jumlah tagihan penggunaan listrik (kWh): " );
        penggunaanListrik = sc.nextDouble();

        totalTagihan = penggunaanListrik * tarifPerKwh ; 

        melebihiBatas = penggunaanListrik > 500 ;

        System.out.println("Total tagihan listrik: Rp. " + totalTagihan ) ;

        if (melebihiBatas) {
            System.out.println("Peringatan: Penggunaan listik melebihi batas 500 kWh.");
        }

        sc.close();

    }
    
}
