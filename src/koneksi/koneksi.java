/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package koneksi;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author User
 */
public class koneksi {
    public static Object GetConnection() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    private Connection koneksi;
    public Connection connect(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("Koneksi Berhasil");            
        }catch (ClassNotFoundException ex){
            System.out.println("Koneksi Gagal " +ex);
        }
        String url = "jdbc:mysql://localhost:3306/hafna";
        try {
            koneksi = DriverManager.getConnection(url,"root","");
            System.out.println("Koneksi Database Berhasil");
        }catch (SQLException ex){
            
        }
        return koneksi;
    }  
}

