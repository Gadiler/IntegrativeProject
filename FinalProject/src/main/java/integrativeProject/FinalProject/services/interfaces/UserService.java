/*
 * Copyrights (c) //Author Gadiler 24/02/2022, 22:32.
 * All rights reserved to Gadi Engelsman.
 * https://github.com/Gadiler/
 */

package integrativeProject.FinalProject.services.interfaces;

import integrativeProject.FinalProject.beans.Report;
import integrativeProject.FinalProject.beans.User;
import integrativeProject.FinalProject.exceptions.ExistException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserService {
    boolean login(String userName, String password);
    String getUserEmail(int userID) throws ExistException;
    String getUserName(int userID) throws ExistException;
    List<Report> getUserFavorites(int userID) throws ExistException;
    List<User> getAllUsers();
}
