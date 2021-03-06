import models.Randomiser;
import spark.ModelAndView;
import spark.Spark;
import spark.template.velocity.VelocityTemplateEngine;

import java.util.ArrayList;
import java.util.HashMap;

import static spark.Spark.get;

public class Controller {


    public static void main(String[] args) {
        VelocityTemplateEngine velocityTemplateEngine = new VelocityTemplateEngine();
        Randomiser randomiser = new Randomiser();
        Spark.exception(Exception.class, (exception, request, response) -> {
            exception.printStackTrace();
        });

        get("/one", (req, res) -> {
            String result = randomiser.shuffleNameListGetName();
            HashMap<String, Object> model = new HashMap<>();
            model.put("result", result);
            return new ModelAndView(model, "randomiser.vtl");
        }, velocityTemplateEngine);

      get("/two", (req, res) -> {
          ArrayList result = randomiser.getTwoRandomNames();
          HashMap<String, Object> model = new HashMap<>();
          model.put("result", result);
          return new ModelAndView(model, "randomiser.vtl");
       }, velocityTemplateEngine);

        get("/three", (req, res) -> {
            ArrayList result = randomiser.getThreeRandomNames();
            HashMap<String, Object> model = new HashMap<>();
            model.put("result", result);
            return new ModelAndView(model, "randomiser.vtl");
        }, velocityTemplateEngine);
   }

}
