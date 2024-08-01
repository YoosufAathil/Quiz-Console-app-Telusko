import java.util.Scanner;

public class QuestionService {
    Question[] questions = new Question[5];
    String[] selection = new String[5];

    public QuestionService() {
        questions[0] = new Question(1, "What is 1 + 1?", "1", "2", "3", "4", "2");
        questions[1] = new Question(2, "What is 2 + 2?", "1", "2", "3", "4", "4");
        questions[2] = new Question(3, "What is 3 + 3?", "3", "4", "5", "6", "6");
        questions[3] = new Question(4, "What is 4 + 4?", "6", "7", "8", "9", "8");
        questions[4] = new Question(5, "What is 5 + 5?", "8", "9", "10", "11", "10");
    }

    public void playQuiz() {
        int i = 0;
        for (Question q : questions) {
            System.out.println("Question No : " + q.getId());
            System.out.println(q.getQuestion());
            System.out.println("1. " + q.getOpt1());
            System.out.println("2. " + q.getOpt2());
            System.out.println("3. " + q.getOpt3());
            System.out.println("4. " + q.getOpt4());
            Scanner sc = new Scanner(System.in);
            selection[i] = sc.nextLine();
            i++;

        }
        for (String s : selection) {
            System.out.println(s);
        }
    }

    public void printScore() {
        int score = 0;
        for (int i = 0; i < questions.length; i++) {

            Question que = questions[i];
            String actualAnswer = que.getAnswer();

            String userAnswer = selection[i];

            if (actualAnswer.equals(userAnswer)) {
                score++;
            }

        }
        System.out.println("Your score is : " + score);
    }
}
