package AE2.project.ubu.model;

public class Question {
    private int id;
    private String qtext;
    private String solution;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getQtext() {
        return qtext;
    }

    public void setQtext(String qtext) {
        this.qtext = qtext;
    }

    public String getSolution() {
        return solution;
    }

    public void setSolution(String solution) {
        this.solution = solution;
    }

    public Question(int id, String qtext, String solution) {
        setId(id);
        setQtext(qtext);
        setSolution(solution);
    }
}


