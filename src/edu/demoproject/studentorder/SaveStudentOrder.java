package edu.demoproject.studentorder;

import edu.demoproject.studentorder.domain.Adult;
import edu.demoproject.studentorder.domain.StudentOrder;

public class SaveStudentOrder {
    public static void main(String[] args) {
        buildStudentOrder(10);
//        StudentOrder so = new StudentOrder();
//        long ans = saveStudentOrder(so);
//        System.out.println(ans);
    }

    static long saveStudentOrder(StudentOrder studentOrder) {
        long answer = 199;
        System.out.print("save student order ");
        return answer;
    }

    static StudentOrder buildStudentOrder(long id) {
        StudentOrder so = new StudentOrder();
        so.setStudentOrderId(id);
        StudentOrder so1 = so;
        printStudentOrder(so1);
        return so;
    }

    static void printStudentOrder(StudentOrder stOr) {
        System.out.println(stOr.getStudentOrderId());
    }
}
