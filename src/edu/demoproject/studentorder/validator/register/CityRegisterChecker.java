package edu.demoproject.studentorder.validator.register;

import edu.demoproject.studentorder.domain.register.CityRegisterResponse;
import edu.demoproject.studentorder.domain.Person;
import edu.demoproject.studentorder.exception.CityRegisterException;
import edu.demoproject.studentorder.exception.TransportException;

public interface CityRegisterChecker {

    CityRegisterResponse checkPerson(Person person) throws CityRegisterException, TransportException;

}
