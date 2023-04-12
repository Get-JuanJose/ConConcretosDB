<%-- 
    Document   : index
    Created on : 19/11/2022, 8:11:42 p. m.
    Author     : MedicinaAviación
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65" crossorigin="anonymous">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Aseguradas | ConConcretos</title>
    </head>
    <body>
        <form action="NewServlet" method="POST">
            <input class="btn btn-danger" type="submit" name="accionAseguradas" value="Volver">
        </form>
        <center>
            <div>
                <h3>Constructoras Aseguradas</h3>
                <form action ="NewServlet" method="POST">
                    <input class="btn btn-dark" type="submit" name="accionAseguradas" value="Listar">
                    <input class="btn btn-dark" type="submit" name="accionAseguradas" value="Nuevo">
                    <br>
                    <br>
                </form>
            </div>
            <div>
                <table class="table-light" border="1">
                    <thead>
                        <tr>
                            <th>Nit</th>
                            <th>Nombre</th>
                            <th>Cédula Representante Legal</th>
                            <th>Acciones</th>
                        </tr>
                    </thead>
                    <tbody>
                        <c:forEach var="dato" items="${datos}">
                            <tr>
                                <td>${dato.getNit_asegurada()}</td>
                                <td>${dato.getNombre_asegurada()}</td>
                                <td>${dato.getCc_rep_legal()}</td>
                                <td>
                                    <form action = "NewServlet" method="POST">
                                        <input type="hidden" name="nitAsegurada" value="${dato.getNit_asegurada()}">
                                        <input class="btn btn-dark"  type="submit" name="accionAseguradas" value="Editar">
                                        <input class="btn btn-dark" type="submit" name="accionAseguradas" value="Eliminar">
                                    
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