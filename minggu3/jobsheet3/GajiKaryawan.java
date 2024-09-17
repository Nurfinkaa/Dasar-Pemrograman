import java.util.Scanner;

public class GajiKaryawan {
    public static void main(String[] args) {
        
        //variabel 
        int jumlahJam, upahPerJam ;
        float perSenBonus = (float) 0.1,persenPajak = 0.05f ;

        //1.input
        Scanner sc = new Scanner (System.in); 
        jumlahJam = sc.nextInt();
        upahPerJam = sc.nextInt();

        //2. hitung gaji 
        int totalGaji = jumlahJam * upahPerJam;
        float bonus = perSenBonus * totalGaji;
        int totalGajiPlusBonus = totalGaji + (int) bonus;
        float pajak = persenPajak * totalGajiPlusBonus ;
        int gajiBersih = totalGajiPlusBonus - (int) pajak ;

        //output 
        System.out.println("Total Gaji = " + gajiBersih);
        System.out.println("Bonus = " + bonus);
        System.out.println("Pajak = " + pajak);
        System.out.println("Gaji bersih = " + gajiBersih);

        sc.close();

    }
    
}
