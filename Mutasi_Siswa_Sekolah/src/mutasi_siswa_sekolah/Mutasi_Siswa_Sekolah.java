/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mutasi_siswa_sekolah;
import Siswa.*;
import java.util.Scanner;
import java.util.ArrayList;
import PetugasMutasi.Koneksi;

/**
 *
 * @author madey
 */
public class Mutasi_Siswa_Sekolah {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Koneksi db = new Koneksi ();
        
        //db.simpandatasiswa("123", "made", "bjm", "perempuan", "999", "banjar", "gambut", "bolos");
        //db.ubahdatasiswa("123", "anarki", "bjm", "perempuan", "999", "banjar", "gambut", "khasus");
        //db.hapusdatasiswa("123");
        //db.caridatasiswa("123");
        db.datadatasiswa();
        
     //   DataSiswa Saya = new DataSiswa ();
     //   Saya.isinisn("ryu");
     //   Saya.isinamasiswa("dth");
     //   Saya.isialamat("vvj");
     //   Saya.isijeniskelamin("vj");
     //   System.err.println("NISN : " + Saya.getnisn());
     //   System.err.println("NAMASISWA : " + Saya.getnamasiswa());
     //   System.err.println("ALAMAT : " + Saya.getalamat());
     //   System.err.println("JENISKELAMIN : " + Saya.getjeniskelamin());
        
      //  DataPermohonanMutasi Saya = new DataPermohonanMutasi();
      //  Scanner input  = new Scanner(System.in);
       
     //   System.out.print("Masukan NPSN : ");
     //   Saya.inputnpsn(input.nextLine());
     //   System.out.print("Masukan Nama Sekolah Asal : ");
     //   Saya.inputnamasekolahasal(input.nextLine());
     //   System.out.print("Masukan Sekolah Tujuan : ");
     //   Saya.inputsekolahtujuan(input.nextLine());
     //   System.out.print("Masukan Keterangan : ");
     //   Saya.inputketerangan(input.nextLine());
    }
    
}
