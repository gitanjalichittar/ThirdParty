package Demo.ThirdParty.Entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;


@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Result {
    @javax.persistence.Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long resultId;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "name")
    private Name name;

    @OneToOne(cascade =CascadeType.ALL)
    @JoinColumn(name = "location")
    private Location location;

    private String email;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "lagin")
    private Login login;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "dob")
    private Dob dob;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "registered")
    private Registered registered;

    private String phone;

    private String cell;

     @OneToOne(cascade = CascadeType.ALL)
     @JoinColumn(name = "id")
    private Id id;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "picture")
    private Picture picture;
}
