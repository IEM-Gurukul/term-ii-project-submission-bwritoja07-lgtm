 class TrueFalseQuestion extends Question {
    String correctAnswer = "true";

    public void display() {
        System.out.println("Java is platform independent (true/false)");
    }

    public boolean checkAnswer(String answer) {
        return answer.equalsIgnoreCase(correctAnswer);
    }
}