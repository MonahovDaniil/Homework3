public class Main {
    public static void main(String[] args) {
        IUStudent iuStudent = new IUStudent("Иванов Андрей Макарьевич", 3, 4.7);
        MathStudent mathStudent = new MathStudent("Петров Алексей Дмитриевич", 1, 3.9);
        iuStudent.writeExam();
        mathStudent.writeExam();
    }
}