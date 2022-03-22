/*
 * Copyrights (c) //Author Gadiler 24/02/2022, 22:39.
 * All rights reserved to Gadi Engelsman.
 * https://github.com/Gadiler/
 */

package integrativeProject.FinalProject.services.implementations;

import integrativeProject.FinalProject.accessingdatajpa.ReportRepository;
import integrativeProject.FinalProject.beans.Destination;
import integrativeProject.FinalProject.beans.Report;
import integrativeProject.FinalProject.beans.User;
import integrativeProject.FinalProject.exceptions.ExistException;
import integrativeProject.FinalProject.services.interfaces.ReportService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Stream;

@Service
@RequiredArgsConstructor
public class ReportServiceImpl implements ReportService {
    private final String TAG = this.getClass().getSimpleName();
    private final ReportRepository reportRepository;

    @Override
    public String getReportTitle(int reportID) throws ExistException {
        return reportRepository.findById(reportID).orElseThrow(() ->new ExistException(TAG + ": Report NOT exist!")).getTitle();
    }

    @Override
    public String getReportDescription(int reportID) throws ExistException {
        return reportRepository.findById(reportID).orElseThrow(() ->new ExistException(TAG + ": Report NOT exist!")).getTitle();
    }

    @Override
    public String getReportCategory(int reportID) throws ExistException {
        return reportRepository.findById(reportID).orElseThrow(() ->new ExistException(TAG + ": Report NOT exist!")).getReportCategory().name();
    }

    @Override
    public User getReportReportUser(int reportID) throws ExistException {
        return reportRepository.findById(reportID).orElseThrow(() ->new ExistException(TAG + ": Report NOT exist!")).getReportUser();
    }

    @Override
    public Destination getReportDestination(int reportID) throws ExistException {
        return reportRepository.findById(reportID).orElseThrow(() ->new ExistException(TAG + ": Report NOT exist!")).getReportDest();
    }

    @Override
    public List<Report> getAllReports() {
        return reportRepository.findAll();
    }

    @Override
    public Stream<Report> getAllUserReports(int userID) {
        return reportRepository.findAll().stream().filter(report -> report.getReportUser().getId() == userID);
    }
}
