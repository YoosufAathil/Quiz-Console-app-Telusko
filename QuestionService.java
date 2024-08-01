public class QuestionService {
    Question[] questions = new Question[5];

    public QuestionService() {
        questions[0] = new Question(1, "What is 1 + 1?", "1", "2", "3", "4", "2");
        questions[1] = new Question(2, "What is 2 + 2?", "1", "2", "3", "4", "4");
        questions[2] = new Question(3, "What is 3 + 3?", "3", "4", "5", "6", "6");
        questions[3] = new Question(4, "What is 4 + 4?", "6", "7", "8", "9", "8");
        questions[4] = new Question(5, "What is 5 + 5?", "8", "9", "10", "11", "10");
    }

    public void displayQuestions() {
        for (Question q : questions) {
            System.out.println(q);

        }
    }
}
