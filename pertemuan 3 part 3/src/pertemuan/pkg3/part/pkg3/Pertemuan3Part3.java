/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pertemuan.pkg3.part.pkg3;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Tangkas
 * 22 Maret 2025
 */
public class Pertemuan3Part3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String pilih = "";
        
        System.out.println("Menu Pilihian :");
        System.out.println("-------------------");
        System.out.println("A. Menu A");
        System.out.println("B. Menu B");
        System.out.println("C. Menu C");
        System.out.println("Silahkan pilih menu (A/B/C)");
        System.out.println("Silahkan inputkan :");
//        pilih = JOptionPane.showInputDialog("Pilih Menu");
        Scanner input = new Scanner(System.in);
        pilih = input.nextLine();
        switch (pilih) {
            case "A":
                System.out.println("Memilih Menu A");
                break;
            case "B":
                System.out.println("Memilih Menu B");
                break;
            case "C":
                System.out.println("Memilih Menu C");
                break;
            default:
                System.out.println("Pilihan Menu Tidak sesuai");
        }
        // TODO code application logic here
    }
    
}
