package com.example.demo;

import com.example.demo.vo.User;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DemoApplicationTests {

    @Test
    void contextLoads() throws JsonProcessingException {
        System.out.println("------------");

        //text json-> object
        //object-> text json

        //controller req json(text)-> object
        //response object -> json(text)
        var objectMapper= new ObjectMapper();

        //object ->text
        //object mapper get method 반환
        var user= new User("juyoung",27);

        var text= objectMapper.writeValueAsString(user);
        System.out.println(text);

         //text->object
        //object mapper는 defalut 생성자를 필요로 한다.
        var objectUser=objectMapper.readValue(text, User.class);
        System.out.println(objectUser);

    }

}
