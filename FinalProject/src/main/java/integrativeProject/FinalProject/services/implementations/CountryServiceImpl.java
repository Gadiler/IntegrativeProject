/*
 * Copyrights (c) //Author Gadiler 24/02/2022, 22:40.
 * All rights reserved to Gadi Engelsman.
 * https://github.com/Gadiler/
 */

package integrativeProject.FinalProject.services.implementations;

import integrativeProject.FinalProject.accessingdatajpa.CountryRepository;
import integrativeProject.FinalProject.beans.Destination;
import integrativeProject.FinalProject.exceptions.ExistException;
import integrativeProject.FinalProject.services.interfaces.CountryService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CountryServiceImpl implements CountryService {
    private final String TAG = this.getClass().getSimpleName();
    private final CountryRepository countryRepository;

    @Override
    public String getCountryName(int countryID) throws ExistException {
        return countryRepository.findById(countryID).orElseThrow(() -> new ExistException(TAG + ": Country NOT exist!")).getCountryName();
    }

    @Override
    public List<Destination> getAllDestinations(int countryID) throws ExistException {
        return countryRepository.findById(countryID).orElseThrow(() -> new ExistException(TAG + ": Country NOT exist!")).getDestinationList();
    }
}
