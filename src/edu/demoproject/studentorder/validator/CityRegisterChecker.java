package edu.demoproject.studentorder.validator;

import edu.demoproject.studentorder.domain.CityRegisterCheckResponse;
import edu.demoproject.studentorder.domain.Person;

public interface CityRegisterChecker {

    CityRegisterCheckResponse checkPerson(Person person);

}
