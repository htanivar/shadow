package sin.java.testdata.harrypotter.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class NickNames {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private Long characterId;
    private String nickName;
}
