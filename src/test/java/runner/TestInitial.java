package runner;

import models.Datum;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.rest.abilities.CallAnApi;
import org.junit.Test;
import org.junit.runner.RunWith;
import questions.GetListResources;
import questions.ResponseCode;
import tasks.GetList;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.notNullValue;

@RunWith(SerenityRunner.class)

public class TestInitial {
    private static final String URL_REST_API ="https://reqres.in";
    @Test
    public void InitialTest(){
        Actor jorge = Actor.named("Jorge QA")
                .whoCan(CallAnApi.at(URL_REST_API));
        //Llamando a la tarea
        jorge.attemptsTo(
                GetList.frompage(1) //tarea obtener usuarios
        );
        //assertThat(SerenityRest.lastResponse().statusCode()).isEqualTo(404);
        jorge.should(
                seeThat("El codigo de respuesta es =", new ResponseCode(),equalTo(200))
        );


        Datum user =new GetListResources().answeredBy(jorge)
                        .getData().stream().filter(x -> x.getId()==1).findFirst().orElse(null);

       jorge.should(
               seeThat("Usuario no es nulo", act -> user,notNullValue())
       );
        jorge.should(
                seeThat("el nombre es", act -> user.getName(),equalTo("cerulean"))
        );
    }


}
