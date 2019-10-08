package AE2.password;

public class PWGenTest {
    public static void main(String[] args) {
        PasswordGenerator pwgen = new PasswordGenerator(FileOperations.readFile("C:\\data\\lewdlist.txt"));
        for (int i = 0; i < 10; i++) {
            System.out.println(pwgen.generatePassword(20));
        }
    }
}
