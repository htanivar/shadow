package sin.java.testdata.harrypotter.service;

import org.springframework.stereotype.Service;
import sin.java.testdata.harrypotter.domain.Character;
import sin.java.testdata.harrypotter.repository.CharacterRepository;

import java.util.List;

@Service
public class CharacterService {
    private CharacterRepository characterRepository;

    public CharacterService(CharacterRepository characterRepository) {
        this.characterRepository = characterRepository;
    }

    public List<Character> getAllCharacters() {
        return characterRepository.findAll();
    }

    public Character addHarryPotterCharacter(Character character){
        return characterRepository.save(character);
    }

    public Character getCharacterById(Long id) {
        return characterRepository.findById(id).orElseThrow(()->new IllegalArgumentException("Unable to find Character Id "+id));
    }
}
