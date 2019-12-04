package net.xdclass.demo;

import org.junit.Test;
import org.springframework.http.MediaType;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

/**
 * @PackageName: net.xdclass.demo
 * @ClassName: WebClientTest
 * @Description:
 * @author: cxz
 * @date 2019/12/2 9:59
 */
public class WebClientTest {

    @Test
    public void TestBase(){
        Mono<String> bodyMono = WebClient.create().get()
                .uri("http://localhost:9090/api/v1/test/find?id=1")
                .accept(MediaType.APPLICATION_JSON)
                .retrieve().bodyToMono(String.class);
        System.out.println(bodyMono.block());
    }

}
