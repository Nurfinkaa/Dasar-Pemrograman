import java.util.Scanner;

public class Tugas221 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;

        double jamKerja, upahPerJamKerja, gajiPokok, bonus, gajiKotor, pajak, gajiBersih ;  


        System.out.print("Masukkan jam kerja : ");
        jamKerja = sc.nextDouble();
        System.out.print("Masukkan upah per jam kerja : "); 
        upahPerJamKerja = sc.nextDouble();

        gajiPokok = jamKerja * upahPerJamKerja ;
        bonus = gajiPokok * 0.1 ;
        gajiKotor = gajiPokok + bonus ; 
        pajak = gajiPokok + bonus * 0.05 ;
        gajiBersih = gajiKotor - pajak ;
        
        System.out.println("Gaji pokok : Rp. " + gajiPokok );
        System.out.println("Bonus : Rp. " + bonus);
        System.out.println("Gaji kotor : Rp. " + gajiKotor);
        System.out.println("Pajak : Rp. " + pajak);
        System.out.println("Gaji bersih : Rp. " + gajiBersih);
        sc.close();

    }
    
}
