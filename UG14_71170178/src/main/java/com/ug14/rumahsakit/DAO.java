package com.ug14.rumahsakit;
import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DAO {
    private String url = "jdbc:sqlite:rumahsakit.db";

    public Connection connect() {
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(url);
            System.out.println("Koneksi berhasil.");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException ex) {
                System.out.println(ex.getMessage());
            }
        }
        return conn;
    }

    public void createNewDatabase() {
        try (Connection conn = DriverManager.getConnection(url)) {
            if (conn != null) {
                DatabaseMetaData meta = conn.getMetaData();
                System.out.println("Nama: " + meta.getDriverName());
                System.out.println("Database tercipta");
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public void createNewTable(){
        String sql = "CREATE TABLE IF NOT EXISTS rumahsakit (\n"
                +"      rm varchar(8) PRIMARY KEY, \n"
                +"      nama text NOT NULL, \n"
                +"      usia real\n"
                +"      alamat varchar(25), \n" +
                +;


    }
    public int getDokterByID(int idDokter){
        return idDokter;

    }

    public int getSusterByID (int idSuster){
        return idSuster;

    }

    public int getPelayananByID(int idPelayan){
        return idPelayan;

    }

    public void inputPasien(Pasien pasien){

    }

    public void inputJadwal(Jadwal jadwal){

    }

    public static void getPasienSembuh(){

    }
}
