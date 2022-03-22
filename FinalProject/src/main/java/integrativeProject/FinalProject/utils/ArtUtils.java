/*
 * Copyrights (c) //Author Gadiler 11/03/2022, 23:37.
 * All rights reserved to Gadi Engelsman.
 * https://github.com/Gadiler/
 */

package integrativeProject.FinalProject.utils;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@RequiredArgsConstructor
public class ArtUtils {

    public static int TEST_COUNT = 1;

//    private final ProjectRepository projectRepository;
//    private final ProjectManagerRepository projectManagerRepository;
//    private final DonateRepository donateRepository;

    public static final String BOOTSTRAP = "\n██████╗  ██████╗  ██████╗ ████████╗███████╗████████╗██████╗  █████╗ ██████╗ \n" +
            "██╔══██╗██╔═══██╗██╔═══██╗╚══██╔══╝██╔════╝╚══██╔══╝██╔══██╗██╔══██╗██╔══██╗\n" +
            "██████╔╝██║   ██║██║   ██║   ██║   ███████╗   ██║   ██████╔╝███████║██████╔╝\n" +
            "██╔══██╗██║   ██║██║   ██║   ██║   ╚════██║   ██║   ██╔══██╗██╔══██║██╔═══╝ \n" +
            "██████╔╝╚██████╔╝╚██████╔╝   ██║   ███████║   ██║   ██║  ██║██║  ██║██║     \n" +
            "╚═════╝  ╚═════╝  ╚═════╝    ╚═╝   ╚══════╝   ╚═╝   ╚═╝  ╚═╝╚═╝  ╚═╝╚═╝     \n" +
            "                                                                            ";
    public static final String PROJECT_SERVICE = "\n██████╗ ██████╗  ██████╗      ██╗███████╗ ██████╗████████╗    ███████╗███████╗██████╗ ██╗   ██╗██╗ ██████╗███████╗\n" +
            "██╔══██╗██╔══██╗██╔═══██╗     ██║██╔════╝██╔════╝╚══██╔══╝    ██╔════╝██╔════╝██╔══██╗██║   ██║██║██╔════╝██╔════╝\n" +
            "██████╔╝██████╔╝██║   ██║     ██║█████╗  ██║        ██║       ███████╗█████╗  ██████╔╝██║   ██║██║██║     █████╗  \n" +
            "██╔═══╝ ██╔══██╗██║   ██║██   ██║██╔══╝  ██║        ██║       ╚════██║██╔══╝  ██╔══██╗╚██╗ ██╔╝██║██║     ██╔══╝  \n" +
            "██║     ██║  ██║╚██████╔╝╚█████╔╝███████╗╚██████╗   ██║       ███████║███████╗██║  ██║ ╚████╔╝ ██║╚██████╗███████╗\n" +
            "╚═╝     ╚═╝  ╚═╝ ╚═════╝  ╚════╝ ╚══════╝ ╚═════╝   ╚═╝       ╚══════╝╚══════╝╚═╝  ╚═╝  ╚═══╝  ╚═╝ ╚═════╝╚══════╝\n" +
            "                                                                                                                  ";
    public static final String DONATE_SERVICE = "\n██████╗  ██████╗ ███╗   ██╗ █████╗ ████████╗███████╗    ███████╗███████╗██████╗ ██╗   ██╗██╗ ██████╗███████╗\n" +
            "██╔══██╗██╔═══██╗████╗  ██║██╔══██╗╚══██╔══╝██╔════╝    ██╔════╝██╔════╝██╔══██╗██║   ██║██║██╔════╝██╔════╝\n" +
            "██║  ██║██║   ██║██╔██╗ ██║███████║   ██║   █████╗      ███████╗█████╗  ██████╔╝██║   ██║██║██║     █████╗  \n" +
            "██║  ██║██║   ██║██║╚██╗██║██╔══██║   ██║   ██╔══╝      ╚════██║██╔══╝  ██╔══██╗╚██╗ ██╔╝██║██║     ██╔══╝  \n" +
            "██████╔╝╚██████╔╝██║ ╚████║██║  ██║   ██║   ███████╗    ███████║███████╗██║  ██║ ╚████╔╝ ██║╚██████╗███████╗\n" +
            "╚═════╝  ╚═════╝ ╚═╝  ╚═══╝╚═╝  ╚═╝   ╚═╝   ╚══════╝    ╚══════╝╚══════╝╚═╝  ╚═╝  ╚═══╝  ╚═╝ ╚═════╝╚══════╝\n" +
            "                                                                                                            ";


