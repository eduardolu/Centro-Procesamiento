<%@ page contentType="text/html;charset=UTF-8" language="java"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>

<%@page isELIgnored="false"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
		    <meta charset="utf-8">
    <!-- This file has been downloaded from Bootsnipp.com. Enjoy! -->
    <title>TACC - USUARIOS</title>
        <meta name="viewport" content="width=device-width, initial-scale=1">
	<link href="http://netdna.bootstrapcdn.com/twitter-bootstrap/2.3.2/css/bootstrap-combined.min.css" rel="stylesheet">
    <style type="text/css">
    
        //Reusing bootstrap 3 panel CSS
.panel {
    background-color: #FFFFFF;
    border: 1px solid rgba(0, 0, 0, 0);
    border-radius: 4px 4px 4px 4px;
    box-shadow: 0 1px 1px rgba(0, 0, 0, 0.05);
    margin-bottom: 20px;
}   

.panel-primary {
    border-color: #428BCA;
}   

.panel-primary > .panel-heading {
    background-color: #428BCA;
    border-color: #428BCA;
    color: #FFFFFF;
}   

.panel-heading {
    border-bottom: 1px solid rgba(0, 0, 0, 0);
    border-top-left-radius: 3px;
    border-top-right-radius: 3px;
    padding: 10px 15px;
}   

.panel-title {
    font-size: 16px;
    margin-bottom: 0;
    margin-top: 0;
}   

.panel-body:before, .panel-body:after {
    content: " ";
    display: table;
}   

.panel-body:before, .panel-body:after {
    content: " ";
    display: table;
}   

.panel-body:after {
    clear: both;
}   

.panel-body {
    padding: 15px;
}   

.panel-footer {
    background-color: #F5F5F5;
    border-bottom-left-radius: 3px;
    border-bottom-right-radius: 3px;
    border-top: 1px solid #DDDDDD;
    padding: 10px 15px;
}

//CSS from v3 snipp
.user-row {
    margin-bottom: 14px;
}

.user-row:last-child {
    margin-bottom: 0;
}

.dropdown-user {
    margin: 13px 0;
    padding: 5px;
    height: 100%;
}

.dropdown-user:hover {
    cursor: pointer;
}

.table-user-information > tbody > tr {
    border-top: 1px solid rgb(221, 221, 221);
}

.table-user-information > tbody > tr:first-child {
    border-top: 0;
}


.table-user-information > tbody > tr > td {
    border-top: 0;
}
    </style>
    <script src="http://code.jquery.com/jquery-1.11.1.min.js"></script>
    <script src="http://netdna.bootstrapcdn.com/twitter-bootstrap/2.3.2/js/bootstrap.min.js"></script>
		
		<div class="container" style="padding-top: 1em;">
	     <nav role="navigation" class="navbar navbar-default navbar-fixed-top ">
	     	<div class="navbar-header">
	
	            <ul class="nav navbar-nav">
	                <li><a href="/inicio">Inicio</a></li>
	                <li class="active"><a href="/usuarios">Usuarios</a></li>
	                <li><a href="index.html">Logout</a></li>
	                
	            </ul>

        	</div>
		</div>
</head>
<body>

<br><br>

<form action="/nuevoUsuario" method="post" accept-charset="utf-8">

		<td colspan="2"
		align="right"><input type="submit"
		value="Crear Usuario" /></td>
		
</form>

<form action="/borrarUsuarios" method="post" accept-charset="utf-8">

		<td colspan="2"
		align="right"><input type="submit"
		value="Borrar Usuarios" /></td>
		
</form>
<div style="clear: both;" />
		Hay un total de ${fn:length(usuarios)}
		Usuarios.
</div>		
		
<div class="container">	
 <div class="well span8 offset2">
