/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas.ruang;

import tugas.bidang.PersegiPanjang;

/**
 *
 * @author GF63-9RCX
 */
public class Balok extends PersegiPanjang implements BangunRuang{
    
    private double tinggi;

    public Balok(double tinggi, double panjang, double lebar) {
        super(panjang, lebar);
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
      return luas()*tinggi;
    }

    @Override
    public double luaspermukaan() {
       return 2*(luas()+getPanjang()*tinggi+getLebar()*tinggi);
    }
    
    
    
}
