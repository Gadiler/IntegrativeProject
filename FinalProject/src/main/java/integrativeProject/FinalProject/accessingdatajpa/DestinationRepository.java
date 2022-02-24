/*
 * Copyrights (c) //Author Gadiler 24/02/2022, 22:28.
 * All rights reserved to Gadi Engelsman.
 * https://github.com/Gadiler/
 */

package integrativeProject.FinalProject.accessingdatajpa;

import integrativeProject.FinalProject.beans.Destination;
import integrativeProject.FinalProject.beans.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DestinationRepository extends JpaRepository<Destination, Integer> {
}
