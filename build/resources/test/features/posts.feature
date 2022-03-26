Feature: creacion de posts
  yo como usuario del servicio
  quiero crear un post
  para visualizar el post creado


  Scenario: creacion exitosa de un posts
    Given jorge quiere crear un nuevo post
    When se encuentra en la pagina del servicio
    Then deberia ver el nombre del post creado

  Scenario: modificacion de post existente
   Given que accedo a un post
   When actualizo el titulo de un post
   Then se comprueba que la modificacion fue correcta
