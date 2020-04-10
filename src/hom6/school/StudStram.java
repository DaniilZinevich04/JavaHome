package hom6.school;

public class StudStram extends Student {

    public StudStram(String fio) {
        super(fio);
    }

    @Override
    public double getAvg() {
        return getLearningSubject().stream()
                .filter(subject -> subject.getValue() !=null)
                .map(Subject::getValue)
                .mapToDouble(Double::doubleValue).average().getAsDouble();
    }

}
