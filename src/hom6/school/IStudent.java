package hom6.school;

import java.util.List;

public interface IStudent extends IPeople {

        String getSchoolClass();
        List<Subject> getLearningSubject();
        double getAvg();


    }

