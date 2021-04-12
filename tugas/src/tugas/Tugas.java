/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas;

import java.util.Scanner;
import tugas.ruang.Balok;
import tugas.ruang.Kerucut;

/**
 *
 * @author isnaini
 */
public class Tugas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        do{
        
        int pilih,panjang,lebar,tinggi,jari,tinggiK;
        Scanner cin = new Scanner(System.in); 
        
        System.out.println("===== INPUT =====");
        System.out.println("1. Balok");
        System.out.println("2. Kerucut");
        System.out.println("3. exit");
        System.out.print("pilih : "); pilih = cin.nextInt();
        
        switch(pilih){
        
            case 1: 
                System.out.print("PANJANG : "); panjang = cin.nextInt();
                System.out.print("LEBAR : "); lebar = cin.nextInt();
                System.out.println("TINGGI"); tinggi = cin.nextInt();
                
                Balok balok = new Balok(tinggi,panjang,lebar);
                
                System.out.println("===== OUTPUT =======");
                System.out.println("LUAS PERSEGI : " + balok.luas());
                System.out.println("KELILING PERSEGI : " + balok.keliling());
                System.out.println("VOLUME : " + balok.volume());
                System.out.println("LUAS PERMUKAAN BALOK : " + balok.luaspermukaan());
                
                
                break;
            case 2 :
                System.out.print("JARI : "); jari = cin.nextInt();
                System.out.print("TINGGI : "); tinggiK = cin.nextInt();
                
                Kerucut kerucut = new Kerucut(tinggiK,jari);
                
                System.out.println("===== OUTPUT =======");
                System.out.println("LUAS LINGKARAN : " + kerucut.luas());
                System.out.println("KELILING LINGKARAN : " + kerucut.keliling());
                System.out.println("VOLUME KERUCUT : " + kerucut.volume());
                System.out.println("LUAS PERMUKAAN KERUCUT : " + kerucut.luaspermukaan());
                
                break;
        
        
        } 
       }while(true);
        
    }
        // TODO code application logic here
    }
    

