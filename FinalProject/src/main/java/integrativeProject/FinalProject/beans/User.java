/*
 * Copyrights (c) //Author Gadiler 24/02/2022, 22:21.
 * All rights reserved to Gadi Engelsman.
 * https://github.com/Gadiler/
 */

package integrativeProject.FinalProject.beans;

import lombok.*;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "users")
@Builder
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String userName;
    private String password;
    private String email;
    private Type type;

    @OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @Singular("oneReport")
    private List<Report> reportsList;

    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @Singular("favorite")
    private List<Report> favoriteList;
}
