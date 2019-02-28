// import java.lang.String;
public class strClasses2 {
/**    public static void main(String[] args) {
        StringBuffer strn = new StringBuffer("The cheetah is a large cat of the subfamily Felinae that occurs in Southern, North and East Africa, and a few localities in Iran. The species is IUCN Red Listed as vulnerable, as it suffered a substantial decline in its historic range in the 20th century due to habitat loss, poaching, illegal pet trade, and conflict with humans. By 2016, the global cheetah population has been estimated at approximately 7,100 individuals in the wild. Several African countries have taken steps to improve cheetah conservation measures.")
        int wordNumber = 1;
        for (int i; i< strn.length(); i++) {
            if (strn.charAt(i) == ' ') {
                wordNumber += 1;
            }
        }
        class letters {
            private StringBuffer wholeText;
            private char[] letterArray;
            private char[] punctsArray;

            public letters(StringBuffer wholeText) {
                this.letterArray = letterArray;
                this.punctsArray = punctsArray;
                this.wholeText = wholeText;
                int letterArraylength = 0;
                for (int i = 0; i < this.wholeText.length(); i++) {
                    if (this.wholeText.charAt(i) == '_') {
                        this.wholeText.setCharAt(i, ' ');
                    }
                    if (this.wholeText.charAt(i) == ' ') {
                        while (this.wholeText.charAt(i + 1) == ' ' || this.wholeText.charAt(i + 1) == '_') {
                            this.wholeText.deleteCharAt(i + 1);
                        }
                    }
                    letterArraylength += 1;
                }
                char[] letterArray = new char[letterArraylength];
                for (int i = 0; i < letterArraylength; i++) {
                    if ((this.wholeText.charAt(i) >= 'a' && this.wholeText.charAt(i) <= 'z') || (this.wholeText.charAt(i) >= 'A' && this.wholeText.charAt(i) <= 'Z') || (this.wholeText.charAt(i) >= '0') && (this.wholeText.charAt(i) <= '9')) {
                        letterArray[i] = this.wholeText.charAt(i);
                    } else {
                        punctsArray[i] = this.wholeText.charAt(i);
                    }
                }
            }

            public char[] getletterArray() {
                return this.letterArray;
            }

            public char[] getpunctsArray() {
                return this.punctsArray;
            }
        }
        letters FirstLetters = new letters(strn);

        class words {
            private char[][] wordFromLetters;

            public words(char[] AllLetters) {
                if (AllLetters[0] == 0) {
                    wordFromLetters[0][0] = AllLetters[0];
                    wordNumber+=1;
                } else {
                    for (int i = 0; i < wordNumber; i++) {
                        for (int j = 0; j < AllLetters.length; j++) {
                            if (AllLetters[j] == 0) {
                                break;
                            }
                            wordFromLetters[i][j] = AllLetters[j];
                        }
                    }
                }
            }

            public char[][] getwordFromLetters() { return wordFromLetters; }
        }
        words[] textByWords = new words[wordNumber];
        for(int i;i<wordNumber;i++){

        }
    }
    */
}
