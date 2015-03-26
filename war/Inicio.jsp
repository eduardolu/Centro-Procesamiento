<%@ page contentType="text/html;charset=UTF-8" language="java"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>

<%@page isELIgnored="false"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="utf-8">
<!-- This file has been downloaded from Bootsnipp.com. Enjoy! -->
<title>TeleAsistencia Call Center</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link
	href="http://netdna.bootstrapcdn.com/twitter-bootstrap/2.3.2/css/bootstrap-combined.min.css"
	rel="stylesheet">
<!-- hoja de estilo -->

<link rel="stylesheet" type="text/css" href="/formato.css" media="screen" />

<!-- favicon -->
<script src="http://code.jquery.com/jquery-1.11.1.min.js"></script>
<script
	src="http://netdna.bootstrapcdn.com/twitter-bootstrap/2.3.2/js/bootstrap.min.js"></script>
<script type="text/javascript"
	src="https://ajax.googleapis.com/ajax/libs/jquery/1.7.2/jquery.min.js"></script>


<div class="container" style="padding-top: 1em;">
	<nav role="navigation" class="navbar navbar-default navbar-fixed-top ">
	<div class="navbar-header">

		<h2>Envío de datos al Call Center</h2>

	</div>
</div>
</head>
<body onLoad=”if (location.href.indexOf(‘reload’)==-1) location.replace(location.href+’?reload’)”>
	<br>
	<br>
	<form class="con_boton" action="/nuevaAlerta" method="post" accept-charset="utf-8">



		<table id="contenido">
			<tr>
				<td><label for="summary"><h3>Para</h3></label></td>
				<td><input type="text" name="summary" id="summary" size="65"
					placeholder="correo@appspot.com" /></td>
			</tr>

			<tr>
				<td valign="description"><label for="description"><h3>Contenido
						del mensaje</h3></label></td>
				<td><textarea rows="4" cols="50" name="description"
						id="description" placeholder="agregar un mensaje"></textarea></td>
			</tr>
		</table>
		<button  class="btn btn-primary">Enviar mensaje</button>
	</form>
	<div id="load_me">

		Tiene un total de ${fn:length(alertas)} Mensajes.
		<c:forEach items="${alertas}" var="alerta">
			<div>
				<ul>
					<a class="btn btn-danger" data-toggle="collapse"
						href="#<c:out value="${alerta.id}"/>" aria-expanded="false"
						aria-controls="<c:out value="${alerta.id}"/>"> Mensaje <c:out
							value="${alerta.tipo}" />
					</a>
				</ul>
				<div class="collapse" id="<c:out value="${alerta.id}"/>">
					<div class="well">
						el mensaje es lo siguiente: 
						
						<c:out value="${alerta.subtipo}" />.
						 <form action="/borrarAlerta?id=${alerta.id}" method="post"
							accept-charset="utf-8">
						
								<button class="btn btn-danger">Recibido</button>
								<!--<button class="btn btn-warning">Llamar al usuario</button>
								<button class="btn btn-primary">Llamar a la persona de
									contacto</button>-->

						</form> 
					</div>
				</div>
			</div>
		</c:forEach>
	</div>
</body>
</html>