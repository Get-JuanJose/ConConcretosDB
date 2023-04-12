<%-- 
    Document   : editPolizas
    Created on : 3/12/2022, 4:47:35 p. m.
    Author     : MedicinaAviación
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65" crossorigin="anonymous">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Editar pólizas</title>
    </head>
    <body>
        <center>
            <h1>Editar Poliza</h1>
        </center>
            <center>

            <div>
                <form action = "NewServlet" method="POST">
                    
                    <center>
                        Numero Poliza: 
                        <input type="text" name="txtNumeroPoliza" value="${polizas.getNumeroPoliza()}">
                        Fecha Inicio:
                        <input type="text" name="txtFechaInicio" value ="${polizas.getFechaInicio()}">
                    </center>
                    <br>
                    <br>
                    
                    <center>
                    Fecha Fin: 
                    <input type="text" name="txtFechaFin" value ="${polizas.getFechaFin()}">
                    Valor Prima:
                    <input type="text" name="txtValorPrima" value ="${polizas.getValorPrima()}">
                    </center>
                    <br>
                    <br>   
                    
                    <center>
                        Nit Aseguradora:
                        <input type="text" name="txtNitAseguradora" value ="${polizas.getNitAseguradora()}">
                        Nit Asegurado:
                        <input type="text" name="txtNitAsegurado" value ="${polizas.getNitAsegurado()}">
                    </center>
                    <br>
                    <br>
                    
                    <center>
                        Codigo Contrato:
                        <input type="text" name="txtCodigoContrato" value ="${polizas.getCodigoContrato()}">
                        Valor Contrato:
                        <input type="text" name="txtValorContrato" value ="${polizas.getValorContrato()}">
                    </center>
                    <br>
                    <br>
                    <input class="btn btn-dark" type="submit" name="accionPolizas" value = "Actualizar">
                    <br>
                    <br>
                    <select name="aseguradoras">
                        <c:forEach var="datosAseguradoras" items="${datosAseguradoras}">
                            <option value="${datosAseguradoras.getNombre_aseguradora()}">
                                ${datosAseguradoras.getNit_aseguradora()}
                                ${datosAseguradoras.getNombre_aseguradora()}
                                
                            </option>
                        </c:forEach>
                    </select>
                    <select name="asegurados">
                        <c:forEach var="datosAsegurados" items="${datosAsegurados}">
                            <option value="${datosAsegurados.getNombre_asegurada()}">
                                ${datosAsegurados.getNit_asegurada()}
                                ${datosAsegurados.getNombre_asegurada()}
                            </option>
                        </c:forEach>
                    </select>
                    
                </form>
            </div>
        </center>
    </body>
</html>
