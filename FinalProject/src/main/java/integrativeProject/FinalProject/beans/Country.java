/*
 * Copyrights (c) //Author Gadiler 24/02/2022, 22:19.
 * All rights reserved to Gadi Engelsman.
 * https://github.com/Gadiler/
 */

package integrativeProject.FinalProject.beans;

import lombok.*;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "countries")
@Builder
public class Country {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String countryName;

    @OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @Singular("oneDestination")
    private List<Destination> destinationList = new ArrayList();
}
