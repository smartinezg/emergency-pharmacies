# emergency-pharmacies
Farmacias de Turno

	Se encuentra disponible un servicio Rest para la obtención de la data solicitada:
		POST: http://localhost:8080/emergencyPharmacies

	El Json de request como ejemplo sería:
		{
			"commune": "PROVIDENCIA",
			"localName": "CRUZ VERDE"
		}
		Content-Type	application/json
		

	Además se encuentra disponible un sitio WEB sencillo donde se puede evaluar el resultado del servicio:
		http://localhost:8080/farmaciasTurno.html

	En la compilación se encuentran los TEST al servicio expuesto y al servicio consumido de minsal correspondiente a la información de Farmacias.
	
	Se puede deployar con Maven, ejecutando lo siguiente:
		mvn install
		mvn spring-boot:run
