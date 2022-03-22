/*
 * Copyrights (c) //Author Gadiler 24/02/2022, 22:39.
 * All rights reserved to Gadi Engelsman.
 * https://github.com/Gadiler/
 */

package integrativeProject.FinalProject.services.implementations;

import integrativeProject.FinalProject.accessingdatajpa.DestinationRepository;
import integrativeProject.FinalProject.accessingdatajpa.ReportRepository;
import integrativeProject.FinalProject.beans.Country;
import integrativeProject.FinalProject.beans.Destination;
import integrativeProject.FinalProject.beans.Report;
import integrativeProject.FinalProject.exceptions.ExistException;
import integrativeProject.FinalProject.services.interfaces.DestinationService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Stream;

@Service
@RequiredArgsConstructor
public class DestinationServiceImpl implements DestinationService {
    private final String TAG = this.getClass().getSimpleName();
    private final DestinationRepository destRepository;
    private final ReportRepository reportRepository;

    @Override
    public String getDestinationName(int destID) throws ExistException {
        return destRepository.findById(destID).orElseThrow(() -> new ExistException(TAG +": The destination not exist!")).getDestName();
    }

    @Override
    public Country getDestinationCountry(int destID) throws ExistException {
        return destRepository.findById(destID).orElseThrow(() -> new ExistException(TAG +": The destination not exist!")).getDestCountry();
    }

    @Override
    public List<Destination> getAllDestinations() {
        return destRepository.findAll();
    }

    @Override
    public Stream<Report> getAllDestinationReports(int destID) {
        return reportRepository.findAll().stream().filter(report -> report.getReportDest().getId() == destID);
    }
}
