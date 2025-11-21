package fr.studi.live.ws;

import fr.studi.live.pojo.Pilote;
import fr.studi.live.service.PiloteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(ApiRegistration.REST_API + ApiRegistration.REST_PILOTE)
public class PiloteController {

    @Autowired
    private PiloteService piloteService;

    @GetMapping
    public ResponseEntity<Object> getAllPilote(){
       List<Pilote> maListe = piloteService.getAllPilote();
       return ResponseEntity.status(HttpStatus.OK).body(maListe);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Object> getPiloteById(@PathVariable Long id){
        Pilote monPilote = piloteService.getPiloteById(id);

        return monPilote == null ?
                ResponseEntity.status(HttpStatus.NOT_FOUND).build() :
                ResponseEntity.status(HttpStatus.OK).body(monPilote);
    }

    @PostMapping
    public ResponseEntity<Object> createPost(@RequestBody Pilote monPilote){
        piloteService.createPilote(monPilote);
       return ResponseEntity.status(HttpStatus.CREATED).build();
    }
}
