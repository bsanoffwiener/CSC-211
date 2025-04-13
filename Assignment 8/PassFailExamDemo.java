import javax.swing.JOptionPane;

public class PassFailExamDemo {
    public static void main(String[] args) {
        String question;
        int questions; // Number of questions
        int missed; // Number of questions missed
        double minPassing; // Minimum passing score
        // Get the number of questions on the exam.
        question = JOptionPane.showInputDialog("How many questions are on the exam?");
        questions = Integer.parseInt(question);
        // Get the number of questions missed.
        question = JOptionPane.showInputDialog("How many questions did the student miss?");
        missed = Integer.parseInt(question);
        // Get the minimum passing score.
        question = JOptionPane.showInputDialog("What is the minimum passing score?");
        minPassing = Double.parseDouble(question);
        // Create a PassFailExam object.
        PassFailExam exam = new PassFailExam(questions, missed, minPassing);

        String message = String.format(
                "Each question counts %.2f points.\n" +
                        "The exam score is %.2f\n" +
                        "The exam grade is %s",
                exam.getPointsEach(), exam.getScore(), exam.getGrade());

        JOptionPane.showMessageDialog(null, message);

        System.exit(0);
    }
}