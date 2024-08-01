/**
 * The Question class represents a single question in a quiz.
 */
public class Question {
    private int id;
    private String question;
    private String opt1;
    private String opt2;
    private String opt3;
    private String opt4;
    private String answer;

    /**
     * Constructs a Question object with the specified id, question, options, and
     * answer.
     *
     * @param id       the id of the question
     * @param question the question text
     * @param opt1     option 1
     * @param opt2     option 2
     * @param opt3     option 3
     * @param opt4     option 4
     * @param answer   the correct answer
     */
    public Question(int id, String question, String opt1, String opt2, String opt3, String opt4, String answer) {
        this.id = id;
        this.question = question;
        this.opt1 = opt1;
        this.opt2 = opt2;
        this.opt3 = opt3;
        this.opt4 = opt4;
        this.answer = answer;
    }

    /**
     * Returns the id of the question.
     *
     * @return the id of the question
     */
    public int getId() {
        return id;
    }

    /**
     * Sets the id of the question.
     *
     * @param id the id of the question
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Returns the question text.
     *
     * @return the question text
     */
    public String getQuestion() {
        return question;
    }

    /**
     * Sets the question text.
     *
     * @param question the question text
     */
    public void setQuestion(String question) {
        this.question = question;
    }

    /**
     * Returns option 1.
     *
     * @return option 1
     */
    public String getOpt1() {
        return opt1;
    }

    /**
     * Sets option 1.
     *
     * @param opt1 option 1
     */
    public void setOpt1(String opt1) {
        this.opt1 = opt1;
    }

    /**
     * Returns option 2.
     *
     * @return option 2
     */
    public String getOpt2() {
        return opt2;
    }

    /**
     * Sets option 2.
     *
     * @param opt2 option 2
     */
    public void setOpt2(String opt2) {
        this.opt2 = opt2;
    }

    /**
     * Returns option 3.
     *
     * @return option 3
     */
    public String getOpt3() {
        return opt3;
    }

    /**
     * Sets option 3.
     *
     * @param opt3 option 3
     */
    public void setOpt3(String opt3) {
        this.opt3 = opt3;
    }

    /**
     * Returns option 4.
     *
     * @return option 4
     */
    public String getOpt4() {
        return opt4;
    }

    /**
     * Sets option 4.
     *
     * @param opt4 option 4
     */
    public void setOpt4(String opt4) {
        this.opt4 = opt4;
    }

    /**
     * Returns the correct answer.
     *
     * @return the correct answer
     */
    public String getAnswer() {
        return answer;
    }

    /**
     * Sets the correct answer.
     *
     * @param answer the correct answer
     */
    public void setAnswer(String answer) {
        this.answer = answer;
    }

}
