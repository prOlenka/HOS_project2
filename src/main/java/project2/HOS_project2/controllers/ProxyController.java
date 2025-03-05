package project2.HOS_project2.controllers;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/proxy")
public class ProxyController {

    @GetMapping
    public ResponseEntity<byte[]> fetchUrl(@RequestParam String url) {
        RestTemplate restTemplate = new RestTemplate();
        byte[] body = restTemplate.getForObject(url, byte[].class);

        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.TEXT_HTML);
        headers.add("X-Frame-Options", "ALLOW-FROM *");

        return new ResponseEntity<>(body, headers, HttpStatus.OK);
    }
}

