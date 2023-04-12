/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package controlador;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.aseguradas;
import modelo.aseguradasDAO;
import modelo.aseguradoras;
import modelo.aseguradorasDAO;
import modelo.polizas;
import modelo.polizasDAO;


/**
 *
 * @author MedicinaAviación
 */
public class NewServlet extends HttpServlet {
    
    aseguradorasDAO dao = new aseguradorasDAO();
    aseguradoras a = new aseguradoras();
    
    aseguradorasDAO daoA = new aseguradorasDAO();
    aseguradasDAO daoB = new aseguradasDAO();
    
    aseguradorasDAO daoADD = new aseguradorasDAO();
    aseguradasDAO daoADD2 = new aseguradasDAO();
    
    polizasDAO daoC = new polizasDAO();
    
    aseguradasDAO dao1 = new aseguradasDAO();
    aseguradas b = new aseguradas();
    
    polizasDAO dao2 = new polizasDAO();
    polizas c = new polizas();
    
    polizasDAO daoD = new polizasDAO();
    
    
    
    
    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code> methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try ( PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet NewServlet</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet NewServlet at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

     // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
            
        }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
            String accion=request.getParameter("accion");
            
            String accionAseguradoras=request.getParameter("accionAseguradora");
            String accionAseguradas=request.getParameter("accionAseguradas");
            String accionPolizas=request.getParameter("accionPolizas");
            
            if (accion != null){
                switch(accion){
                    case "Aseguradoras":
                      request.getRequestDispatcher("indexAseguradora.jsp").forward(request, response);
                    break;
                    
                    case "Aseguradas":
                      request.getRequestDispatcher("/vistaAseguradas/indexAseguradas.jsp").forward(request, response);
                    break;
                    
                    case "Polizas":
                      request.getRequestDispatcher("vistaPolizas/indexPolizas.jsp").forward(request, response);
                    break;   
                }       
            }
            
            if(accionAseguradoras != null){
                switch(accionAseguradoras){
                    case "Volver":
                        request.getRequestDispatcher("index.jsp").forward(request, response);
                    break; 
                    
                    case "Listar":
                        List<aseguradoras>datos = dao.listar();
                        request.setAttribute("datos", datos);
                        request.getRequestDispatcher("/indexAseguradora.jsp").forward(request, response);
                    break;

                    case "Nuevo":
                        request.getRequestDispatcher("add.jsp").forward(request, response);
                        break;

                    case "Guardar":
                        String nit=request.getParameter("txtNitAseguradora");
                        String nombre=request.getParameter("txtNombreAseguradora");
                        int nitNumero = Integer.parseInt(nit);
                        a.setNit_aseguradora(nitNumero);
                        a.setNombre_aseguradora(nombre);
                        dao.agregar(a);
                        request.getRequestDispatcher("NewServlet?accionAseguradora=Listar").forward(request, response);
                        break;

                    case "Editar":
                        String nitEditar=request.getParameter("nitAseguradora");
                        int nitNumeroEditar = Integer.parseInt(nitEditar);
                        aseguradoras as = dao.listarNit(nitNumeroEditar);
                        request.setAttribute("aseguradoras", as);
                        request.getRequestDispatcher("edit.jsp").forward(request, response);   
                        break;

                    case "Actualizar":
                        String nit1=request.getParameter("txtNitAseguradora");
                        String nombre1=request.getParameter("txtNombreAseguradora");
                        int nitNumero1 = Integer.parseInt(nit1);

                        a.setNit_aseguradora(nitNumero1);
                        a.setNombre_aseguradora(nombre1);
                        dao.actualizar(a);
                        request.getRequestDispatcher("NewServlet?accionAseguradora=Listar").forward(request, response);
                        break;
                    case "Eliminar":
                        String nitBorrar=request.getParameter("nitAseguradora");
                        dao.delete(nitBorrar);
                        request.getRequestDispatcher("NewServlet?accionAseguradora=Listar").forward(request, response);
                        break;
                }    
            }
            
            if(accionAseguradas != null){
                switch(accionAseguradas){
                    case "Volver":
                        request.getRequestDispatcher("index.jsp").forward(request, response);
                    break;
                    case "Listar":
                        List<aseguradas>datos = dao1.listar();
                        request.setAttribute("datos", datos);
                        request.getRequestDispatcher("vistaAseguradas/indexAseguradas.jsp").forward(request, response);
                    break;

                    case "Nuevo":
                        request.getRequestDispatcher("vistaAseguradas/addAsegurada.jsp").forward(request, response);
                        break;

                    case "Guardar":
                        String nit=request.getParameter("txtNitAsegurada");
                        String nombre=request.getParameter("txtNombreAsegurada");
                        String cedulaRepLegal=request.getParameter("txtCedulaRepLegal");
                        String nombreRepLegal=request.getParameter("txtNombreRepLegal");
                        
                        int nitNumero = Integer.parseInt(nit);
                        int cedulaNumero = Integer.parseInt(cedulaRepLegal);
                        
                        b.setNit_asegurada(nitNumero);
                        b.setNombre_asegurada(nombre);
                        b.setCc_rep_legal(cedulaNumero);
                        b.setNombre_rep_legal(nombreRepLegal);
                        
                        dao1.agregar(b);
                        request.getRequestDispatcher("NewServlet?accionAseguradas=Listar").forward(request, response);
                        break;

                    case "Editar":
                        String nitEditar=request.getParameter("nitAsegurada");
                        int nitNumeroEditar = Integer.parseInt(nitEditar);
                        aseguradas as1 = dao1.listarNit(nitNumeroEditar);
                        request.setAttribute("aseguradas", as1);
                        request.getRequestDispatcher("/vistaAseguradas/editAseguradas.jsp").forward(request, response);   
                        break;

                    case "Actualizar":
                        String nit1=request.getParameter("txtNitAsegurada");
                        String nombre1=request.getParameter("txtNombreAsegurada");
                        String cedula=request.getParameter("txtCedulaRepLegal");
                        int nitNumero1 = Integer.parseInt(nit1);
                        int cedulaNumeroRep = Integer.parseInt(cedula);

                        b.setNit_asegurada(nitNumero1);
                        b.setNombre_asegurada(nombre1);
                        b.setCc_rep_legal(cedulaNumeroRep);
                        dao1.actualizar(b);
                        request.getRequestDispatcher("NewServlet?accionAseguradas=Listar").forward(request, response);
                        break;
                        
                    case "Eliminar":
                        String nitBorrar=request.getParameter("nitAsegurada");
                        dao1.delete(nitBorrar);
                        request.getRequestDispatcher("NewServlet?accionAseguradas=Listar").forward(request, response);
                        break;
                }
                
            }
            
