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
public class aseguradasDAO {
    PreparedStatement ps;
    ResultSet rs;
    conexion c = new conexion();
    Connection con;
    
    public List listar(){
        List<aseguradas>lista=new ArrayList<>();
        String sql = "select * from cons_aseguradas";
        try{
            con = c.conectar();
            ps= con.prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){
                aseguradas a = new aseguradas();
                a.setNit_asegurada(rs.getInt(1));
                a.setNombre_asegurada(rs.getString(2));
                a.setCc_rep_legal(rs.getInt(3));
                lista.add(a);
            }
        } catch(Exception e){}
        return lista;
    }
    
    public int agregar(aseguradas a){
        int respuesta = 0;
       String sql="insert into cons_aseguradas(nit_asegurado, nombre_asegurado, cc_rep_legal) values (?,?,?)";
       try{
           con = c.conectar();
           ps=con.prepareStatement(sql);
           ps.setInt(1, a.getNit_asegurada());
           ps.setString(2, a.getNombre_asegurada());
           ps.setInt(3, a.getCc_rep_legal());
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
    
    public aseguradas listarNit(int nit){
        String sql="select * from cons_aseguradas where nit_asegurado="+nit;
        aseguradas a = new aseguradas();
        try{
            con=c.conectar();
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery();
            while(rs.next()){
                a.setNit_asegurada(rs.getInt(1));
                a.setNombre_asegurada(rs.getString(2));
                a.setCc_rep_legal(rs.getInt(3));
            }
            
        }catch(Exception e){
            
        }
        return a;
    }
    
    public int actualizar(aseguradas a){
        String sql = "update cons_aseguradas set nombre_asegurado=?, cc_rep_legal=? where nit_asegurado=?";
        int r=0;
        try{
          con=c.conectar();
          ps=con.prepareStatement(sql);
          ps.setInt(3, a.getNit_asegurada());
          ps.setString(1, a.getNombre_asegurada());
          ps.setInt(2, a.getCc_rep_legal());
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
        String sql="delete from cons_aseguradas where nit_asegurado=" + nit;
        try{
            con=c.conectar();
            ps=con.prepareStatement(sql);
            resultado=ps.executeUpdate();
        }catch(SQLException e){
            
        }
        return resultado;
    }
    
    public List ListarComboBoxAsegurados(){
        List<aseguradas> lista = new ArrayList<>();
        String sql ="select nit_asegurado, nombre_asegurado from cons_aseguradas";
        try{
            con=c.conectar();
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery();
            while(rs.next()){
                aseguradas a = new aseguradas();
                a.setNit_asegurada(rs.getInt(1));
                a.setNombre_asegurada(rs.getString(2));
                lista.add(a);
            }   
        }
        catch(SQLException e){
            System.out.println("error" + e);
        }
        return lista;
    }
}
