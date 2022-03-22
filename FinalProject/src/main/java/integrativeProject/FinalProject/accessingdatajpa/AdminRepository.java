/*
 * Copyrights (c) //Author Gadiler 11/03/2022, 18:00.
 * All rights reserved to Gadi Engelsman.
 * https://github.com/Gadiler/
 */

package integrativeProject.FinalProject.accessingdatajpa;

import integrativeProject.FinalProject.beans.Admin;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AdminRepository extends JpaRepository<Admin, Integer> {
}
