package ch.deutschmann.springboot.openshiftdemo.handler;

import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;

import reactor.core.publisher.Mono;

@Component
public class TestHandler {

    public Mono<ServerResponse> helloWorld(ServerRequest serverRequest) {
        return ServerResponse.ok().bodyValue("Hello World");
    }
    
}
