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
public class TestElektronik {
    public static void main(String[] args) {
        Manusia indro = new Manusia();
        TelevisiJadul tvjadul = new TelevisiJadul();
        TelevisiModern tvmodern = new TelevisiModern();
        
        indro.nyalakanPerengkat(tvjadul);
        indro.nyalakanPerengkat(tvmodern);
    }
}
