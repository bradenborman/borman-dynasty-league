package bdl;

import org.springframework.boot.builder.SpringApplicationBuilder;

public class Server extends BormanDynastyLeagueApplication {

    public static void main(String[] args) {
        new Server().configure(new SpringApplicationBuilder())
                .initializers()
                .profiles("local", "secret")
                .run(args);
    }

}