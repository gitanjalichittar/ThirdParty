package Demo.ThirdParty.Entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

@Entity
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Registered {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long registeredId;
    private Date date;
    private Long age;
}
