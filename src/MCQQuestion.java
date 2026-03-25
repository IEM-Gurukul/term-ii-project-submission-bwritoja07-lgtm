class MCQQuestion extends Question {
    String correctAnswer = "A";

    public void display() {
        System.out.println("What is 2 + 2?");
        System.out.println("A. 4  B. 5  C. 6");
    }

    public boolean checkAnswer(String answer) {
        return answer.equalsIgnoreCase(correctAnswer);
    }
}