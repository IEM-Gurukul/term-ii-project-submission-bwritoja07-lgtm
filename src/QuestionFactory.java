class QuestionFactory {
    public static Question getQuestion(String type) {
        if (type.equalsIgnoreCase("MCQ")) {
            return new MCQQuestion();
        } 
        else if (type.equalsIgnoreCase("TF")) {
            return new TrueFalseQuestion();
        } 
        else {
            throw new IllegalArgumentException("Invalid question type");
        }
    }
}