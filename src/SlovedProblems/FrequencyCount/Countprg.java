package SlovedProblems.FrequencyCount;

public class Countprg {
    public static void main(String[] args) {

        String s = "aaabbaccdd";
       

        for (int i = 0; i < s.length(); i++) {
             int count = 0;
            if (s.charAt(i) == 'a') {
                count++;

            } else if (s.charAt(i) == 'b') {

                count++;
            }

        }

    }

}
