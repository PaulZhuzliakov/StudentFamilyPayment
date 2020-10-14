package edu.demoproject.studentorder.validator;

import edu.demoproject.studentorder.domain.AnswerStudent;
import edu.demoproject.studentorder.domain.StudentOrder;

public class StudentValidator {
    public AnswerStudent checkStudent(StudentOrder so) {
        System.out.println("Student check is running");
        return new AnswerStudent();
    }
}
