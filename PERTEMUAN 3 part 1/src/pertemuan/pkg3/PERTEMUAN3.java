/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pertemuan.pkg3;

import javax.swing.JOptionPane;

/**
 *
 * @author Tangkas
 * TGL : 22-Maret-2025
 */
public class PERTEMUAN3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int now = 0;
        int nanti = 0;
        int awal = now;
        
        
       now = Integer.parseInt(JOptionPane.showInputDialog("Input Nilai Awal :"));
       nanti = Integer.parseInt(JOptionPane.showInputDialog("Input Nilai Akhir :"));

       int akhir = nanti;
       
       System.out.println("Perulangan While");
       awal = now;
       while(awal<akhir){
            System.out.println("perulangan ke = "+ awal);
            awal++;
       }
       
       
       System.out.println("Perulangan Do..while");
       awal = now;
       do{
           System.out.println("Perulangan ke = "+awal);
           awal++;
       }while(awal<akhir);
       
       
        System.out.println("Perulangan dengan for ");
        for(awal=now; awal<akhir; awal++){
            System.out.println("Perulangan ke = "+awal);
        }
        // TODO code application logic here
    }
    
}
