/*
 * Copyrights (c) //Author Gadiler 11/03/2022, 18:03.
 * All rights reserved to Gadi Engelsman.
 * https://github.com/Gadiler/
 */

package integrativeProject.FinalProject.services.interfaces;

import integrativeProject.FinalProject.beans.Admin;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface AdminService {
    public List<Admin> getAllUsers();
}
