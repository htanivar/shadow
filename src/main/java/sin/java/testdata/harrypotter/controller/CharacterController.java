package sin.java.testdata.harrypotter.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import sin.java.testdata.harrypotter.domain.Character;
import sin.java.testdata.harrypotter.service.CharacterService;

import java.util.List;

@RestController
public class CharacterController {

    @Autowired
    private CharacterService characterService;

    @GetMapping("/all")
    public List<Character> getAllCharacters() {
        return characterService.getAllCharacters();
    }

    @PostMapping("/add")
    public Character addCharacter(@RequestBody Character character){
        return characterService.addHarryPotterCharacter(character);
    }
}
