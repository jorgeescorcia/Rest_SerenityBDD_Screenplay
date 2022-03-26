package tasks.posts;

import io.restassured.http.ContentType;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.rest.interactions.Put;
import tasks.posts.CreatePosts;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class UpdatePosts implements Task {

    private final Object userInfo;

    public UpdatePosts(Object userInfo){
        this.userInfo = userInfo;

    }

    public static Performable withInfo(Object userInfo){
        return instrumented(CreatePosts.class, userInfo);
    }


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Put.to("/posts/1").with(
                        requestSpecification -> requestSpecification
                                .contentType(ContentType.JSON)
                                .body(userInfo)
                )
        );
    }
}
