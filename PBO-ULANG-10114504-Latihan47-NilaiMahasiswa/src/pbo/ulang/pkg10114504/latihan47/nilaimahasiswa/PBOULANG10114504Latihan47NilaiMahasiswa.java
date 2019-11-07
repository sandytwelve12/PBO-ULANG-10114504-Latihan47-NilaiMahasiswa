/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo.ulang.pkg10114504.latihan47.nilaimahasiswa;

/**
 *
 * @author 
 * NAMA      : Sandy Akbar
 * KELAS     : PBO-ULANG
 * NIM       : 10114504
 * Deskripsi : Menampilkan Program hasil nilai akhir Mahasiswa
 */
public class PBOULANG10114504Latihan47NilaiMahasiswa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        NilaiMahasiswa nilaiMhs = new NilaiMahasiswa();
        nilaiMhs.setNilaiQuis(75);
        nilaiMhs.setNilaiUts(45);
        nilaiMhs.setNilaiUas(34);
        System.out.println("QUIZ \t\t= "+nilaiMhs.getNilaiQuis());
        System.out.println("UTS \t\t= "+nilaiMhs.getNilaiUts());
        System.out.println("UAS \t\t= "+nilaiMhs.getNilaiUas());
        System.out.println("");
        System.out.println("Nilai Akhir \t= "+nilaiMhs.nilaiAkhir
        (nilaiMhs.getNilaiQuis(),nilaiMhs.getNilaiUts(),nilaiMhs.getNilaiUas()));
        System.out.println("");
        System.out.println("Index \t= "+nilaiMhs.index(nilaiMhs.nilaiAkhir(
                nilaiMhs.getNilaiQuis(),nilaiMhs.getNilaiUts(),
                nilaiMhs.getNilaiUas())));
   
        System.out.println("Keterangan = "+nilaiMhs.keterangan
        (nilaiMhs.index(nilaiMhs.nilaiAkhir(
                nilaiMhs.getNilaiQuis(),nilaiMhs.getNilaiUts(),
                nilaiMhs.getNilaiUas()))));
    
    }  
    
    
}
