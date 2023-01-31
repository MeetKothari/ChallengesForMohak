public class cipherBase {

   private String inputString;
    public cipherBase() {
        String inputString = "";
    }

    public cipherBase(String newinputString){
        setString(newinputString);
    }
    public void setString(String newinputString){
        this.inputString = newinputString;
    }

    public String getString(){
        return this.inputString;
    }

    // there's a problem in this method
    public StringBuilder caesarCipher(){
        // int inputLength = inputString.length();
        int offset = 3;
        StringBuilder result = new StringBuilder();
        for (char character : inputString.toCharArray()) {
            if (character != ' ') {
                int originalAlphabetPosition = character - 'a';
                int newAlphabetPosition = (originalAlphabetPosition + offset) % 26;
                char newCharacter = (char) ('a' + newAlphabetPosition);
                result.append(newCharacter);
            } else {
                break;
            }
        }
        return result;
    }

    public Boolean isCaesarCorrect(StringBuilder result){
        String desiredOutput = "Whvw";
        String newResult = result.toString();
        if (newResult.equals(desiredOutput)){
            return true;
        }
        else {
            return false;
        }
    }

    @Override
    public String toString() {
        return "String is: " + inputString;
    }
}
