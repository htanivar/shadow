package sin.java.testdata.harrypotter.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import sin.java.testdata.harrypotter.domain.Character;
import sin.java.testdata.harrypotter.service.CharacterService;

import java.util.List;

@RestController
@RequestMapping("/api")
public class CharacterController {

    @Autowired
    private CharacterService characterService;

    @GetMapping("/character/all")
    public List<Character> getAllCharacters() {
        return characterService.getAllCharacters();
    }

    @GetMapping("/character/{characterId}")
    public Character getCharacter(@PathVariable Long characterId) {
        return characterService.getCharacterById(characterId);
    }

    @DeleteMapping("/character/{characterId}")
    public String deleteCharacter(@PathVariable Long characterId) {
        return characterService.deleteCharacterById(characterId);
    }

    @PostMapping("/character/add")
    public Character addCharacter(@RequestBody Character character){
        return characterService.addHarryPotterCharacter(character);
    }

}
