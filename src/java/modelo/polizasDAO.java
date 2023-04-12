/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import static jakarta.ws.rs.client.Entity.html;
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
public class polizasDAO {
    PreparedStatement ps;
    ResultSet rs;
    conexion c = new conexion();
    Connection con;
    
    public List listar(){
        List<polizas>lista=new ArrayList<>();
        String sql = "select numero_poliza, fecha_inicio_vigencia, fecha_fin_vigencia, valor_prima, aseguradoras.nit_aseguradora, aseguradoras.nombre_aseguradora, cons_aseguradas.nit_asegurado, cons_aseguradas.nombre_asegurado, cod_contrato, valor_contrato from polizas inner join aseguradoras on aseguradoras.nit_aseguradora = polizas.nit_aseguradora inner join cons_aseguradas on cons_aseguradas.nit_asegurado = polizas.nit_asegurado";
        try{
            con = c.conectar();
            ps= con.prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){
                polizas a = new polizas();
                a.setNumeroPoliza(rs.getString(1));
                a.setFechaInicio(rs.getString(2));
                a.setFechaFin(rs.getString(3));
                a.setValorPrima(rs.getString(4));
                a.setNitAseguradora(rs.getString(5));
                a.setNombreAseguradora(rs.getString(6));
                a.setNitAsegurado(rs.getString(7));
                a.setNombreAsegurado(rs.getString(8));
                a.setCodigoContrato(rs.getString(9));
                a.setValorContrato(rs.getString(10));
                lista.add(a);
            }
        } catch(SQLException e){
            System.out.println("error" + e);
        }
        return lista;
    }
        public List listarRiesgoVigencia(){
        List<polizas>lista=new ArrayList<>();
        String sql = "select numero_poliza, fecha_inicio_vigencia, fecha_fin_vigencia, valor_prima, aseguradoras.nit_aseguradora, aseguradoras.nombre_aseguradora, cons_aseguradas.nit_asegurado, cons_aseguradas.nombre_asegurado, cod_contrato, valor_contrato, riesgoVigencia(polizas.fecha_fin_vigencia) from polizas inner join aseguradoras on aseguradoras.nit_aseguradora = polizas.nit_aseguradora inner join cons_aseguradas on cons_aseguradas.nit_asegurado = polizas.nit_asegurado";
        try{
            con = c.conectar();
            ps= con.prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){
                polizas a = new polizas();
                a.setNumeroPoliza(rs.getString(1));
                a.setFechaInicio(rs.getString(2));
                a.setFechaFin(rs.getString(3));
                a.setValorPrima(rs.getString(4));
                a.setNitAseguradora(rs.getString(5));
                a.setNombreAseguradora(rs.getString(6));
                a.setNitAsegurado(rs.getString(7));
                a.setNombreAsegurado(rs.getString(8));
                a.setCodigoContrato(rs.getString(9));
                a.setValorContrato(rs.getString(10));
                a.setRiesgoVigencia(rs.getString(11));
                lista.add(a);
            }
        } catch(SQLException e){
            System.out.println("error" + e);
        }
        return lista;
    }
    
    public int agregar(polizas a){
        int respuesta = 0;
       String sql="insert into polizas(numero_poliza, fecha_inicio_vigencia, fecha_fin_vigencia, valor_prima, nit_aseguradora, nit_asegurado, cod_contrato, valor_contrato) values (?,to_date(?, 'YY-MM-DD'),to_date(?, 'YY-MM-DD'),?,?,?,?,?)";
       try{
           con = c.conectar();
           ps=con.prepareStatement(sql);
           ps.setString(1, a.getNumeroPoliza());
           ps.setString(2, a.getFechaInicio());
           ps.setString(3, a.getFechaFin());
           ps.setString(4, a.getValorPrima());
           ps.setString(5, a.getNitAseguradora());
           ps.setString(6, a.getNitAsegurado());
           ps.setString(7, a.getCodigoContrato());
           ps.setString(8, a.getValorContrato());
           respuesta = ps.executeUpdate();
           if (respuesta==1) {
               respuesta=1;
           }else{
                respuesta=0;
            }
           
       }catch(SQLException e){
           System.out.println("error" + e);
       }
       return respuesta;
    }
    
    public polizas listarNit(String numero){
        String sql="select * from polizas where numero_poliza="+numero;
        polizas a = new polizas();
        try{
            con=c.conectar();
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery();
            while(rs.next()){
                a.setNumeroPoliza(rs.getString(1));
                a.setFechaInicio(rs.getString(2));
                a.setFechaFin(rs.getString(3));
                a.setValorPrima(rs.getString(4));
                a.setNitAseguradora(rs.getString(5));
                a.setNitAsegurado(rs.getString(6));
                a.setCodigoContrato(rs.getString(7));
                a.setValorContrato(rs.getString(8));
            }
            
        }catch(SQLException e){
            System.out.println("error" + e);
        }
        return a;
    }
    
    public int actualizar(polizas a){
        String sql = "update polizas set fecha_inicio_vigencia=?, fecha_fin_vigencia=?, valor_prima=?, nit_aseguradora=?, nit_asegurado=?, cod_contrato=?, valor_contrato=? where numero_poliza=?";
        int r=0;
        try{
          con=c.conectar();
          ps=con.prepareStatement(sql);
          
          ps.setString(8, a.getNumeroPoliza());
          ps.setString(7, a.getValorContrato());
          ps.setString(6, a.getCodigoContrato());
          ps.setString(5, a.getNitAsegurado());
          ps.setString(4, a.getNitAseguradora());
          ps.setString(3, a.getValorPrima());
          ps.setString(2, a.getFechaFin());
          ps.setString(1, a.getFechaInicio());
          r=ps.executeUpdate();
          
          if(r==1){
              r=1;
          }else{
              r=0;
          }
       }catch(SQLException e){
           System.out.println("error" + e);
       }
       return r;
    }
    
    public int delete(String numero){
        int resultado=0;
        String sql="delete from polizas where numero_poliza=" + numero;
        try{
            con=c.conectar();
            ps=con.prepareStatement(sql);
            resultado=ps.executeUpdate();
        }catch(SQLException e){
            int r= e.getErrorCode();
            System.out.println("el error es:" + r);
            switch(r){
                case 1:
                
                break;
            }
        }
        return resultado;
    }
    
    public List ListarComboBoxAseguradoras(){
        List<aseguradoras> lista = new ArrayList<>();
        String sql ="select nombre_aseguradora from aseguradoras";
        try{
            con=c.conectar();
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery();
            while(rs.next()){
                aseguradoras a = new aseguradoras();
                a.setNombre_aseguradora(rs.getString(1));
                lista.add(a);
            }   
        }
        catch(SQLException e){
            System.out.println("error" + e);
        }
        return lista;
    }
    
    public List listarSecuencia(){
        List<polizas> lista = new ArrayList<>();
        String sql ="select secuenciaPolizas.nextval from dual";
        try{
            con=c.conectar();
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery();
            while(rs.next()){
                polizas a = new polizas();
                a.setNumeroPoliza(rs.getString(1));
                lista.add(a);
            }   
        }
        catch(SQLException e){
            System.out.println("error" + e);
        }
        return lista;
    }
}
