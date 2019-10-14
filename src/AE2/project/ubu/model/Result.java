package AE2.project.ubu.model;

import java.io.File;
import java.util.ArrayList;

public class Result {
    private User user;
    private String date;
    private File testFile;
    private ArrayList<Answer> answers;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public File getTestFile() {
        return testFile;
    }

    public void setTestFile(File testFile) {
        this.testFile = testFile;
    }

    public ArrayList<Answer> getAnswers() {
        return answers;
    }

    public void setAnswers(ArrayList<Answer> answers) {
        this.answers = answers;
    }

    public Result(User user, String date, File testFile, ArrayList<Answer> answers) {
        setUser(user);
        setDate(date);
        setTestFile(testFile);
        setAnswers(answers);
    }
}
