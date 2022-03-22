/*
 * Copyrights (c) //Author Gadiler 13/03/2022, 20:14.
 * All rights reserved to Gadi Engelsman.
 * https://github.com/Gadiler/
 */

package integrativeProject.FinalProject.login;

import integrativeProject.FinalProject.beans.Type;
import integrativeProject.FinalProject.exceptions.DeniedAccessException;
import integrativeProject.FinalProject.security.TokenManager;
import integrativeProject.FinalProject.services.interfaces.AdminService;
import integrativeProject.FinalProject.services.interfaces.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class LoginManager {
    private final String TAG = this.getClass().getSimpleName();
    private final UserService userService;
    private final AdminService adminService;

    private final TokenManager tokenManager;
    private final ApplicationContext ctx;

    public UserService login(String email, String password, Type clientType) throws DeniedAccessException {
        switch (clientType) {
            case Admin:
//                if (adminService.login(email, password)) {
//                    return (UserService) adminService;
//                }
                break;
            case User:
//                if (((UserService) donateService).login(email, password)) {
//                    return (UserService) donateService;
//                }
                break;

            case Guest:
//                if (((UserService) projectManagerService).login(email, password)) {
//                    return (UserService) projectManagerService;
//                }
                break;
        }
        throw new DeniedAccessException("ACCESS DENIED!");
    }


    public String register(String email, String password, Type clientType) throws DeniedAccessException {
        switch (clientType) {
            case Admin:
//                userService = ctx.getBean(UserService.class);
                break;
//            case User:
//                userService = (UserService) ctx.getBean(DonateService.class);
//                break;
//            case Guest:
//                userService = (UserService) ctx.getBean(ProjectManagerService.class);
//                break;
        }
        if (userService.login(email, password)) {
            return tokenManager.createToken(userService);
        }
        throw new DeniedAccessException("Unauthorized member!");
    }
}