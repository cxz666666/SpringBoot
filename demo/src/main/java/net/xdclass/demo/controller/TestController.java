package net.xdclass.demo.controller;

import net.xdclass.demo.domain.User;
import net.xdclass.demo.service.UserService;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.time.Duration;

/**
 * @PackageName: net.xdclass.demo.controller
 * @ClassName: TestController
 * @Description: 响应式编程
 * @author: cxz
 * @date 2019/11/29 10:07
 */
@RestController
@RequestMapping("api/v1/test")
public class TestController {

    private final UserService userService;

    public TestController(final UserService userService){
        this.userService = userService;
    }

    @GetMapping("test1")
    public Mono<String> test(){
        return Mono.just("hello word");
    }

    /**
     * 查找用户
     * @param id
     * @return
     */
    @GetMapping("find")
    public Mono<User> findById(final String id){
        return userService.getById(id);
    }

    /**
     * 删除用户
     * @param id
     * @return
     */
    @GetMapping("del")
    public Mono<User> del(final String id){
        return userService.deleteById(id);
    }

    /**
     * 用户列表
     * @return
     */
    @GetMapping(value = "list", produces = MediaType.APPLICATION_STREAM_JSON_VALUE)
    public Flux<User> list(){
        //一个个进行响应
        return userService.list().delayElements(Duration.ofSeconds(2));
        //一起响应
//        return userService.list();
    }

}
