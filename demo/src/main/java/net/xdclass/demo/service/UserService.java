package net.xdclass.demo.service;

import net.xdclass.demo.domain.User;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/**
 * @PackageName: net.xdclass.demo.service
 * @ClassName: UserService
 * @Description:
 * @author: cxz
 * @date 2019/12/2 9:22
 */
@Service
public class UserService {

    private static final Map<String, User> dataMap = new HashMap<>();

    static {
        dataMap.put("1", new User("1", "test1"));
        dataMap.put("2", new User("2", "test2"));
        dataMap.put("3", new User("3", "test3"));
        dataMap.put("4", new User("4", "test4"));
        dataMap.put("5", new User("5", "test5"));
        dataMap.put("6", new User("6", "test6"));
        dataMap.put("7", new User("7", "test7"));
    }

    /**
     * 返回用户列表
     * @return
     */
    public Flux<User> list(){
        Collection<User> userCollection = UserService.dataMap.values();
        return Flux.fromIterable(userCollection);
    }

    /**
     * 根据id查找用户
     * @param id
     * @return
     */
    public Mono<User> getById(final String id){
        return Mono.justOrEmpty(UserService.dataMap.get(id));
    }

    /**
     * 根据ID删除
     * @param id
     * @return
     */
    public Mono<User> deleteById(final String id){
        return Mono.justOrEmpty(UserService.dataMap.remove(id));
    }
}
