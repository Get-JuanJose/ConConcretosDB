<%-- 
    Document   : addAsegurada
    Created on : 3/12/2022, 12:44:05 p. m.
    Author     : MedicinaAviación
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65" crossorigin="anonymous">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Agregar constructora</title>
    </head>
    <body>
        <center>
            <div>
                <h3>Agregar Constructora Asegurada</h3>
            </div>
            <br>
            <div>
                <form action = "NewServlet" method="POST">
                    Nit aseguradora:
                    <input type="text" name="txtNitAsegurada">
                    Nombre aseguradora:
                    <input type="text" name="txtNombreAsegurada">
                    Cedula rep legal
                    <input type="text" name="txtCedulaRepLegal">
                    <br>
                    <br>
                    <input class="btn btn-dark" type="submit" name="accionAseguradas" value = "Guardar">
                </form>
            </div>
        </center>
    </body>
</html>
