/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author MedicinaAviación
 */
public class aseguradorasDAO {
    PreparedStatement ps;
    ResultSet rs;
    conexion c = new conexion();
    Connection con;
    
    public List listar(){
        List<aseguradoras>lista=new ArrayList<>();
        String sql = "select * from  aseguradoras";
        try{
            con = c.conectar();
            ps= con.prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){
                aseguradoras a = new aseguradoras();
                a.setNit_aseguradora(rs.getInt(1));
                a.setNombre_aseguradora(rs.getString(2));
                lista.add(a);
            }
        } catch(Exception e){}
        return lista;
    }
    
    public int agregar(aseguradoras a){
        int respuesta = 0;
       String sql="insert into aseguradoras(nit_aseguradora, nombre_aseguradora) values (?,?)";
       try{
           con = c.conectar();
           ps=con.prepareStatement(sql);
           ps.setInt(1, a.getNit_aseguradora());
           ps.setString(2, a.getNombre_aseguradora());
            respuesta = ps.executeUpdate();
            if (respuesta==1) {
               respuesta=1;
           }else{
                respuesta=0;
            }
           
       }catch(Exception e){
           
       }
       return respuesta;
    }
    
    public aseguradoras listarNit(int nit){
        String sql="select * from aseguradoras where nit_aseguradora="+nit;
        aseguradoras a = new aseguradoras();
        try{
            con=c.conectar();
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery();
            while(rs.next()){
                a.setNit_aseguradora(rs.getInt(1));
                a.setNombre_aseguradora(rs.getString(2));
            }
            
        }catch(Exception e){
            
        }
        return a;
    }
    
    public int actualizar(aseguradoras a){
        String sql = "update aseguradoras set nombre_aseguradora=? where nit_aseguradora=?";
        int r=0;
        try{
          con=c.conectar();
          ps=con.prepareStatement(sql);
          ps.setInt(2, a.getNit_aseguradora());
          ps.setString(1, a.getNombre_aseguradora());
          r=ps.executeUpdate();
          
          if(r==1){
              r=1;
          }else{
              r=0;
          }
       }catch(SQLException e){
           
       }
       return r;
    }
    
    public int delete(String nit){
        int resultado=0;
        String sql="delete from aseguradoras where nit_aseguradora=" + nit;
        try{
            con=c.conectar();
            ps=con.prepareStatement(sql);
            resultado=ps.executeUpdate();
        }catch(SQLException e){
            
        }
        return resultado;
    } 
    
    public List ListarComboBoxAseguradoras(){
        List<aseguradoras> lista = new ArrayList<>();
        String sql ="select nit_aseguradora, nombre_aseguradora from aseguradoras";
        try{
            con=c.conectar();
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery();
            while(rs.next()){
                aseguradoras a = new aseguradoras();
                a.setNit_aseguradora(rs.getInt(1));
                a.setNombre_aseguradora(rs.getString(2));
                lista.add(a);
            }   
        }
        catch(SQLException e){
            System.out.println("error" + e);
        }
        return lista;
    }
    

}
