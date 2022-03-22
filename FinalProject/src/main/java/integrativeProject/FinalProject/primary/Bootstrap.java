/*
 * Copyrights (c) //Author Gadiler 11/03/2022, 23:33.
 * All rights reserved to Gadi Engelsman.
 * https://github.com/Gadiler/
 */

package integrativeProject.FinalProject.primary;

import integrativeProject.FinalProject.accessingdatajpa.UserRepository;
import integrativeProject.FinalProject.beans.Type;
import integrativeProject.FinalProject.beans.User;
import integrativeProject.FinalProject.utils.ArtUtils;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
@Order(1)
@RequiredArgsConstructor
public class Bootstrap implements CommandLineRunner {

    private final UserRepository userRepository;
    private final ArtUtils artUtils;

    @Override
    public void run(String... args) throws Exception {
        System.out.println(ArtUtils.BOOTSTRAP);

        User pm1 = User.builder().userName("pm_user1").password("123456789").type(Type.User).build();
        User pm2 = User.builder().userName("pm_user2").password("123456789").type(Type.User).build();
        User pm3 = User.builder().userName("pm_user3").password("123456789").type(Type.User).build();
        User pm4 = User.builder().userName("pm_user4").password("123456789").type(Type.User).build();
        User pm5 = User.builder().userName("pm_user5").password("123456789").type(Type.User).build();
        User pm6 = User.builder().userName("pm_user6").password("123456789").type(Type.User).build();
        User pm7 = User.builder().userName("pm_user7").password("123456789").type(Type.User).build();
        User pm8 = User.builder().userName("pm_user8").password("123456789").type(Type.User).build();
        User pm9 = User.builder().userName("pm_user9").password("123456789").type(Type.User).build();
        User pm10 = User.builder().userName("pm_user10").password("123456789").type(Type.User).build();
        userRepository.saveAll(Arrays.asList(pm1, pm2, pm3, pm4, pm5, pm6, pm7, pm8, pm9, pm10));


        User d1 = User.builder().userName("guest_user1").password("123456789").type(Type.Guest).build();
        User d2 = User.builder().userName("guest_user2").password("123456789").type(Type.Guest).build();
        User d3 = User.builder().userName("guest_user3").password("123456789").type(Type.Guest).build();
        User d4 = User.builder().userName("guest_user4").password("123456789").type(Type.Guest).build();
        User d5 = User.builder().userName("guest_user5").password("123456789").type(Type.Guest).build();
        User d6 = User.builder().userName("guest_user6").password("123456789").type(Type.Guest).build();
        User d7 = User.builder().userName("guest_user7").password("123456789").type(Type.Guest).build();
        User d8 = User.builder().userName("guest_user8").password("123456789").type(Type.Guest).build();
        User d9 = User.builder().userName("guest_user9").password("123456789").type(Type.Guest).build();
        User d10 = User.builder().userName("guest_user10").password("123456789").type(Type.Guest).build();
        User d11 = User.builder().userName("guest_user11").password("123456789").type(Type.Guest).build();
        User d12 = User.builder().userName("guest_user12").password("123456789").type(Type.Guest).build();
        User d13 = User.builder().userName("guest_user13").password("123456789").type(Type.Guest).build();
        User d14 = User.builder().userName("guest_user14").password("123456789").type(Type.Guest).build();
        User d15 = User.builder().userName("guest_user15").password("123456789").type(Type.Guest).build();
        User d16 = User.builder().userName("guest_user16").password("123456789").type(Type.Guest).build();
        User d17 = User.builder().userName("guest_user17").password("123456789").type(Type.Guest).build();
        User d18 = User.builder().userName("guest_user18").password("123456789").type(Type.Guest).build();
        User d19 = User.builder().userName("guest_user19").password("123456789").type(Type.Guest).build();
        User d20 = User.builder().userName("guest_user20").password("123456789").type(Type.Guest).build();
        userRepository.saveAll(Arrays.asList(d1, d2, d3, d4, d5, d6, d7, d8, d9, d10, d11, d12, d13, d14, d15, d16, d17, d18, d19, d20));


        User p1 = User.builder().userName("admin1").password("123456789").type(Type.Admin).build();
        User p2 = User.builder().userName("admin2").password("123456789").type(Type.Admin).build();
        User p3 = User.builder().userName("admin3").password("123456789").type(Type.Admin).build();
        User p4 = User.builder().userName("admin4").password("123456789").type(Type.Admin).build();
        User p5 = User.builder().userName("admin5").password("123456789").type(Type.Admin).build();
        User p6 = User.builder().userName("admin6").password("123456789").type(Type.Admin).build();
        User p7 = User.builder().userName("admin7").password("123456789").type(Type.Admin).build();
        User p8 = User.builder().userName("admin8").password("123456789").type(Type.Admin).build();
        User p9 = User.builder().userName("admin9").password("123456789").type(Type.Admin).build();


        ArtUtils.testTitle("Add all project to DB");
        userRepository.saveAll(Arrays.asList(p1, p2, p3, p4, p5, p6, p7, p8, p9));
//        artUtils.printProjectTable();
        ArtUtils.printSeparator();


    }
}
