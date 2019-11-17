package sin.java.testdata.harrypotter.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.web.bind.annotation.*;
import sin.java.testdata.harrypotter.domain.Character;
import sin.java.testdata.harrypotter.repository.CharacterRepository;
import sin.java.testdata.harrypotter.service.CharacterService;

import java.util.List;
import java.util.Optional;

@RestController
public class CharacterController {

    @Autowired
    private CharacterService characterService;

    @GetMapping("/all")
    public List<Character> getAllCharacters() {
        return characterService.getAllCharacters();
    }
}
