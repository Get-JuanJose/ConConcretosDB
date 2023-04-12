<%-- 
    Document   : editAseguradoras
    Created on : 3/12/2022, 2:34:32 p. m.
    Author     : MedicinaAviación
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65" crossorigin="anonymous">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Editar constructoras</title>
    </head>
    <body>
        <center>
            <h1>Editar Constructora Asegurada</h1>
        </center>
        <br>
        <center>

            <div>
                <form action = "NewServlet" method="POST">
                    Nit asegurada:
                    <input type="text" name="txtNitAsegurada" value="${aseguradas.getNit_asegurada()}">
                    Nombre asegurada:
                    <input  type="text" name="txtNombreAsegurada" value ="${aseguradas.getNombre_asegurada()}">
                    Cedula rep legal:
                    <input  type="text" name="txtCedulaRepLegal" value ="${aseguradas.getCc_rep_legal()}">
                    <br>
                    <br>
                    <input class="btn btn-dark" type="submit" name="accionAseguradas" value = "Actualizar">
                </form>
            </div>
        </center>
    </body>
</html>
