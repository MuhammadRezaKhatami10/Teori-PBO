/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Exercise1;

/**
 *
 * @author boy
 */
public class Manager extends Pegawai{
    private int tunjangan;

    Manager( String nama, int gaji, int tunjangan) {
        super(nama, gaji);
        this.tunjangan = tunjangan;
    }

    @Override
    public int getGaji() {
        return gaji;
    }
        
    public int getTunjangan() {
        return tunjangan;
    }
    
}
