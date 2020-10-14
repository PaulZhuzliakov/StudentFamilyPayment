package edu.demoproject.studentorder;

import edu.demoproject.studentorder.domain.*;
import edu.demoproject.studentorder.mail.MailSender;
import edu.demoproject.studentorder.validator.ChildrenValidator;
import edu.demoproject.studentorder.validator.CityRegisterValidator;
import edu.demoproject.studentorder.validator.StudentValidator;
import edu.demoproject.studentorder.validator.WeddingValidator;

public class StudentOrderValidator {

    private CityRegisterValidator cityRegisterVal;
    private WeddingValidator weddingVal;
    private ChildrenValidator childrenVal;
    private StudentValidator studentVal;
    private MailSender mailSender;

    public StudentOrderValidator() {
        this.cityRegisterVal = new CityRegisterValidator();
        this.weddingVal = new WeddingValidator();
        this.childrenVal = new ChildrenValidator();
        this.studentVal = new StudentValidator();
        this.mailSender = new MailSender();
    }

    public static void main(String[] args) {
        StudentOrderValidator sov = new StudentOrderValidator();
        sov.checkAll();
    }

    public void checkAll() {
        StudentOrder[] soArray = readStudentOrders();

//        for (int i = 0; i < soArray.length; i++) {
//            System.out.println(" ");
//            checkOneOrder(soArray[i]);
//        }
        for (StudentOrder so : soArray) {
            System.out.println(" ");
            checkOneOrder(so);

        }
    }

    public StudentOrder[] readStudentOrders() {
        StudentOrder[] soArray = new StudentOrder[3];

        for (int i = 0; i < soArray.length; i++) {
            soArray[i] = SaveStudentOrder.buildStudentOrder(i);
        }
        return soArray;
    }

    public void checkOneOrder(StudentOrder so) {
        AnswerCityRegister cityAnswer = checkCityRegister(so);
        AnswerWedding weddingAnswer = checkWedding(so);
        AnswerChildren childAnswer = checkChildren(so);
        AnswerStudent studentAnswer = checkStudent(so);
        sendMail(so);
    }


    public AnswerCityRegister checkCityRegister(StudentOrder so) {
        return cityRegisterVal.checkCityRegister(so);
    }

    public AnswerWedding checkWedding(StudentOrder so) {
        return weddingVal.checkWedding(so);
    }

    public AnswerChildren checkChildren(StudentOrder so) {
        return childrenVal.checkChildren(so);
    }

    public AnswerStudent checkStudent(StudentOrder so) {
        return studentVal.checkStudent(so);
    }

    public void sendMail(StudentOrder so) {
        mailSender.sendMail(so);
    }

}
