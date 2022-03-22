/*
 * Copyrights (c) //Author Gadiler 24/02/2022, 22:38.
 * All rights reserved to Gadi Engelsman.
 * https://github.com/Gadiler/
 */

package integrativeProject.FinalProject.services.interfaces;

import integrativeProject.FinalProject.beans.Destination;
import integrativeProject.FinalProject.beans.Report;
import integrativeProject.FinalProject.beans.User;
import integrativeProject.FinalProject.exceptions.ExistException;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Stream;

@Service
public interface ReportService {
    String getReportTitle(int reportID) throws ExistException;
    String getReportDescription(int reportID) throws ExistException;
    String getReportCategory(int reportID) throws ExistException;
    User getReportReportUser(int reportID) throws ExistException;
    Destination getReportDestination(int reportID) throws ExistException;

    List<Report> getAllReports();
    Stream<Report> getAllUserReports(int userID);



}
