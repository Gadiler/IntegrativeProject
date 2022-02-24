/*
 * Copyrights (c) //Author Gadiler 24/02/2022, 22:22.
 * All rights reserved to Gadi Engelsman.
 * https://github.com/Gadiler/
 */

package integrativeProject.FinalProject.beans;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "reports")
public class Report {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private int id;
    private String description;
    @Enumerated(EnumType.ORDINAL)
    private Category reportCategory;
    @OneToOne
    private User reportUser;


}
