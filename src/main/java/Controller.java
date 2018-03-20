import models.Randomiser;
import spark.ModelAndView;
import spark.Spark;
import spark.template.velocity.VelocityTemplateEngine;

import java.util.ArrayList;
import java.util.HashMap;

import static spark.Spark.get;

public class Controller {
    private static Randomiser randomiser;

    public Controller(Randomiser randomiser) {
        this.randomiser = randomiser;
    }

    public static void main(String[] args) {
        VelocityTemplateEngine velocityTemplateEngine = new VelocityTemplateEngine();

        get("/one", (req, res) -> {
            String result = randomiser.shuffleNameListGetName();
            HashMap<String, Object> model = new HashMap<>();
            model.put("result", result);
            return new ModelAndView(model, "randomiser.vtl");
        }, velocityTemplateEngine);

        Spark.exception(Exception.class, (exception, request, response) -> {
            exception.printStackTrace();
        });

        get("/two", (req, res) -> {
            ArrayList result = randomiser.getTwoRandomNames();
            HashMap<String, Object> model = new HashMap<>();
            model.put("result", result);
            return new ModelAndView(model, "randomiser.vtl");
        }, velocityTemplateEngine);

        Spark.exception(Exception.class, (exception, request, response) -> {
            exception.printStackTrace();
        });
   }



}
