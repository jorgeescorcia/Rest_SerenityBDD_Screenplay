# Plan de pruebas RestSerenityBDDScreenplay

| Version  | Comentarios |Fecha|Descripción|Responsable|
|----------|:-------------:|------:|-------:|---------|
| 1.0  | Creacion  |25/03/2021|Creación Plan De pruebas|Jorge Escorcia|

## 1. Descripción
En esta ocasion necesitamos automatizar algunos servicios Rest que se encuentran alojados en diferentes sitios web, verificaremos que el servicio
ListResource de la web https://reqres.in/ mediante el metodo GET nos devuelva los valores a consultar de forma correcta.

Sitios Web RestApi:
- https://pokeapi.co
- https://reqres.in/
- https://jsonplaceholder.typicode.com/

## 2. Alcance

Dichas pruebas se realizaran en diferentes navegadores
- Google Chrome
- Mozilla firefox

Se probaran los servicios utlizando la herramienta Postman

Se realizaran pruebas automatizadas

**HU001 – Lista de Colores**

  yo como usuario del servicio
  
  quiero poder consultar el servicio
  
  para visualizar la lista de colores
  
## Criterios De Acpetación 
- El usuario que consumira el servicio podrá visualizar la lista de colores del servicio List<Resource>
- El servicio debera devolver el codigo respuesta correcto de acuerdo metodo de consulta establecido
	
## Alcance
- Verificar que se establezca de forma exitosa la conexión con el servicio
- Verificar que el codigo de respuesta obtenido sea el correcto
- Verificar que el color consultado sea el correcto
	
## Fuera de Alcance
- No se verificará la cantidad de servicios disponibles a consumir
- No se verificará el tiempo de carga de los servicios
	
## Estrategia de pruebas
Todas las ejecuciones de pruebas serán de tipo Automatizada.

Se iniciará realizando un Smoke Test para determinar que el portal cargue correctamente.
Por otra parte de validaran las diferentes web con sus servicios mediante la aplicacion Postman
Se definirán acuerdos entre el equipo de prueba para agendar el tiempo y fechas en que cada QA hará uso del ambiente de pruebas
y los diferentes servicios a probar
	
## Analisis de Riesgo
| Riesgo | Probabilidad |Impacto|Criticidad|
|----------|:-------------:|------:|-------:|
|HU001 Mostrar un color de la lista  | 5  |5|25|
|HU001 Mostrar el resumen de todos los colores  | 4  |3|12|
	
## Requerimientos
- Mantener actualizados los servicios a consumir
- Contar con la herramienta Postman
	
	



				
