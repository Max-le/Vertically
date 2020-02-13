

public class Vertically {


    private String findLongestWord(String[] words){
        String longestWords = "";
        for (String w : words){
            if( w.length() > longestWords.length()) longestWords = w;
        }
        return longestWords;
    }

    public String orientationVertical(String s){

        String[] words = s.split(" +");
        int greatestWordLength = findLongestWord(words).length();

        StringBuilder result = new StringBuilder();
        for (int i = 0; i < greatestWordLength; i++) {
            StringBuilder line = new StringBuilder();
            for (String word : words) {
                try {
                    line.append(word.charAt(i));
                } catch (IndexOutOfBoundsException e) {
                    line.append(" ");
                }
            }
            result.append(line).append("\n");
        }

        //Enlever le dernier retour ligne
        result.deleteCharAt(result.length()-1);

        return result.toString();
    }
}
