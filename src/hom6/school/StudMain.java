package hom6.school;

public class StudMain {
    public static void main(String[] args) {

        StudStram student1 = new StudStram("Daiil Zinevich");
        student1.setSchoolClass("121");
        System.out.println("Имя : " + student1.getFIO());
        System.out.println("Класс : " + student1.getSchoolClass());

        student1.addLearningSubject(new Subject(new SubMath(),7.0));
        student1.addLearningSubject(new Subject(new SubBiology(),5.0));
        student1.addLearningSubject(new Subject(new SubChemistry(),6.0));
        student1.addLearningSubject(new Subject(new SubDrawing(),8.0));

        System.out.println(student1.getLearningSubject());
        System.out.println("Средняя оценка  : " + student1.getAvg());

        System.out.println();

        StudStram student2 = new StudStram("Maria Zinevich");
        student2.setSchoolClass("9");
        System.out.println("Имя  : " + student2.getFIO());
        System.out.println("Класс : " + student2.getSchoolClass());

        student2.addLearningSubject(new Subject(new SubMath(),5.0));
        student2.addLearningSubject(new Subject(new SubBiology(),4.0));
        student2.addLearningSubject(new Subject(new SubChemistry(),8.0));
        student2.addLearningSubject(new Subject(new SubDrawing(),9.0));

        System.out.println(student2.getLearningSubject());
        System.out.println("Средняя оценка : " + student2.getAvg());
    }
}

