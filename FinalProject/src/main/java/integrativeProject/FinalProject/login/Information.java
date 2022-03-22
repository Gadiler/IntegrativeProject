/*
 * Copyrights (c) //Author Gadiler 13/03/2022, 20:18.
 * All rights reserved to Gadi Engelsman.
 * https://github.com/Gadiler/
 */

package integrativeProject.FinalProject.login;

import integrativeProject.FinalProject.services.interfaces.UserService;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@Data
@Builder
@AllArgsConstructor
@RequiredArgsConstructor
public class Information {
    private long currentTimeMillis;
    private UserService userService;
}
