import java.util.ArrayList;
import java.util.Collections;

public class a2 {
    private ArrayList<String> questions;

    public a2() {
        questions = new ArrayList<>();
    }

    public void addQuestion(String question) {
        questions.add(question);
    }

    public void shuffleQuestions() {
        Collections.shuffle(questions);
    }

    public void displayQuestions() {
        for (String question : questions) {
            System.out.println(question);
        }
    }

    public static void main(String[] args) {
        a2 exam = new a2();
        exam.addQuestion("What is the capital of France?");
        exam.addQuestion("Explain polymorphism in Java.");
        exam.addQuestion("What is the difference between an interface and an abstract class?");
        exam.addQuestion("Describe the process of normalization in databases.");

        System.out.println("Questions before shuffling:");
        exam.displayQuestions();

        exam.shuffleQuestions();

        System.out.println("\nQuestions after shuffling:");
        exam.displayQuestions();
    }
}
