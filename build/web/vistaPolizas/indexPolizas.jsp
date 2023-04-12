<%-- 
    Document   : indexPolizas
    Created on : 3/12/2022, 4:42:25 p. m.
    Author     : MedicinaAviación
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65" crossorigin="anonymous">

        <title>Polizas | ConConcretos</title>
    </head>
    <body>
        <form action="NewServlet" method="POST">
            <input  class="btn btn-dark" type="submit" name="accionPolizas" value="Volver">
        </form>
        <center>
            <div>
                <h3>Polizas</h3>
                <form action ="NewServlet" method="POST">
                    <input class="btn btn-dark"  type="submit" name="accionPolizas" value="Listar">
                    <input class="btn btn-dark" type="submit" name="accionPolizas" value="Nuevo">
                    <input class="btn btn-dark" type="submit" name="accionPolizas" value="Ver estado vigencia">
                    <br>
                    <br>
                </form>
            </div>
            <div>
                <table class="table table-striped" border="1">
                    <thead>
                        <tr>
                            <th>Numero poliza</th>
                            <th>Inicio vigencia</th>
                            <th>Fin vigencia</th>
                            <th>Valor prima</th>
                            <th>Nit aseguradora</th>
                            <th>Nombre aseguradora</th>
                            <th>Nit asegurado</th>
                            <th>Nombre asegurado</th>
                            <th>Código contrato</th>
                            <th>Valor contrato</th>
                            <th>Estado Vigencia</th>
                            <th>Acciones</th>
                        </tr>
                    </thead>
                    <tbody>
                        <c:forEach var="dato" items="${datos}">
                            <tr>
                                <td>${dato.getNumeroPoliza()}</td>
                                <td>${dato.getFechaInicio()}</td>
                                <td>${dato.getFechaFin()}</td>
                                <td>${dato.getValorPrima()}</td>
                                <td>${dato.getNitAseguradora()}</td>
                                <td>${dato.getNombreAseguradora()}</td>
                                <td>${dato.getNitAsegurado()}</td>
                                <td>${dato.getNombreAsegurado()}</td>
                                <td>${dato.getCodigoContrato()}</td>
                                <td>${dato.getValorContrato()}</td>
                                <td>${dato.getRiesgoVigencia()}</td>
                                <td>
                                    <form action = "NewServlet" method="POST">
                                        <input class="btn btn-dark" type="hidden" name="numeroPoliza" value="${dato.getNumeroPoliza()}">
                                        <input class="btn btn-dark" type="submit" name="accionPolizas" value="Editar">
                                        <input class="btn btn-dark" type="submit" name="accionPolizas" value="Eliminar">
                                    </form>
                                </td>
                            </tr>
                        </c:forEach>
                    </tbody>
                </table>
            </div>
        </center>
    </body>
</html>
