/*
 * Copyrights (c) //Author Gadiler 24/02/2022, 22:38.
 * All rights reserved to Gadi Engelsman.
 * https://github.com/Gadiler/
 */

package integrativeProject.FinalProject.services.interfaces;

import integrativeProject.FinalProject.beans.Country;
import integrativeProject.FinalProject.beans.Destination;
import integrativeProject.FinalProject.beans.Report;
import integrativeProject.FinalProject.exceptions.ExistException;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Stream;

@Service
public interface DestinationService {
    String getDestinationName(int destID) throws ExistException;
    Country getDestinationCountry(int destID) throws ExistException;
    List<Destination> getAllDestinations();
    Stream<Report> getAllDestinationReports(int reportID);

}
