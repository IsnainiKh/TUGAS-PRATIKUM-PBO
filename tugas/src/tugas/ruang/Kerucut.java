/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas.ruang;

import tugas.bidang.Lingkaran;

/**
 *
 * @author GF63-9RCX
 */
public class Kerucut extends Lingkaran implements BangunRuang {
    private double tinggi;

    public Kerucut(double tinggi, double jari) {
        super(jari);
        this.tinggi = tinggi;
    }

    public double getTinggi() {
        return tinggi;
    }

    public void setTinggi(double tinggi) {
        this.tinggi = tinggi;
    }

    @Override
    public double volume() {
        return (luas()*tinggi)/3;
       
    }

    @Override
    public double luaspermukaan() {
      return luas()+Math.PI*getJari()*sisiMiring();
    } 
    
    private double sisiMiring(){
        
        return Math.sqrt(tinggi*tinggi+getJari()*getJari());
    
    }
    
}
