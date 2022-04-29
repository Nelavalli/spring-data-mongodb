package com.srikanth.springdatamongodb;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class TestController {

    @Autowired
    BasketRepository basketRepository;

    @PostMapping(value = "/basket", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public void save(@RequestBody Basket basket) {
        try {
            basketRepository.save(basket);
        } catch (final Exception e) {
            e.printStackTrace();
            throw e;
        }
    }
}
