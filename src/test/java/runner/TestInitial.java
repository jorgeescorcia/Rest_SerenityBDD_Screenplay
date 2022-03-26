package runner;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberSerenityRunner;
import org.junit.runner.RunWith;

@RunWith(CucumberSerenityRunner.class)
@CucumberOptions(
        features = {"src/test/resources/features/listResource.feature"},
        glue ="stepsdefinitions"

)

public class TestInitial {
    /* private static final String URL_REST_API ="https://reqres.in";
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
*/
  /*  @Test
    public void Post(){
        Actor jorge = Actor.named("Jorge QA")
                .whoCan(CallAnApi.at(URL_REST_API));

        PostInfo postInfo = new PostInfo();
        postInfo.setId("101");

        //Llamando a la tarea

        String postInfo =("{
    "id": 101
}")
    jorge.attemptsTo(
            GetPosts.withInfo(postInfo)
    );
        jorge.should(
                seeThat("El codigo de respuesta es =", new ResponseCode(),equalTo(201))
        );




    }
*/

}
