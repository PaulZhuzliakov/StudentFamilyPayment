package edu.demoproject.studentorder.validator;

import edu.demoproject.studentorder.domain.AnswerWedding;
import edu.demoproject.studentorder.domain.StudentOrder;

public class WeddingValidator {
    public AnswerWedding checkWedding(StudentOrder so) {
        System.out.println("Wedding check is running");
        return new AnswerWedding();
    }
}
