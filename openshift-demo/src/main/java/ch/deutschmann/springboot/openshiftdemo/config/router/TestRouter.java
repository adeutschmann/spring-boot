package ch.deutschmann.springboot.openshiftdemo.config.router;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.web.reactive.function.server.RequestPredicates;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.RouterFunctions;
import org.springframework.web.reactive.function.server.ServerResponse;

import ch.deutschmann.springboot.openshiftdemo.handler.TestHandler;

@Configuration
public class TestRouter {
    
    @Bean
    public RouterFunction<ServerResponse> routeAccount(TestHandler testHandler) {
            return RouterFunctions
                            .route(RequestPredicates.GET("/")
                                            .and(RequestPredicates.accept(MediaType.ALL)),
                                            testHandler::helloWorld);
    }

}