            if(accionPolizas != null){
                
                switch(accionPolizas){
                    case "Volver":
                        request.getRequestDispatcher("index.jsp").forward(request, response);
                    break; 
                    
                    case "Listar":
                        List<polizas>datos = dao2.listar();
                        request.setAttribute("datos", datos);
                        request.getRequestDispatcher("vistaPolizas/indexPolizas.jsp").forward(request, response);
                    break;

                    case "Nuevo":                        
                        List<polizas>datos6 = daoC.listarSecuencia();
                        request.setAttribute("secuencia", datos6);
                        List<aseguradoras>datos3 = daoA.ListarComboBoxAseguradoras();
                        request.setAttribute("datosAseguradoras", datos3);
                        
                        List<aseguradas>datos4 = daoB.ListarComboBoxAsegurados();
                        request.setAttribute("datosAsegurados", datos4);
                        request.getRequestDispatcher("vistaPolizas/addPolizas.jsp").forward(request, response);
                        break;

                    case "Guardar":
                        String numeroPoliza=request.getParameter("txtNumeroPoliza");
                        String fechaInicio=request.getParameter("txtFechaInicio");
                        String fechaFin=request.getParameter("txtFechaFin");
                        String valorPrima=request.getParameter("txtValorPrima");
                        String nitAseguradora=request.getParameter("txtNitAseguradora");
                        String nitAsegurado=request.getParameter("txtNitAsegurado");
                        String codigoContrato=request.getParameter("txtCodigoContrato");
                        String valorContrato=request.getParameter("txtValorContrato");
                        
                        
                        c.setNumeroPoliza(numeroPoliza);
                        c.setFechaInicio(fechaInicio);
                        c.setFechaFin(fechaFin);
                        c.setValorPrima(valorPrima);
                        c.setNitAseguradora(nitAseguradora);
                        c.setNitAsegurado(nitAsegurado);
                        c.setCodigoContrato(codigoContrato);
                        c.setValorContrato(valorContrato);
                        
                        dao2.agregar(c);
                        request.getRequestDispatcher("NewServlet?accionPolizas=Listar").forward(request, response);
                        break;

                    case "Editar":
                        String numeroEditar=request.getParameter("numeroPoliza");
                        polizas as2 = dao2.listarNit(numeroEditar);
                        request.setAttribute("polizas", as2);
                       
                        List<aseguradoras>datos5 = daoADD.ListarComboBoxAseguradoras();
                        request.setAttribute("datosAseguradoras", datos5);
                        
                        List<aseguradas>datos7 = daoADD2.ListarComboBoxAsegurados();
                        request.setAttribute("datosAsegurados", datos7);
                        
                        
                        request.getRequestDispatcher("/vistaPolizas/editPolizas.jsp").forward(request, response);   
                        break;

                    case "Actualizar":
                        String numeroP=request.getParameter("txtNumeroPoliza");
                        String fechaI=request.getParameter("txtFechaInicio");
                        String fechaF=request.getParameter("txtFechaFin");
                        String valorP=request.getParameter("txtValorPrima");
                        String nitA=request.getParameter("txtNitAseguradora");
                        String nitB=request.getParameter("txtNitAsegurado");
                        String codigo=request.getParameter("txtCodigoContrato");
                        String valorC=request.getParameter("txtValorContrato");

                        c.setNumeroPoliza(numeroP);
                        c.setFechaInicio(fechaI);
                        c.setFechaFin(fechaF);
                        c.setValorPrima(valorP);
                        c.setNitAseguradora(nitA);
                        c.setNitAsegurado(nitB);
                        c.setCodigoContrato(codigo);
                        c.setValorContrato(valorP);
                        
                        dao2.actualizar(c);
                        request.getRequestDispatcher("NewServlet?accionPolizas=Listar").forward(request, response);
                        break;
                        
                    case "Eliminar":
                        String numero=request.getParameter("numeroPoliza");
                        dao2.delete(numero);
                        request.getRequestDispatcher("NewServlet?accionPolizas=Listar").forward(request, response);
                        break;
                     
                    case "Ver estado vigencia":
                        List<polizas>datos2 = dao2.listarRiesgoVigencia();
                        request.setAttribute("datos", datos2);
                        request.getRequestDispatcher("vistaPolizas/indexPolizas.jsp").forward(request, response);
                        break;
                }
            }
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
