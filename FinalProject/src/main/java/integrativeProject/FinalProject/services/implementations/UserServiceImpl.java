/*
 * Copyrights (c) //Author Gadiler 24/02/2022, 22:34.
 * All rights reserved to Gadi Engelsman.
 * https://github.com/Gadiler/
 */

package integrativeProject.FinalProject.services.implementations;

import integrativeProject.FinalProject.accessingdatajpa.UserRepository;
import integrativeProject.FinalProject.beans.Report;
import integrativeProject.FinalProject.beans.User;
import integrativeProject.FinalProject.exceptions.ExistException;
import integrativeProject.FinalProject.services.interfaces.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {
    private final String TAG = this.getClass().getSimpleName();
    private final UserRepository userRepository;
    private int lastUserId;

    @Override
    public boolean login(String userName, String password) {
        for (User user : this.userRepository.findAll()) {
            if (user.getUserName().equals(userName) && user.getPassword().equals(password)) {
                lastUserId = user.getId();
                return true;
            }
        }
        User u = User.builder().userName(userName).password(password).build();
        userRepository.saveAndFlush(u);
        this.lastUserId = u.getId();
        return true;
    }

    @Override
    public String getUserEmail(int userID) throws ExistException {
        return userRepository.findById(userID).orElseThrow(() -> new ExistException(TAG + ": The user NOT exist!")).getEmail();
    }

    @Override
    public String getUserName(int userID) throws ExistException {
        return userRepository.findById(userID).orElseThrow(() -> new ExistException(TAG + ": The user NOT exist!")).getUserName();
    }

    @Override
    public List<Report> getUserFavorites(int userID) throws ExistException {
        return userRepository.findById(userID).orElseThrow(() -> new ExistException(TAG + ": The user NOT exist!")).getFavoriteList();
    }

    @Override
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }
}
