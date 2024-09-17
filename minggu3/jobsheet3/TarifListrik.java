import java.util.Scanner;

public class TarifListrik {
    public static void main(String[] args) {

        int totalPenggunaanListrik ;
        int tarif = 1500;
        
        //1. Input 
        Scanner input = new Scanner(System.in) ;
        totalPenggunaanListrik = input.nextInt();

        //2. hitung tarif 
        double totalTarif = tarif * totalPenggunaanListrik ; 

        //cek 
        System.out.println("Lebih dari 500 kWh " + (totalPenggunaanListrik > 500));
        System.out.println("Total tarif = " + totalTarif);
        
        input.close();
        
    }
    
}
