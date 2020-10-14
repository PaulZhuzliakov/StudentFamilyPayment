package edu.demoproject.studentorder.validator;

import edu.demoproject.studentorder.domain.CityRegisterCheckResponse;
import edu.demoproject.studentorder.domain.Person;

//заглушка
public class FakeCityRegisterChecker implements CityRegisterChecker{

    public CityRegisterCheckResponse checkPerson(Person person) {

        return null;
    }

}
