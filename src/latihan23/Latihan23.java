/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan23;

import java.util.Scanner;

/**
 *
 * @author lutfi
 * NAMA  : LUTFI RAMADHAN
 * NIM   : 10118908
 * KELAS : IF 11 KARYAWAN
 */
public class Latihan23 {

    /**
     * @return 
     */
    
    private static int cariTerkecil(int[] nilai_mhs){
        int max = 0, min = 0, tmp = 0;
        for (int i = 0; i < nilai_mhs.length; i++) {
            for (int j = i; j < nilai_mhs.length; j++) {
                if (nilai_mhs[i] > nilai_mhs[j]) {
                    if (tmp > nilai_mhs[j]) {
                        min = nilai_mhs[j];
                    }
                    tmp = nilai_mhs[j];
                }
            }
        }
        return min;
    }
    
    private static int cariTerbesar(int[] nilai_mhs) {
        int max = 0, min = 0, tmp = 0;
        for (int i = 0; i < nilai_mhs.length; i++) {
            for (int j = i; j < nilai_mhs.length; j++) {
                if (max < nilai_mhs[i]) {
                    max = nilai_mhs[i];
                    if (max < nilai_mhs[j]) {
                        max = nilai_mhs[j];
                    }
                }
            }
        }
        return max;
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.println("=====Program Nilai Terbesar dan Terkecil Nilai Mahasiswa");
        System.out.print("Masukkan Nama Petugas : ");
        String petugas = sc.next();
        System.out.print("Masukkan Banyaknya Nilai Mahasiswa : ");
        int jml_mhs = sc.nextInt();
        int[] nilai_mhs = new int[jml_mhs];
        for (int i = 0; i < jml_mhs; i++) {
            System.out.print("Masukkan Nilai Mahasiswa Ke-"+(i+1)+" = ");
            nilai_mhs[i] = sc.nextInt();
        }
        System.out.println("Nilai Terbesar adalah "+cariTerbesar(nilai_mhs));
        System.out.println("Nilai Terkecil adalah "+cariTerkecil(nilai_mhs));
        System.out.println("\nPetugas "+petugas);
    }
    
}
