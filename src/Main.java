import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int score = 0;

        List<Question> questions = new ArrayList<>();

        questions.add(QuestionFactory.getQuestion("MCQ"));
        questions.add(QuestionFactory.getQuestion("TF"));

        if (questions.isEmpty()) {
            System.out.println("No questions available.");
            return;
        }

        for (Question q : questions) {
            q.display();

            String ans;
            while (true) {
                System.out.print("Enter your answer: ");
                ans = sc.nextLine();

                if (ans.isEmpty()) {
                    System.out.println("Answer cannot be empty!");
                    continue;
                }
                break;
            }

            if (q.checkAnswer(ans)) {
                score++;
            }
        }

        System.out.println("Final Score: " + score);
    }
}