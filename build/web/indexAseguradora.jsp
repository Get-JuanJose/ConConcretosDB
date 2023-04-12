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
        <title>Aseguradoras | ConConcretos</title>
    </head>
    <body>
        <form action="NewServlet" method="POST">
            <input class="btn btn-danger" type="submit" name="accionAseguradora" value="Volver">
        </form>
        <center>
            <div>
                <h3>Aseguradoras</h3>
                <form action ="NewServlet" method="POST">
                    <input class="btn btn-dark" type="submit" name="accionAseguradora" value="Listar">
                    <input class="btn btn-dark" type="submit" name="accionAseguradora" value="Nuevo">
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
                            <th>Acciones</th>
                        </tr>
                    </thead>
                    <tbody>
                        <c:forEach var="dato" items="${datos}">
                            <tr>
                                <td>${dato.getNit_aseguradora()}</td>
                                <td>${dato.getNombre_aseguradora()}</td>
                                <td>
                                    <form action = "NewServlet" method="POST">
                                        <input type="hidden" name="nitAseguradora" value="${dato.getNit_aseguradora()}">
                                        <input class="btn btn-dark"  type="submit" name="accionAseguradora" value="Editar">
                                        <input  class="btn btn-dark" type="submit" name="accionAseguradora" value="Eliminar">
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
