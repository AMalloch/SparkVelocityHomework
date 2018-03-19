import models.Randomiser;
import spark.ModelAndView;
import spark.Spark;
import spark.template.velocity.VelocityTemplateEngine;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

import static spark.Spark.get;

public class Controller {
    private static Randomiser randomiser;

    public Controller(Randomiser randomiser) {
        this.randomiser = randomiser;
    }

    public static void main(String[] args) {
        VelocityTemplateEngine velocityTemplateEngine = new VelocityTemplateEngine();
        get("/random", (req, res) -> {
            randomiser.shuffleNameList();
            return new ModelAndView(model, "result.vtl");
        }, velocityTemplateEngine);

        Spark.exception(Exception.class, (exception, request, response) -> {
            exception.printStackTrace();
        });
   }

}
