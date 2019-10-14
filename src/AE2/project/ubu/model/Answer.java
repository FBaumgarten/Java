package AE2.project.ubu.model;

public class Answer {
    private int questionID;
    private String answer;

    public int getQuestionID() {
        return questionID;
    }

    public void setQuestionID(int questionID) {
        this.questionID = questionID;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public Answer(int questionID, String answer) {
        setQuestionID(questionID);
        setAnswer(answer);
    }
}
