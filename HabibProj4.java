package ap;
import javax.swing.JOptionPane;

public class HabibProj4 {

    public static void main(String[] args) {
        System.out.println(iCJava("java java"));
        System.out.println(differentNeighbors("baboon"));
        System.out.println(reverse("roulette"));
        System.out.println(mirrorM("ruM"));
        System.out.println(mockMeme("!a,b,c d e,!f"));
        System.out.println(getHint("HAPPY", "HAPPY"));
        playGuessingGame("HAPPY");
    }

    public static boolean iCJava(String input) {
        //find length
        int len = input.length();
        int counter = 0;
        //loop around length of variable
        for (int i = 0; i <= len - 4; i++) {
            if (input.substring(i, i + 4).compareTo("java") == 0) { //see if substring.equals "java"
                counter++;
            }
        }
        if (counter % 2 == 0 && counter != 0) { //true if counter is even AND java exists in the string
            return true;
        } else {
            return false;
        }

    }

    public static boolean differentNeighbors(String input) {
        boolean answer = false;

        for (int i = 0; i < input.length() - 1; i++) {
            if (i == 0) {
                if (input.charAt(i) != input.charAt(i + 1)) {
                    answer = true;
                }
            } else if (i == input.length() - 1) {
                if (input.charAt(i) != input.charAt(i - 1)) {
                    answer = true;
                }
            } 
            else if (input.charAt(i) == input.charAt(i - 1) || input.charAt(i) == input.charAt(i + 1)) {
                answer = false;
            }
        }
        return answer;
    }
    
    public static String reverse(String input){
        String answer = "";
        
        for (int i = 0; i < input.length(); i++){
            char c = input.charAt(input.length()-(1+i));
            answer += c;
        }
        return answer;
    }
    
    public static String mirrorM(String input){
        int Mloc = input.indexOf("M");
        int len = input.length();
        String before = "";
        String next = "";
        
        if (Mloc == -1){ //M does not exist
            return input + ": No 'M' contained in String";
        }
        else{ // M exists
            if (len%2 == 1 && Mloc == len/2){ //middle of an odd string
                before = reverse(input.substring(0, Mloc));
                next = reverse(input.substring(Mloc+1));
                return next + "M" + before;
            }
            if (Mloc == 0){
                next = reverse(input.substring(Mloc+1));
                return "M" + next;
            }
            if (Mloc == input.length()-1){
                before = reverse(input.substring(0, input.length()-1));
                return before + "M";
            }
            if(Mloc < len/2){ //beginning of a string
                before = reverse(input.substring(0, Mloc));
                next = reverse(input.substring(Mloc+1, Mloc+before.length()+1));
                return next + "M" + before + input.substring(before.length()+next.length()+1);
            }
            if(Mloc > len/2){ //beginning of a string
                next = reverse(input.substring(Mloc+1));
                before = reverse(input.substring(next.length()-1, Mloc));
                return input.substring(0, next.length()-1)+next + "M" + before;
            }
        }
        return "";
    }
    
    public static String mockMeme(String phrase){
        String answer = "";
        for (int i = 0; i < phrase.length(); i++){
            Character c = phrase.charAt(i);
            if (Character.isLetter(c) && i%2 == 0){
                answer += Character.toUpperCase(c);
            }
            else if (Character.isLetter(c) && i%2 == 1){
                answer += Character.toLowerCase(c);
            }
            else if (!Character.isLetter(c)){
                answer += "";
                if (c == 32){ //if c is a blank cpace (32)
                answer += " ";
                }
            }
        }
        
        return answer;
    }
    
    public static String getHint(String hiddenWord, String guess){
        String answer = "";
        
        for (int i = 0; i < hiddenWord.length(); i++){
            if (hiddenWord.charAt(i) == guess.charAt(i)){
                answer += guess.charAt(i);
            }
            if (hiddenWord.charAt(i)!= guess.charAt(i) && hiddenWord.indexOf(guess.charAt(i)) > -1){
                answer += "+";
            }
            if (hiddenWord.charAt(i)!= guess.charAt(i) && hiddenWord.indexOf(guess.charAt(i)) == -1){
                answer += "*";
            }
        }
        return answer;
    }
    
    public static void playGuessingGame(String hiddenWord){
        int tries = 10;
        int counter = 0;
        String hint = "";
        String guess = JOptionPane.showInputDialog("Guess the Word!\nWord length: " + hiddenWord.length() + "\nTries Remaining: " + tries);
        
        for (int i = 9; i > 0; i--){
            counter++;
            if(guess.equals(hiddenWord)){
                JOptionPane.showMessageDialog(null, "Correct! \n you have guessed " + counter + " time(s)!");
                break;
            }
            else if(!guess.equals(hiddenWord)){
                tries--;
                hint = getHint(hiddenWord, guess);
                guess = JOptionPane.showInputDialog("Try again!\nYou have " + tries + " remaining\n Hint: " + hint);
            }
        }
        JOptionPane.showMessageDialog(null, "You ran out of tries! :( \nThe word was: " + hiddenWord);
    }
}
