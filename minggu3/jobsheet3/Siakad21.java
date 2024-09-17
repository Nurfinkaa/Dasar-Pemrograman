import java.util.Scanner;

public class Siakad21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in) ; 

        String nama,nim ; 
        char kelas ; 
        byte absen ;
        double nilaiKuis, nilaiTugas, nilaiUTS, nilaiUAS, nilaiAkhir ; 

        System.out.print("Masukan nama: " );
        nama = sc.nextLine();
        System.out.print("Masukan Nim: " ) ;
        nim = sc.nextLine();
        System.out.print("Masukan kelas: ");
        kelas = sc.nextLine().charAt(0) ;
        System.out.print("Masukan nomer absen: ");
        absen = sc.nextByte() ;

        System.out.print("Masukan nilai kuis: ");
        nilaiKuis = sc.nextDouble() ;
        nilaiKuis = nilaiKuis * 20/100 ;
        System.out.print("Masukan nilai tugas: ");
        nilaiTugas = sc.nextDouble();
        nilaiTugas = nilaiTugas * 15/100;
        System.out.println("Masukan niali UTS: ");
        nilaiUTS = sc.nextDouble();
        nilaiUTS = nilaiUTS * 30/100;
        System.out.println("Masukan nilai UAS: ");
        nilaiUAS = sc.nextDouble() ;
        nilaiUAS = nilaiUAS * 35/100;

        nilaiAkhir = nilaiKuis + nilaiTugas + nilaiUTS + nilaiUAS ;

        System.out.println("Nama: " + nama + "NIM: "+ nim ) ;
        System.out.println("Kelas: " + kelas + "Absen: " + absen);
        System.out.println("Nilai Akhir: " + nilaiAkhir );


        sc.close();

    }
}
