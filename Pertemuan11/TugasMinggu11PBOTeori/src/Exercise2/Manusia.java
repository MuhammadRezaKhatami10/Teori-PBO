/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Exercise2;

/**
 *
 * @author boy
 */
public class Manusia {
    
    public void nyalakanPerengkat(Elektronik perangkat){
        if(perangkat instanceof TelevisiJadul){
            System.out.println("Nyalakan televisi jadul dengan input: " + ((TelevisiJadul)perangkat).getModeInput());
            System.out.println("Voltase televisi: " + perangkat.getVoltase());
        }
        else if (perangkat instanceof TelevisiModern){
            System.out.println("Nyalakan televisi jadul dengan input: " + ((TelevisiModern)perangkat).getModeInput());
            System.out.println("Voltase televisi: " + perangkat.getVoltase());
        }
    }
}
