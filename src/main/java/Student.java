abstract class Student {
    protected String fullName;
    protected int course;
    protected double lastExamGrade;

    public Student(String fullName, int course, double lastExamGrade) {
        this.fullName = fullName;
        this.course = course;
        this.lastExamGrade = lastExamGrade;
    }

    public abstract void writeExam();
}


