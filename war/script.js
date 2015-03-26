function getFechaHora()
{
 	var fecha = new Date();
	var dia = fecha.getDate();
	var diaSemana = fecha.getDay();
	var diaLetras
	var mes = fecha.getMonth();
	var mesLetras
	var anno = fecha.getFullYear();
	var horas = fecha.getHours();
	var minutos = fecha.getMinutes();

	switch (diaSemana)
	{
		case 0: diaLetras = "Domingo"; break;
		case 1: diaLetras = "Lunes"; break;
		case 2: diaLetras = "Martes"; break;
		case 3: diaLetras = "Miércoles"; break;
		case 4: diaLetras = "Jueves"; break;
		case 5: diaLetras = "Viernes"; break;
		case 6: diaLetras = "Sábado"; break;
	}

	switch (mes)
	{
		case 0: mesLetras = "Enero"; break;
		case 1: mesLetras = "Febrero"; break;
		case 2: mesLetras = "Marzo"; break;
		case 3: mesLetras = "Abril"; break;
		case 4: mesLetras = "Mayo"; break;
		case 5: mesLetras = "Junio"; break;
		case 6: mesLetras = "Julio"; break;
		case 7: mesLetras = "Agosto"; break;
		case 8: mesLetras = "Septiembre"; break;
		case 9: mesLetras = "Octubre"; break;
		case 10: mesLetras = "Noviembre"; break;
		case 11: mesLetras = "Diciembre"; break;
	}

	if (minutos < 10){ minutos = "0" + minutos }

	var cadena = diaLetras + ' ' + dia + ' de ' + mesLetras + ' de ' + anno + ' ' + horas + ':' + minutos;

	return cadena;
}