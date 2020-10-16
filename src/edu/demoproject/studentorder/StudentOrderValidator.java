package edu.demoproject.studentorder;

import edu.demoproject.studentorder.domain.*;
import edu.demoproject.studentorder.domain.register.AnswerCityRegister;
import edu.demoproject.studentorder.mail.MailSender;
import edu.demoproject.studentorder.validator.ChildrenValidator;
import edu.demoproject.studentorder.validator.CityRegisterValidator;
import edu.demoproject.studentorder.validator.StudentValidator;
import edu.demoproject.studentorder.validator.WeddingValidator;

import java.util.LinkedList;
import java.util.List;

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
        List<StudentOrder> soList = readStudentOrders();

        for (StudentOrder so : soList) {
            checkOneOrder(so);
        }
    }

    public List<StudentOrder> readStudentOrders() {
        List<StudentOrder> soList = new LinkedList<>();

        for (int i = 0; i < 5; i++) {
            StudentOrder so = SaveStudentOrder.buildStudentOrder(i);
            soList.add(so);
        }
        return soList;
    }

    public void checkOneOrder(StudentOrder so) {
        AnswerCityRegister cityAnswer = checkCityRegister(so);
//        AnswerWedding weddingAnswer = checkWedding(so);
//        AnswerChildren childAnswer = checkChildren(so);
//        AnswerStudent studentAnswer = checkStudent(so);
//        sendMail(so);
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
