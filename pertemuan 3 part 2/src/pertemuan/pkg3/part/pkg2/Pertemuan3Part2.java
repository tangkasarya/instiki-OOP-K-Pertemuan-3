/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pertemuan.pkg3.part.pkg2;


/**
 *
 * @author Tangkas
 * 22 Maret 2025
 */
import java.util.Scanner;
public class Pertemuan3Part2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int nilai = 0;
        String nama = "";
        String NIM = "";
        String ket = "";
        
        Scanner dtIN = new Scanner(System.in);
        
        System.out.print("Input Nama Mahasiswa :");
        nama = dtIN.nextLine();
        System.out.print("Input NIM : ");
        NIM = dtIN.nextLine();
        System.out.print("Input Nilai :");
        nilai = Integer.parseInt(dtIN.nextLine());
        //dinyatakan lulus jika nilai 60 keatas
        if(nilai >= 60){
            ket = "Lulus";
        }else{
            ket = "tidak lulus";
        }
        //ditanyatakan lulus jika nilai di bawah 60
//        if(nilai <= 60){
//            ket = "Tidak Lulus";
//        }else{
//            ket = "lulus";
//        }
        System.out.printf("Nilai Mahasiswa dengan nama %s (%s) adalah %d dinaytakan %s", nama,NIM,nilai,ket);
        // TODO code application logic here
    }
    
}
