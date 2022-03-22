/*
 * Copyrights (c) //Author Gadiler 24/02/2022, 22:37.
 * All rights reserved to Gadi Engelsman.
 * https://github.com/Gadiler/
 */

package integrativeProject.FinalProject.services.interfaces;

import integrativeProject.FinalProject.beans.Destination;
import integrativeProject.FinalProject.exceptions.ExistException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface CountryService {
    String getCountryName(int countryID) throws ExistException;
    List<Destination> getAllDestinations(int countryID) throws ExistException;

}
