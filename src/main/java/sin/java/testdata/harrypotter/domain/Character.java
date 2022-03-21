package sin.java.testdata.harrypotter.domain;

import lombok.Data;

import javax.persistence.*;
import java.util.ArrayList;

@Entity
@Data
@Table(name = "CHARACTER")
public class Character {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Long id;
    @Column(name = "FIRSTNAME")
    private String firstName;
    @Column(name = "MIDDLENAME")
    private String middleName;
    @Column(name = "LASTNAME")
    private String lastName;
    @Column(name = "CONSTITUTE_TYPE")
    private CharacterConstitute constituteType;
    @Column(name = "CONSTITUTE")
    private CharacterConstitute constitute;


//    private ArrayList<NickNames> nickNamesList = new ArrayList<>();

}

