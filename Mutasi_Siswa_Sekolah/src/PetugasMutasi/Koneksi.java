/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PetugasMutasi;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;


/**
 *
 * @author madey
 */
public class Koneksi {
    
    private String databaseName = "dbmutasi";
    private String username = "root";    
    private String password = "";
    private String lokasi = "jdbc:mysql://localhost/"+databaseName;
    public static Connection koneksiDB;
    
    public Koneksi (){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            koneksiDB = DriverManager.getConnection(lokasi,username,password);
            System.out.println("Database Terkoneksi");
        } catch (Exception e) {
            System.err.print(e.toString());
        }
    }
    
    public void simpandatasiswa (String paramnisn, String paramnamasiswa, String paramalamat, String paramjeniskelamin,
            String paramnpsn, String paramnamasekolahasal, String paramsekolahtujuan, String paramketerangan ){
        
        
        try{
            String SQL =" INSERT INTO datasiswa (nisn, nama_siswa, alamat, jenis_kelamin, npsn, nama_sekolah_asal, sekolah_tujuan, keterangan  )"
                    + "VALUES (?,?,?,?,?,?,?,?)";
            
            PreparedStatement perintah = koneksiDB.prepareStatement (SQL);
            perintah.setString(1, paramnisn);
            perintah.setString(2, paramnamasiswa);
            perintah.setString(3, paramalamat);
            perintah.setString(4, paramjeniskelamin);
            perintah.setString(5, paramnpsn);
            perintah.setString(6, paramnamasekolahasal);
            perintah.setString(7, paramsekolahtujuan);
            perintah.setString(8, paramketerangan);
            perintah.executeUpdate();
                  System.out.println("Data Berhasil disimpan");
        }catch (Exception e){
            System.out.println(e.getMessage());   
        }
        
    }
    public void ubahdatasiswa (String paramnisn, String paramnamasiswa, String paramalamat, String paramjeniskelamin,
            String paramnpsn, String paramnamasekolahasal, String paramsekolahtujuan, String paramketerangan ){
        
        
        try{
            String SQL =" UPDATE datasiswa SET nama_siswa=?, alamat=?, jenis_kelamin=?, npsn=?, nama_sekolah_asal=?, sekolah_tujuan=?, keterangan=?"
                    + "WHERE nisn=?";
            
            PreparedStatement perintah = koneksiDB.prepareStatement (SQL);
            perintah.setString(1, paramnamasiswa);
            perintah.setString(2, paramalamat);
            perintah.setString(3, paramjeniskelamin);
            perintah.setString(4, paramnpsn);
            perintah.setString(5, paramnamasekolahasal);
            perintah.setString(6, paramsekolahtujuan);
            perintah.setString(7, paramketerangan);
            perintah.setString(8, paramnisn);
            perintah.executeUpdate();
                  System.out.println("Data Berhasil diUbah");
        }catch (Exception e){
            System.out.println(e.getMessage());   
        }
        
    }
    
    public void hapusdatasiswa(String paramnisn){
        try{
            String SQL = "DELETE FROM datasiswa WHERE nisn=?";
            PreparedStatement perintah = koneksiDB.prepareStatement(SQL);
            perintah.setString(1, paramnisn);
            perintah.executeUpdate();
            System.out.println("Data bBerhasil diHapus");
        } catch (Exception e){
            System.err.println(e.getMessage());
        }
    }
    
    public void caridatasiswa(String paramnisn) {
        try{
            String SQL = "SELECT*FROM datasiswa WHERE nisn=?";
            PreparedStatement perintah = koneksiDB.prepareStatement(SQL);
            perintah.setString(1, paramnisn);
            ResultSet data = perintah.executeQuery();
            while(data.next()){
                System.out.println("nama_siswa:"+ data.getString("nama_siswa"));
                System.out.println("alamat :"+ data.getString("alamat"));
                System.out.println("jenis_kelamin :"+ data.getString("jenis_kelamin"));
                System.out.println("npsn:"+ data.getString("npsn"));
                System.out.println("nama_sekolah_asal :"+ data.getString("nama_sekolah_asal"));
                System.out.println("sekolah_tujuan :"+ data.getString("sekolah_tujuan"));
                System.out.println("keterangan:"+ data.getString("keterangan"));
            }
        }catch (Exception e){
            System.err.println(e.getMessage());   
        }
        
        
    }
    
    public void datadatasiswa(){
        try{
            Statement stmt = koneksiDB.createStatement();
            ResultSet baris = stmt.executeQuery("SELECT * FROM datasiswa ORDER BY nisn ASC ");
            while(baris.next()){
                System.out.println(baris.getString("nisn")+" | "+
                        baris.getString("nama_siswa")+" | "+
                        baris.getString("alamat")+" | "+
                        baris.getString("jenis_kelamin")+" | "+
                        baris.getString("npsn")+"|"+
                        baris.getString("nama_sekolah_asal")+" | "+
                        baris.getString("sekolah_tujuan")+" | "+
                        baris.getString("keterangan"));
            }
        }catch (Exception e){
            System.err.println(e.getMessage());
        }
                
    }
}    
    