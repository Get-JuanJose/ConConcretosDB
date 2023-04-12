<%-- 
    Document   : add
    Created on : 26/11/2022, 9:30:33 p. m.
    Author     : MedicinaAviación
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65" crossorigin="anonymous">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Agregar aseguradoras</title>
    </head>
    <body>
        <center>
            <div>
                <h3>Agregar Aseguradora</h3>
            </div>
            <div>
                <form action = "NewServlet" method="POST">
                    Nit aseguradora:
                    <input type="text" name="txtNitAseguradora">
                    Nombre aseguradora:
                    <input type="text" name="txtNombreAseguradora">
                    <input class="btn btn-dark"  type="submit" name="accionAseguradora" value = "Guardar">
                </form>
            </div>
        </center>
    </body>
</html>