    public static void testTitle(String methodName) {
        StringBuilder sb = new StringBuilder("# Test unit NO. " + TEST_COUNT++ + " Method: " + methodName + "\n----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println(sb);
    }

    public static void printSeparator() {
        StringBuilder sb = new StringBuilder("\n----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------\n");
        System.out.println(sb);
    }

//    public void printProjectTable() {
//        TableList t1 = new TableList("Id", "Project Name", "Category", "Project Manager", "getCurrent Amount", "getExpected Amount").withUnicode(false);
//        projectRepository.findAll().forEach(project -> t1.addRow(String.valueOf(project.getId()), String.valueOf(project.getName()), String.valueOf(project.getCategory()), String.valueOf(project.getProjectManager().getUserName()), String.valueOf(project.getCurrentAmount()), String.valueOf(project.getExpectedAmount())));
//        t1.print();
//    }
//
//    public void printProjectTable(List<Project> projects) {
//        TableList t1 = new TableList("Id", "Project Name", "Category", "Project Manager", "getCurrent Amount", "getExpected Amount").withUnicode(false);
//        projects.forEach(project -> t1.addRow(String.valueOf(project.getId()), String.valueOf(project.getName()), String.valueOf(project.getCategory()), String.valueOf(project.getProjectManager().getUserName()), String.valueOf(project.getCurrentAmount()), String.valueOf(project.getExpectedAmount())));
//        t1.print();
//    }
//
//    public void printProjectManagerTable() {
//        TableList t1 = new TableList("Id", "ProjectManager Name", "User Type").withUnicode(false);
//        projectManagerRepository.findAll().forEach(projectManager -> {
//                    if (projectManager.getUserType().equals(Type.ProjectManager))
//                        t1.addRow(String.valueOf(projectManager.getId()), projectManager.getUserName(), String.valueOf(projectManager.getUserType()));
//                }
//        );
//        t1.print();
//
//        System.out.println("\nProjectManagers' Projects:");
//        projectManagerRepository.findAll().forEach(pm -> {
//            projectRepository.findAll().stream().filter(p -> p.getProjectManager().getId() == pm.getId()).forEach(project -> {
//                TableList t2 = new TableList("Id", "Project Name", "Category", "Project Manager ID", "getCurrent Amount", "getExpected Amount").withUnicode(false);
//                t2.addRow(String.valueOf(project.getId()), String.valueOf(project.getName()), String.valueOf(project.getCategory()), String.valueOf(project.getProjectManager().getId()), String.valueOf(project.getCurrentAmount()), String.valueOf(project.getExpectedAmount()));
//                t2.print();
//                System.out.println("\n");
//            });
//        });
//    }
//
//    public void printDonatesTable() {
//        TableList t1 = new TableList("Id", "Donate Name", "User Type");
//        donateRepository.findAll().forEach(donate -> {
//            if (donate.getUserType().equals(Type.Donate)) {
//                t1.addRow(String.valueOf(donate.getId()), donate.getUserName(), String.valueOf(donate.getUserType()));
//            }
//        });
//        t1.print();
//
//        //TODO: Need to create foreach donate -> project.
////        System.out.println("\nDonates' Projects:");
////        donateRepository.findAll().forEach(donate -> {
////            projectRepository.findAll().stream().filter(p -> p.getProjectManager().getId() == donate.getId()).forEach(project -> {
////                TableList t2 = new TableList("Id", "Project Name", "Category", "Donate ID", "getCurrent Amount", "getExpected Amount").withUnicode(false);
////                t2.addRow(String.valueOf(project.getId()), String.valueOf(project.getName()), String.valueOf(project.getCategory()), String.valueOf(project.getProjectManager().getId()), String.valueOf(project.getCurrentAmount()), String.valueOf(project.getExpectedAmount()));
////                t2.print();
////                System.out.println("\n");
////            });
////        });
//    }
}
