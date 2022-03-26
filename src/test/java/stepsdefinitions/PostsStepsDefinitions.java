package stepsdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import models.posts.PostInfo;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.rest.abilities.CallAnApi;
import net.serenitybdd.screenplay.rest.questions.LastResponse;
import tasks.posts.CreatePosts;
import tasks.posts.UpdatePosts;


import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.rest.questions.ResponseConsequence.seeThatResponse;
import static org.hamcrest.CoreMatchers.equalTo;
import static questions.PostQuestion.question;

public class PostsStepsDefinitions {
    private static final String URL_REST_API ="https://jsonplaceholder.typicode.com";
    Actor jorge;
    PostInfo postInfo = new PostInfo();



    @Given("jorge quiere crear un nuevo post")
    public void jorge_quiere_crear_un_nuevo_post() {
        jorge = Actor.named("Jorge QA")
                .whoCan(CallAnApi.at(URL_REST_API));


    }

    @When("se encuentra en la pagina del servicio")
    public void se_encuentra_en_la_pagina_del_servicio() {
        postInfo.setBody("Holaaa aa aa ");
        postInfo.setTitle("Haaaa");
        postInfo.setUserId(1);

        jorge.attemptsTo(
                CreatePosts.withInfo(postInfo.toJson())


        );
        postInfo.setId(101);



    }

    @Then("deberia ver el nombre del post creado")
    public void deberia_ver_el_nombre_del_post_creado() {
       /* jorge.should(
                seeThat("El codigo de respuesta es =", new ResponseCode(),equalTo(201))


        );
        */
        LastResponse.received().answeredBy(jorge).prettyPrint();
        jorge.should(
                seeThatResponse("El codigo de respuesta es",
                        response -> response.statusCode(201))
        );

    }

    @Given("que accedo a un post")
    public void que_accedo_a_un_post()  {
        jorge = Actor.named("Jorge QA")
                .whoCan(CallAnApi.at(URL_REST_API));


    }

    @When("^actualizo el titulo de un post$")
    public void actualizo_el_titulo_de_un_post()  {
        postInfo.setBody("Hola Sofka ");
        postInfo.setTitle("Haaaa");
        postInfo.setUserId(1);

        jorge.attemptsTo(
                UpdatePosts.withInfo(postInfo.toJson())


        );
        postInfo.setId(101);

    }

    @Then("^se comprueba que la modificacion fue correcta$")
    public void se_comprueba_que_la_modificacion_fue_correcta()  {
        LastResponse.received().answeredBy(jorge).prettyPrint();
        jorge.should(
                seeThatResponse("El codigo de respuesta es",
                        response -> response.statusCode(201))
        );

        PostInfo respuestaServidor = question().answeredBy(jorge);
        jorge.should(
                seeThat("Verificando actualización de valores",
                        response -> respuestaServidor.getBody(),equalTo( postInfo.getBody()))
        );

    }

}
