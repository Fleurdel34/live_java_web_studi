package fr.studi.live.service;

import fr.studi.live.pojo.Pilote;
import fr.studi.live.repository.PiloteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PiloteService {

    @Autowired
    private PiloteRepository piloteRepository;


    public List<Pilote> getAllPilote(){
        return piloteRepository.findAll();
    }

    public Pilote getPiloteById(Long id) {
        return piloteRepository.findById(id).orElse(null);
    }

    public void createPilote(Pilote monPilote) {
    }
}
