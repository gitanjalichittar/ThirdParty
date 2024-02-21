package Demo.ThirdParty.Entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.persistence.Id;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Location {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long locationId;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "street")
    private Street street;

    private String city;

    private String state;
    private String country;
    private String postcode;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "coordinates")
    private Coordinates coordinates;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "timezone")
    private Timezone timezone;
}
