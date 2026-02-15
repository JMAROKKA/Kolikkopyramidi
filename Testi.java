/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kolikkopyramidi;

/**
 *
 * @author jonir
 */
public class Testi {

    public static void main(String[] args){
        
        Kolikkopyramidi kp = new Kolikkopyramidi(25);
        double raha = 10.0;
        System.out.println("Sinulla on nyt:" + raha + "€");
        while (raha > 0){
            
            raha -= 1.0;
            if (raha < 0){
               break;
            }
            double voitto = kp.SyotaKolikko();
            raha += voitto;
            System.out.println("Voitit:" + voitto + "€");
            System.out.println("Sinulla on nyt:" + raha + "€");
        }
    }
}