<c:forEach items="${usuarios}" var="usuario">

	
      <!-- Usuario #################################################################-->
        <div class="row-fluid user-row">
            <div class="span1">
                <img class="img-circle"
                     src="yelmo.jpg"
                     alt="User Pic">
            </div>
            <div class="span10">
                <strong>Usuario <c:out value="${usuario.id}" /></strong><br>
                <span class="text-muted">Yelmo García, Juan Carlos</span>
            </div>
            <div class="span1 dropdown-user" data-for=".<c:out value="${usuario.id}" />">
                <i class="icon-chevron-down text-muted"></i>
            </div>
        </div>
        <div class="row-fluid user-infos <c:out value="${usuario.id}" />">
            <div class="span10 offset1">
                <div class="panel panel-primary">

                   

                     <span class="pull-right">
                            <button color="green"> Historial de eventos </button>
                          
                        </span>
                 <br>
                  <br>
                    <div class="panel-heading">
                        <h3 class="panel-title">Datos personales</h3>
                    </div>
                    <div class="panel-body">
                        <div class="row-fluid">
                            <div class="span3">
                                <img class="img-circle"
                                     src="yelmo.jpg"
                                     alt="User Pic">
                            </div>
                            <div class="span6">
                                <br>
                                <table class="table table-condensed table-responsive table-user-information">
                                    <tbody>
                                    <tr>
                                        <td><strong>Fecha</strong></td>
                                        <td>29/2/1984</td>
                                    </tr>
    
                                    <tr>
                                        <td><strong>DNI</strong></td>
                                        <td>12345678-A</td>
                                    </tr>

                                      <tr>
                                        <td><strong>Teléfono</strong></td>
                                        <td>123456789</td>
                                    </tr>
                                    
                                    <tr>
                                        
                                        <td><strong>Vía</strong></td>
                                        <td>Avenida complutense</td>

                                        <td><strong> Nº </strong></td>
                                        <td>123</td>
                                     </tr>
                                      <tr>
                                        <td><strong>Provincia</strong></td>
                                        <td>Madrid</td>

                                         <td><strong>Ciudad</strong></td>
                                        <td>Madrid</td>

                                         <td><strong>CP</strong></td>
                                        <td>28030</td>
                                    </tr>
                                    <tr>
                                        <td><strong>Estado Civil</strong></td>
                                        <td>Casado</td>
                                    </tr>
                                  
                                    <tr>
                                        <td><strong>Persona de contacto1</strong></td>
                                        <td>Apellido1 apellido, Nombre</td>
                                        <td><strong>Teléfono</strong></td>
                                        <td>123456789</td>
                                    </tr>

                                     <tr>
                                        <td><strong>Persona de contacto2</strong></td>
                                        <td>Apellido1 apellido, Nombre</td>
                                        <td><strong>Teléfono</strong></td>
                                        <td>123456789</td>
                                    </tr>
                                    </tbody>
                                </table>
                            </div>
                        </div>
                    </div>
                    
                </div>
            </div>
        </div>

         <div class="row-fluid user-infos <c:out value="${usuario.id}" />">
            <div class="span10 offset1">
                <div class="panel panel-primary">
                    <div class="panel-heading">
                        <h3 class="panel-title">Datos Sanitarios</h3>
                    </div>
                    <div class="panel-body">
                        <div class="row-fluid">
                            <div class="span3">

                            </div>
                            <div class="span6">
                                <br>
                                <table class="table table-condensed table-responsive table-user-information">
                                    <tbody>
                                    <tr>
                                        <td><strong>Nº Seguridad social</strong></td>
                                        <td>123456</td>
                                    </tr>
    
                                    <tr>
                                        <td><strong>Grupo Sanguíneo</strong></td>
                                        <td>A Positivo</td>
                                    </tr>

                                      <tr>
                                        <td><strong>Operaciones</strong></td>
                                        <td>Ninguna</td>

                                         <td><strong>Enfermedades pasadas</strong></td>
                                        <td>Pulmonía</td>
                                    </tr>
                                    
                                    <tr>
                                        
                                       

                                        <td><strong>Enfermedades</strong></td>
                                        <td>Diabetes</td>
                                     </tr>
                                     
                                    </tbody>
                                </table>
                            </div>
                        </div>
                    </div>
                    
                </div>
            </div>
        </div>
         </c:forEach>
	</div>
</div>


</body>
</html>