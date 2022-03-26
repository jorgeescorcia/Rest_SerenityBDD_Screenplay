package stepsdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.rest.abilities.CallAnApi;
import questions.ResponseCode;
import tasks.list.GetList;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.CoreMatchers.equalTo;


public class ListStepsDefinitions {


    private static final String URL_REST_API ="https://reqres.in";
    Actor jorge;

    @Given("jorge quiere consultar la lista")
    public void jorge_quiere_consultar_la_lista() {
        jorge = Actor.named("Jorge QA")
                .whoCan(CallAnApi.at(URL_REST_API));

    }
    @When("hace la peticion al servicio")
    public void hace_la_peticion_al_servicio() {
        jorge.attemptsTo(
                GetList.frompage(1) //tarea obtener usuarios
        );


    }
    @Then("deberia ver el nombre del color consultado")
    public void deberia_ver_el_nombre_del_color_consultado() {
        jorge.should(
                seeThat("El codigo de respuesta es =", new ResponseCode(),equalTo(200))

        );


    }

    @Given("que accedo a la lista")
    public void que_accedo_a_la_lista() {
        jorge = Actor.named("Jorge QA")
                .whoCan(CallAnApi.at(URL_REST_API));

    }

    @When("agrego un parametro adicional a la url")
    public void agrego_un_parametro_adicional_a_la_url() {
        jorge.attemptsTo(
                GetList.frompage(100)
        );

    }

    @Then("se tiene que recibir una respuesta exitosa")
    public void se_tiene_que_recibir_una_respuesta_exitosa() {
        jorge.should(
                seeThat("El codigo de respuesta es =", new ResponseCode(),equalTo(200))

        );

    }



}
