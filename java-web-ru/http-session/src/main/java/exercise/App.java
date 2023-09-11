package exercise;

import io.javalin.Javalin;
import java.util.List;
import java.util.Map;

public final class App {

    private static final List<Map<String, String>> USERS = Data.getUsers();

    public static Javalin getApp() {

        var app = Javalin.create(config -> {
            config.plugins.enableDevLogging();
        });

        // BEGIN
        app.get("/users", ctx -> {
            var resultSize = ctx.queryParamAsClass("resultSize", Integer.class).getOrDefault(5);
            List<Map<String, String>> miniUsers = USERS.subList(0,5);
            ctx.json(miniUsers);
                });
        // END
        return app;

    }

    public static void main(String[] args) {
        Javalin app = getApp();
        app.start(7070);
    }
}
