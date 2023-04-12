<%-- 
    Document   : addPolizas
    Created on : 3/12/2022, 4:47:27 p. m.
    Author     : MedicinaAviación
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65" crossorigin="anonymous">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Agregar pólizas</title>
    </head>
    <body>
        <center>
            <div>
                <h3>Agregar Poliza</h3>
                <br>
            </div>
            <div>
                <form action = "NewServlet" method="POST">
                    Numero Poliza:
                    <c:forEach var="secuencia" items="${secuencia}">
                        <input type="text" name="txtNumeroPoliza" value="${secuencia.getNumeroPoliza()}" readonly="readonly">
                    </c:forEach>
                    <br>
                    <br>
                    Fecha Inicio:       
                    <input type="date" name="txtFechaInicio">
                    Fecha Fin:
                    <input type="date" name="txtFechaFin">
                    <br>
                    <br>
                    Valor Prima:
                    <input type="text" name="txtValorPrima">
                    Nit Aseguradora:
                    <input type="text" name="txtNitAseguradora">
                    <br>
                    <br>
                    Nit Asegurado:
                    <input type="text" name="txtNitAsegurado">
                    Codigo Contrato:
                    <input type="text" name="txtCodigoContrato">
                    <br>
                    <br>
                    Valor Contrato: 
                    <input type="text" name="txtValorContrato">
                    <br>
                    <br>
                    <center>
                        <input class="btn btn-dark" type="submit" name="accionPolizas" value = "Guardar">
                    </center>
                    <br>
                    <br>
                    <br>
                    <center>
                        <div style="width: 25%; margin-left: 320px; margin-top: -30px;">
                            <div class="card" style="width: 18rem;">
                                <div class="card-body">
                                    <h5 class="card-title">Diccionario de aseguradoras</h5>                            
                                    <p class="card-text">Conozca las aseguradoras disponibles para emisión de pólizas</p>
                                    <select name="aseguradoras">
                                        <c:forEach var="datosAseguradoras" items="${datosAseguradoras}">
                                            <option value="${datosAseguradoras.getNombre_aseguradora()}">
                                                ${datosAseguradoras.getNit_aseguradora()}
                                                ${datosAseguradoras.getNombre_aseguradora()}
                                            </option>
                                        </c:forEach>
                                    </select>
                                </div>
                            </div>
                            <br>
                            <br>
                        </div>
                        <div style="width: 25%; margin-left: -320px; margin-top: -228px;">
                            <div class="card" style="width: 18rem;">
                                <div class="card-body">
                                    <h5 class="card-title">Diccionario de constructoras asegurables</h5>                            
                                    <p class="card-text">Conozca las constructoras disponibles</p>
                                    <select name="asegurados">
                                    <c:forEach var="datosAsegurados" items="${datosAsegurados}">
                                        <option value="${datosAsegurados.getNombre_asegurada()}">
                                            ${datosAsegurados.getNit_asegurada()}
                                            ${datosAsegurados.getNombre_asegurada()}
                                        </option>
                                    </c:forEach>
                                    </select>
                                </div>
                            </div>
                         </div>
                    </center>
                </form>
            </div>
        </center>
    </body>
</html>
