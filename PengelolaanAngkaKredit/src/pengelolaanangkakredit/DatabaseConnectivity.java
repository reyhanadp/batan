/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pengelolaanangkakredit;

import com.mysql.jdbc.Driver;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Dea
 */
public class DatabaseConnectivity {
    
    private static Connection conn;
    
    private final static String url = "jdbc:mysql://localhost:3306/batan";
    private final static String user  = "root";
    private final static String password = "";
    
    public static Connection getConnection() {
        try {
            DriverManager.registerDriver(new Driver());
            conn = DriverManager.getConnection(url, user, password);
        } catch (SQLException ex) {
            System.out.println("Koneksi database gagal dengan pesan : " + ex.getMessage());
        }
        return conn;
    }
}
