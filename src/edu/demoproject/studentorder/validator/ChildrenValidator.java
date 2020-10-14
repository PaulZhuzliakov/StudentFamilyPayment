package edu.demoproject.studentorder.validator;

import edu.demoproject.studentorder.domain.AnswerChildren;
import edu.demoproject.studentorder.domain.StudentOrder;

public class ChildrenValidator {
    public AnswerChildren checkChildren(StudentOrder so) {
        System.out.println("Children check is running");
        return new AnswerChildren();
    }
}
