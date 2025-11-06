package fr.studi.live.ws;

import fr.studi.live.service.HelloWorldService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/helloWorld")
public class HelloWorldController {

    @Autowired
    private HelloWorldService helloWorldService;

    @GetMapping
    public ResponseEntity<Object> helloWorld(){
       List<String> maListe = helloWorldService.getHelloWorldList();
       return ResponseEntity.status(HttpStatus.OK).body(maListe);
    }

    @GetMapping("/{name}")
    public ResponseEntity<Object> hello(@PathVariable String name){
        return ResponseEntity.status(HttpStatus.OK).body("Hello " + name);
    }

    @PostMapping("/{name}")
    public ResponseEntity<Object> createPost(@PathVariable String name){
        helloWorldService.createPost(name);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }
}
