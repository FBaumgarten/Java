package AE2.password;

public class PWGenTest {
    static final String FILEPATH = "C:\\data\\deutsch.txt";
    public static void main(String[] args) {
        PasswordGenerator pwgen = new PasswordGenerator(FileOperations.readFile(FILEPATH));
        for (int i = 0; i < 10; i++) {
            System.out.println(pwgen.generatePassword(16, 0.2f, 0.4f));
        }
    }
}
