/*
 * Copyrights (c) //Author Gadiler 24/02/2022, 22:30.
 * All rights reserved to Gadi Engelsman.
 * https://github.com/Gadiler/
 */

package integrativeProject.FinalProject.accessingdatajpa;

import integrativeProject.FinalProject.beans.Country;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CountryRepository extends JpaRepository<Country, Integer> {
}
