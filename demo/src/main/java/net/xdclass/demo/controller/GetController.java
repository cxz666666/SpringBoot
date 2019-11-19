package net.xdclass.demo.controller;

import com.alibaba.fastjson.JSONObject;
import net.xdclass.demo.model.ServerConstant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@PropertySource({"classpath:application.properties"})
public class GetController {

    private Map<String, Object> parms = new HashMap<>();

    /**
     * 从路径获取字段
     * @param id
     * @return
     */
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Map<String, Object> getUser(@PathVariable String id){
        parms.clear();
        parms.put("id", id);
        return parms;
    }

    /**
     * 测试GetMapping
     * @param id1
     * @return
     */
    @GetMapping(value = "/user/{id1}")
    public Map<String, Object> getUser2(@PathVariable String id1){
        parms.clear();
        parms.put("id", id1);
        return parms;
    }

    /**
     * 默认值,参数是否必须
     * @param id1
     * @return
     */
    @GetMapping(value = "/user/id1")
    public Map<String, Object> getUser3(@RequestParam(defaultValue = "1") String id1){
        parms.clear();
        parms.put("id", id1);
        return parms;
    }

    /**
     * 测试获取http头信息
     * @param id1
     * @return
     */
    @GetMapping(value = "/user/get_header")
    public Map<String, Object> getHeader(@RequestHeader String id1){
        parms.clear();
        parms.put("id", id1);
        return parms;
    }

    @Value("${test.name}")
    private String name;

    @RequestMapping("/test")
    public String test(){
        return name;
    }

    @Autowired
    private ServerConstant serverConstant;
    @RequestMapping("/test1")
    public Map<String, Object> test1(){
        parms.clear();
        parms.put("name", serverConstant.getName());
        parms.put("domain", serverConstant.getDomain());
        return parms;
    }

    public static void main(String[] args){
        String s = "{\n" +
                "    \"deviceSystem\": \"ic1ABk7XPabMlyduE3oUbw==\",\n" +
                "    \"pushId\": \"zTuzyxhlUcugTy2qDyGKRQ==\",\n" +
                "    \"hwToken\": \"Tnslp1+0WUYYCoZwqB2sNg==\",\n" +
                "    \"userUuid\": \"lErNRUCigbbEecnrKDK5zQ==\",\n" +
                "    \"deviceSystemVersion\": \"x4juWnEm90D0w5LDnItk/g==\",\n" +
                "    \"deviceModel\": \"xCNKl8yCtZqFUPgyNHEpFw==\",\n" +
                "    \"deviceId\": \"/qhoUwiyBPdsX8kXIPI2Iw==\",\n" +
                "    \"pushToken\": \"//P1aha/1JE9S2j6BPdekw==\",\n" +
                "    \"deviceBrand\": \"GZbPyp4k6Rw508VseNCdXg==\"\n" +
                "}";
        System.out.println(s.toString());
    }


}
