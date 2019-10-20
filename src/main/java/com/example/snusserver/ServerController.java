package com.example.snusserver;
import com.example.snusserver.utilities.Utils;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@RestController

public class ServerController {

    @RequestMapping(value = "/snusData", method = RequestMethod.GET,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public String sayHello() throws IOException {
        String response = Utils.allSnuss();
        return response;
    }}

