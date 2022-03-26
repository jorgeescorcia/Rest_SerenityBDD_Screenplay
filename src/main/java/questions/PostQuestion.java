package questions;

import models.posts.PostInfo;
import net.serenitybdd.rest.SerenityRest;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class PostQuestion implements Question {

    public static Question<PostInfo> question(){
        return new PostQuestion();
    }


    @Override
    public Object answeredBy(Actor actor) {
        return SerenityRest.lastResponse().as(PostInfo.class);
    }
}
