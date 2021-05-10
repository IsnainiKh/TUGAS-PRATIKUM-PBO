/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas.bidang;

/**
 *
 * @author GF63-9RCX
 */
public class Lingkaran implements BangunDatar{

    private double jari;

    public Lingkaran(double jari) {
        this.jari = jari;
    }

    @Override
    public double luas() {
        return Math.PI*jari*jari;
    }

    @Override
    public double keliling() {
      return 2*Math.PI*jari*jari;
    }

    public double getJari() {
        return jari;
    }

    public void setJari(double jari) {
        this.jari = jari;
    }
    
    
    
}
