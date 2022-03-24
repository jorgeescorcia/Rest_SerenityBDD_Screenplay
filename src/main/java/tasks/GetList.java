package tasks;

import io.restassured.http.ContentType;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.rest.interactions.Get;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class GetList implements Task {

    private final int page;
    public GetList(int page){
        this.page = page;
    }

    public static Performable frompage(int page ){
        return instrumented(GetList.class,page);
    }

    //Tarea que obtiene los usuarios
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Get.resource("/api/unknown"+page)
                        .with(requestSpecification -> requestSpecification.contentType(ContentType.JSON)
                                .header("header","value1"))
        );
    }
}
