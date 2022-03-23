package runner;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.serenitybdd.rest.SerenityRest;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.rest.abilities.CallAnApi;
import org.junit.Test;
import org.junit.runner.RunWith;
import tasks.GetPosts;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SerenityRunner.class)

public class TestInitial {
    private static final String URL_REST_API ="https://jsonplaceholder.typicode.com/";
    @Test
    public void Getposts(){
        Actor jorge = Actor.named("Jorge QA")
                .whoCan(CallAnApi.at(URL_REST_API));
        //Llamando a la tarea
        jorge.attemptsTo(
                GetPosts.frompage(2) //tarea obtener usuarios
        );
        assertThat(SerenityRest.lastResponse().statusCode()).isEqualTo(404);

    }


}
