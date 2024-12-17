class MathStudent extends Student{
    public MathStudent(String fullName, int course, double lastExamGrade) {
        super(fullName, course, lastExamGrade);
    }

    @Override
    public void writeExam() {
        System.out.println("Студент математики: " + fullName + " пишёт экзамен на курсе " + course + ". Оценка за последний экзамен: " + lastExamGrade + ".");
    }
}
