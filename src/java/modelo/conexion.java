/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;



/**
 *
 * @author MedicinaAviación
 */
public class conexion {
    Connection con;
    String url="jdbc:oracle:thin:@localhost:1521:XE";
    String user="userconconcretos";
    String pass="123";
    public Connection conectar(){
        try{
            Class.forName("oracle.jdbc.driver.OracleDriver");
            con = DriverManager.getConnection(url, user, pass);
        }catch(Exception e){}
        return con;
    }
    
}
