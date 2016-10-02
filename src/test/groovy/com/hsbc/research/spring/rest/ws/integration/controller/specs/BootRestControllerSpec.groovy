package com.hsbc.research.spring.rest.ws.integration.controller.specs


import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter
import org.springframework.web.client.RestTemplate
import spock.lang.Shared
import spock.lang.Specification
import spock.lang.Unroll

/**
 * Created by sudhe on 29-08-2016.
 */
class BootRestControllerSpec extends Specification {
    @Shared url="http://localhost:8998/bootrest"

    def"Is spring boot running ?"(){
        when : "/status is called "
        ResponseEntity entity = new RestTemplate().getForEntity(url+"/status", String.class)

        then : "/status returns Boot is resting while running"
        entity.statusCode==HttpStatus.OK
        "Boot is resting while running".equals((String)entity.body);
    }

}
