package com.demo.web;


import com.demo.web.dto.TestDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpRequest;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.*;

@RestController
@Slf4j
public class IndexController {

    String code = null;

    @GetMapping("/index")
    public String getIndex() throws Exception {
        log.debug("debuge :::::::", "debuge");
        log.info("INFO ::: ");

        MultiValueMap<String, String> parameters = new LinkedMultiValueMap<>();
        List<String> list = Arrays.asList("abc", "bbb", "cc");


        parameters.add("add", "aaa value");
        parameters.put("put", list);


        log.info("parametersaaa ::: "+ parameters);


        return "iiiiinnnnddddeeeexxx";
    }

    @PostMapping("/test2")
    public String postTest(@RequestBody TestDto testDto) throws Exception{
        System.out.println("testDto :::: " + testDto);
        Map<String, Object> map = new HashMap<>();
        map.put("data", testDto);
        return "okokok";
    }


    @GetMapping("/kakaologin")
    public void getTest(@RequestParam("code") String codec, HttpServletRequest req, HttpServletResponse res){

        System.out.println("code ::::" + code);
        System.out.println("req ::::" + req);
        System.out.println("res ::::" + res);


    }

}