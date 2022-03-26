
Feature: Lista de colores
  yo como usuario del servicio
  quiero poder consultar el servicio
  para visualizar la lista de colores

  Scenario: Consulta exitosa de lista de colores
    Given jorge quiere consultar la lista
    When hace la peticion al servicio
    Then deberia ver el nombre del color consultado

  Scenario: Se le agrega un para metro adicional a la url
    Given que accedo a la lista
    When agrego un parametro adicional a la url
    Then se tiene que recibir una respuesta exitosa
