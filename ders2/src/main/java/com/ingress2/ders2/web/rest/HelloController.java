package com.ingress2.ders2.web.rest;

import com.ingress2.ders2.dto.StudentDto;
import com.ingress2.ders2.dto.WelcomeMessage;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@RequestMapping("/hello")
public class HelloController {
    @GetMapping
    public WelcomeMessage sayHello(@RequestHeader("Accept-Language")String lang, @RequestBody StudentDto studentDto){
        log.trace("Received request : {}",studentDto);
        return lang.equalsIgnoreCase("AZ")?
                new WelcomeMessage("Salam"+studentDto.getName())
                :new WelcomeMessage("Hello"+studentDto.getName());

    }
}
