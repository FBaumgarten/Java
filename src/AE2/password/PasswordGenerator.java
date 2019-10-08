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
