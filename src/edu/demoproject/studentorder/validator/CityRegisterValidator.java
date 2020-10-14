package edu.demoproject.studentorder.validator;

import edu.demoproject.studentorder.domain.AnswerCityRegister;
import edu.demoproject.studentorder.domain.Person;
import edu.demoproject.studentorder.domain.StudentOrder;

public class CityRegisterValidator {

    public String hostName;
    protected String port;
    public String login;
    public String password;

    private CityRegisterChecker personChecker;


    public CityRegisterValidator() {
        personChecker = new FakeCityRegisterChecker()   ;
    }

    public AnswerCityRegister checkCityRegister(StudentOrder so) {
        Person p = so.getHusband();
        personChecker.checkPerson(so.getHusband());
        personChecker.checkPerson(so.getWife());
        personChecker.checkPerson(so.getChild());

        AnswerCityRegister ans = new AnswerCityRegister();
        return ans;
    }
}
