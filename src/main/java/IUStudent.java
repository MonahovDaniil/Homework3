class IUStudent extends Student {
    public IUStudent(String fullName, int course, double lastExamGrade) {
        super(fullName, course, lastExamGrade);
    }

    @Override
    public void writeExam() {
        System.out.println("Студент ИУ: " + fullName + " пишёт экзамен на курсе " + course + ". Оценка за последний экзамен: " + lastExamGrade + ".");
    }
}
