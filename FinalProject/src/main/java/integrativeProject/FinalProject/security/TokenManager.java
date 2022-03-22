/*
 * Copyrights (c) //Author Gadiler 13/03/2022, 20:17.
 * All rights reserved to Gadi Engelsman.
 * https://github.com/Gadiler/
 */

package integrativeProject.FinalProject.security;

import integrativeProject.FinalProject.exceptions.DeniedAccessException;
import integrativeProject.FinalProject.login.Information;
import integrativeProject.FinalProject.services.interfaces.UserService;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

@Component
public class TokenManager {
    private final Map<String, Information> map = new HashMap();

    public String createToken(UserService clientService) {
        Information information = new Information(System.currentTimeMillis(), clientService);
        String token = UUID.randomUUID().toString();
        map.put(token, information);
        return token;
    }

    //TODO: Need to replace to other method, check if CurrentTimeMillis is before X time.
    public boolean isExist(String token) throws DeniedAccessException {
        if(map.containsKey(token)) {
            map.get(token).setCurrentTimeMillis(System.currentTimeMillis());
            return true;
        }throw new DeniedAccessException("Unauthorized!");
    }
}
