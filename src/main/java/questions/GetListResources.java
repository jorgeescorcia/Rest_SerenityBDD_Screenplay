package questions;

import models.list.ListResource;
import net.serenitybdd.rest.SerenityRest;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class GetListResources implements Question {
    @Override
    public ListResource answeredBy(Actor actor) {
        return SerenityRest.lastResponse().as(ListResource.class);
    }

}
