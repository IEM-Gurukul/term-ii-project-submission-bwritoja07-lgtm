import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Added scoring logic
        Scanner sc = new Scanner(System.in);
        int score = 0;

        Question q1 = QuestionFactory.getQuestion("MCQ");
        q1.display();

        String ans1;
        while (true) {
            System.out.print("Enter your answer: ");
            ans1 = sc.nextLine();

            if (ans1.isEmpty()) {
                System.out.println("Answer cannot be empty!");
                continue;
            }
            break;
        }

        if (q1.checkAnswer(ans1)) {
            score++;
        }

        Question q2 = QuestionFactory.getQuestion("TF");
        q2.display();

        String ans2;
        while (true) {
            System.out.print("Enter your answer: ");
            ans2 = sc.nextLine();

            if (ans2.isEmpty()) {
                System.out.println("Answer cannot be empty!");
                continue;
            }
            break;
        }

        if (q2.checkAnswer(ans2)) {
            score++;
        }

        System.out.println("Final score: " + score);
    }
}