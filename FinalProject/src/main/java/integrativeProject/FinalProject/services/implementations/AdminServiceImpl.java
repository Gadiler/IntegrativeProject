/*
 * Copyrights (c) //Author Gadiler 11/03/2022, 18:05.
 * All rights reserved to Gadi Engelsman.
 * https://github.com/Gadiler/
 */

package integrativeProject.FinalProject.services.implementations;

import integrativeProject.FinalProject.accessingdatajpa.AdminRepository;
import integrativeProject.FinalProject.beans.Admin;
import integrativeProject.FinalProject.services.interfaces.AdminService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class AdminServiceImpl implements AdminService{
    private final AdminRepository adminRepository;


    @Override
    public List<Admin> getAllUsers() {
        return adminRepository.findAll();
    }


}
