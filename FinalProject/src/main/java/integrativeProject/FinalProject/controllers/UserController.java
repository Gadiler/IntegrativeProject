/*
 * Copyrights (c) //Author Gadiler 22/03/2022, 21:35.
 * All rights reserved to Gadi Engelsman.
 * https://github.com/Gadiler/
 */

package integrativeProject.FinalProject.controllers;

import integrativeProject.FinalProject.beans.LoginResponse;
import integrativeProject.FinalProject.beans.Type;
import integrativeProject.FinalProject.beans.User;
import integrativeProject.FinalProject.exceptions.DeniedAccessException;
import integrativeProject.FinalProject.login.LoginManager;
import integrativeProject.FinalProject.services.interfaces.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("user")
@RequiredArgsConstructor
@CrossOrigin(origins = "http://localhost:4200", allowedHeaders = "*")
public class UserController {
    private final String TAG = this.getClass().getSimpleName();
    private final UserService userService;
    private final LoginManager loginManager;

    @PostMapping("/login")
    public ResponseEntity<?> login(@RequestBody User user) throws DeniedAccessException {
        System.err.println(TAG + ": inside login()");
        System.out.println(user.getUserName() + " " + user.getPassword() + " " + user.getType());
        String token = loginManager.register(user.getUserName(), user.getPassword(), Type.Admin);
        System.out.println("token: " + token);
        return new ResponseEntity<>(new LoginResponse(token), HttpStatus.OK);
    }


}
