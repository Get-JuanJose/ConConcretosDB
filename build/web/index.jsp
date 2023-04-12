<%-- 
    Document   : home
    Created on : 1/12/2022, 12:00:10 p. m.
    Author     : MedicinaAviación
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65" crossorigin="anonymous">
        <title>Inicio | ConConcretos</title>
    </head>
    <body>
    <center>
        <nav class="navbar bg-ligth">
            <div class="container">
              <a class="navbar-brand" href="#">
                <img src="logo2.gif" width="50" height="50">
                    Constructora ConConcretos
              </a>
            </div>
        </nav>
        
        <br>
        <br>
        <h4 class=" text-dark">Gestiona pólizas, agrega, elimina,</h4>
        <h4 class=" text-dark">consulta y modifica.</h4>
        <h4 class=" text-dark">Consulte aquí toda la información de las pólizas emitidas</h4>
    </center>
        
    <center>
        <br>
        <br>
        <form action="NewServlet" method="POST">
            <tr>
                <td>
                    <input class="btn btn-dark" type="submit" name="accion" value="Aseguradoras">
                </td>
                <br>
                <br>
                <td>
                    <input class="btn btn-dark" type="submit" name="accion" value="Aseguradas">
                    </td>
                <br> 
                <br>
                <td>
                    <input class="btn btn-dark" type="submit" name="accion" value="Polizas">
                </td>
                <br> 
                <br>
            </tr>    
        </form>
    </center>
    <img style="width: 25%; margin-left: 90px; margin-top: -105px;" src="inicio.gif" alt="">
    </body>
</html>
