package AE2.password;

import java.io.File;

public class PWGenTest {
    static final String FILEPATH = "C:\\data\\deutsch.txt";
    public static void main(String[] args) {
        File file = new File(FILEPATH);
        PasswordGenerator pwgen = new PasswordGenerator(FileOperations.readFile(file));
        for (int i = 0; i < 10; i++) {
            System.out.println(pwgen.generatePassword(16, 0.2f, 0.4f));
        }
    }
}
