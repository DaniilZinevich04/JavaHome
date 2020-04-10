package hom6.school;

import java.util.ArrayList;
import java.util.List;

public class Student implements IStudent {
        private  String fio;
        private String schoolClass;
        private List<Subject> learningSubject = new ArrayList<>();

        public Student(String fio) {
            this.fio = fio;
            this.schoolClass=schoolClass;
        }

    @Override
        public String getFIO() {
        return fio;
        }

    public String setSchoolClass(String s) {
        return schoolClass;
    }

    public void addLearningSubject(Subject learningSubject)
    {
        this.learningSubject.add(learningSubject);
    }

    @Override
    public String getSchoolClass() {
        return schoolClass;

    }
    @Override
    public List<Subject> getLearningSubject() {
        return learningSubject;
    }

    @Override
        public double getAvg() {
            double result = 0;
            for (Subject subject : learningSubject) {
                result += subject.getValue();
            }
            return result / learningSubject.size();
        }


    }
