package AE2.password;

import java.util.ArrayList;
import java.util.Random;

public class PasswordGenerator {
    private ArrayList<String> wordlist = new ArrayList<>();


    public ArrayList<String> getWordlist() {
        return wordlist;
    }

    public void setWordlist(ArrayList<String> wordlist) {
        this.wordlist = wordlist;
    }

    public PasswordGenerator(ArrayList<String> stringArrayList){
        setWordlist(stringArrayList);
    }

    String leetify(String string, double percent){
        int r = (int) (string.length() * percent);
        boolean[] toLeetArray = new boolean[string.length()];
        Random random = new Random();
        int x = random.nextInt(string.length());
        for (int j = 0; j < r; j++) {
            while (toLeetArray[x]) x = random.nextInt(string.length());
            toLeetArray[x] = true;
        }
        char[] result =string.toCharArray();
        for (int j = 0; j < string.length(); j++) {
            if (toLeetArray[j]){
                switch (result[j]){
                    case 'a':
                        result[j] = '4';
                        break;
                    case 'b':
                        result[j] = '8';
                        break;
                    case 'c':
                        result[j] = '(';
                        break;
                    case 'e':
                        result[j] = '3';
                        break;
                    case 'g':
                        result[j] = '6';
                        break;
                    case 'h':
                        result[j] = '#';
                        break;
                    case 'i':
                        result[j] = '!';
                        break;
                    case 'l':
                        result[j] = '1';
                        break;
                    case 'o':
                        result[j] = '0';
                        break;
                    case 'p':
                        result[j] = '9';
                        break;
                    case 'r':
                        result[j] = '2';
                        break;
                    case 's':
                        result[j] = '5';
                        break;
                    case 't':
                        result[j] = '7';
                        break;
                    default:
                        break;
                }
            }
        }

        return new String(result);
    }

    String capitalize(String string, double percent){
        int r = (int) (string.length() * percent);
        boolean[] toCapitalizeArray = new boolean[string.length()];
        Random random = new Random();
        int x = random.nextInt(string.length());
        for (int j = 0; j < r; j++) {
            while (toCapitalizeArray[x]) x = random.nextInt(string.length());
            toCapitalizeArray[x] = true;
        }
        char[] result =string.toCharArray();
        for (int j = 0; j < string.length(); j++) {
            if (toCapitalizeArray[j]){
                result[j] = Character.toUpperCase(result[j]);
            }
        }

        return new String(result);
    }

    public String generatePassword(int length, double percent){
        return leetify(generatePassword(length), percent);
    }

    public String generatePassword(int lenght, double leetifyPercent, double capitalizePercent){
        return capitalize(leetify(generatePassword(lenght),leetifyPercent),capitalizePercent);
    }

    public String generatePassword(int lenght){
        StringBuilder result = new StringBuilder();
        ArrayList<String> temp = new ArrayList<>();
        int tempLength = 0;

        Random random = new Random();
        while (tempLength < lenght ){
            String word = wordlist.get(random.nextInt(wordlist.size()));
            if (word.length() + tempLength < lenght) {
                temp.add(word);
                tempLength += word.length();
            } else {
                temp.add(Integer.toString(random.nextInt(10)));
                tempLength++;
            }
        }
        while (temp.size() > 0){
            int i = random.nextInt(temp.size());
            result.append(temp.get(i));
            temp.remove(i);
        }
        return result.toString();
    }
}
