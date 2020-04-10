package hom6.school;

public class Subject {
    private  ISubject subject;
    private  Double value;

    public Subject(ISubject subject, Double value) {
        this.subject = subject;
        this.value = value;
    }

    @Override
    public String toString() {
        return subject + " " + value;
    }

    public ISubject getSubject() {
        return subject;
    }

    public Double getValue() {
        return value;
    }

    public void setValue(Double value) {
        this.value = value;
    }
}
