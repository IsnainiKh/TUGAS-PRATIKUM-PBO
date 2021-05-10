
package Main;

import java.awt.event.*;
import javax.swing.*;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;
import tugas.ruang.Balok;

/**
 *
 * @author GF63-9RCX
 */

public class View extends JFrame implements ActionListener{
    
    JLabel lJudul = new JLabel("KALKULATOR BALOK");
    JLabel lPanjang = new JLabel("Panjang");
    JTextField fPanjang = new JTextField(10);    
    JLabel lLebar = new JLabel("Lebar");
    JTextField fLebar = new JTextField(10);
    JLabel lTinggi = new JLabel("Tinggi");
    JTextField fTinggi = new JTextField(10); 
    JLabel lHasil = new JLabel("Hasil :");
    JLabel lLuasP = new JLabel(); 
    JLabel lKeliling = new JLabel();    
    JLabel lVolume = new JLabel();    
    JLabel lLuasPermukaan = new JLabel();
    JButton bHitung = new JButton("Hitung");
    JButton bReset = new JButton("Reset");
    
    
    View(){
        setTitle("Tugas Pertemuan 5");
        setSize(500,650);
        setLayout(null);

        add(lJudul);
        add(lPanjang);
        add(fPanjang);
        add(lLebar);
        add(fLebar);
        add(lTinggi);
        add(fTinggi);
        add(lHasil);
        add(bHitung);
        add(bReset);
        
        lJudul.setBounds(150,5,300,30);
        lPanjang.setBounds(10,50,300,30);
        fPanjang.setBounds(90, 50, 300,30);
        lLebar.setBounds(10,100,150,20);
        fLebar.setBounds(90, 100, 300,30);
        lTinggi.setBounds(10,150,150,20);
        fTinggi.setBounds(90, 150, 300,30);
        lHasil.setBounds(50, 200, 150, 20);
        bHitung.setBounds(95, 500, 120, 50);
        bReset.setBounds(250, 500, 120, 50);
        bHitung.addActionListener(this);
        bReset.addActionListener(this);
        
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);  
        setLocationRelativeTo(null);
    }
    
    @Override
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == bHitung) {
            
            try{
                double panjang = Double.parseDouble(fPanjang.getText());
                double lebar = Double.parseDouble(fLebar.getText());
                double tinggi = Double.parseDouble(fTinggi.getText());


                Balok balok = new Balok(tinggi, panjang, lebar);
      

                lLuasP.setText      ("Luas Persegi                   : " + Double.toString(balok.luas()));
                add(lLuasP);
                lLuasP.setBounds(130, 250, 350, 30);
                
                lKeliling.setText  ("Keliling Persegi               : " + Double.toString(balok.keliling()));
                add(lKeliling);
                lKeliling.setBounds(130, 300, 350, 30);
                
                lVolume.setText    ("Volume Balok                   : " + Double.toString(balok.volume()));
                add(lVolume);
                lVolume.setBounds(130, 350, 350, 30);
                
                lLuasPermukaan.setText("Luas Permukaan Balok  : " + Double.toString(balok.luaspermukaan()));
                add(lLuasPermukaan);
                lLuasPermukaan.setBounds(130, 400, 350, 30);
                
            }
            catch(NumberFormatException e){
                JOptionPane.showMessageDialog(null, ""+e.getMessage());
            }
            
        }
        
        if (ae.getSource() == bReset) {
            fPanjang.setText(null);
            fLebar.setText(null);
            fTinggi.setText(null);
            lLuasP.setText(null);
            lKeliling.setText(null);
            lVolume.setText(null);
            lLuasPermukaan.setText(null);
        }
    }

    
    
}
