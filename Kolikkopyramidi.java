/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package kolikkopyramidi;

/**
 *
 * @author jonir
 */
import java.util.Random;

public class Kolikkopyramidi {

    /**
     * @param args the command line arguments
     */

    int korkeus = 0;
    int indeksi = 0;
    double voittotaulukko[];
    
    private void MaaritaVoitot(){
        double voitto = 0;
        //Voittotaulukolla määritämme annettavan voiton, kun "kolikko" päätyy sinne asti.
        for (int i = 0; i < (korkeus/2)+1; i++){
            
            voittotaulukko[i] = voitto;
            voittotaulukko[korkeus-1-i] = voitto;
            voitto += 0.25;
        }
        
        
    }
    
    private void TulostaPyramidi(){
        int tyhjat = korkeus-1;
        for (int j = 0; j < korkeus-1; j++){
            for (int i = 0; i <= tyhjat; i++){
                System.out.print(" ");
            }
            for (int i = 0; i <= j; i++){
                System.out.print("x ");
            }
            tyhjat--;
            System.out.println("");
        }
        for (Double i : voittotaulukko){
            System.out.print(i + " ");
        }
    }
    
    public Kolikkopyramidi(int korkeus){
        this.korkeus = korkeus;
        voittotaulukko = new double[korkeus];
        MaaritaVoitot();
        TulostaPyramidi();
    }
    public Kolikkopyramidi(){
        this.korkeus = 6;
        voittotaulukko = new double[6];
         MaaritaVoitot();
        TulostaPyramidi();
    }
    
    public double SyotaKolikko(){
        Random sattuma = new Random();
        indeksi = 0;
        int suunta = 0;
        
        System.out.println("Kolikko meni oikealle");
        indeksi++;
        //Kolikko ei saa mennä pyramidin ulkopuolelle.
        //Muuten voimme mennä joko vasemmalle tai oikealle
        for (int i = 1; i < korkeus-1; i++){
            suunta = sattuma.nextInt(2);
            
            if (indeksi == 0){
                indeksi++;
            }
            else if (indeksi == korkeus-1){
                indeksi--;
            }
            
            else {
                 indeksi = (suunta == 1) ? indeksi+1 : indeksi-1;
            }
           
            if (suunta == 1){
                System.out.print("Kolikko meni oikealle    ");
            }
            else {
                System.out.print("Kolikko meni vasemmalle    ");
            }
            
        }
        
        return voittotaulukko[indeksi];
    }
    
    
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
