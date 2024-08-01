/**
 * The Main class is the entry point of the Quiz console application.
 * It initializes the QuestionService, plays the quiz, and prints the score.
 */
public class Main {
    public static void main(String[] args) {
        QuestionService service = new QuestionService();
        service.playQuiz();
        service.printScore();
    }
}