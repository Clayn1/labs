import java.lang.String;
public class strClasses {
    public static void main(String[] args) {
        /**StringBuffer strn = new StringBuffer("The cheetah is a large cat of the subfamily Felinae that occurs in Southern, North and East Africa, and a few localities in Iran. The species is IUCN Red Listed as vulnerable, as it suffered a substantial decline in its historic range in the 20th century due to habitat loss, poaching, illegal pet trade, and conflict with humans. By 2016, the global cheetah population has been estimated at approximately 7,100 individuals in the wild. Several African countries have taken steps to improve cheetah conservation measures.");

        class letters{
            private StringBuffer wholeText;
            private char[] letterArray;
            private char[] punctsArray;
            public letters(StringBuffer wholeText){
                this.wholeText=wholeText;
                int letterArraylength=0;
                for (int i=0; i<this.wholeText.length();i++){
                    if(this.wholeText.charAt(i)=='_'){
                        this.wholeText.setCharAt(i,' ');
                    }
                    if (this.wholeText.charAt(i)==' '){
                        while(this.wholeText.charAt(i+1)==' '||this.wholeText.charAt(i+1)=='_'){
                            this.wholeText.deleteCharAt(i+1);
                        }
                    }
                    letterArraylength+=1;
                }
                char[] letterArray = new char[letterArraylength];
                for (int i=0; i<letterArraylength; i++) {
                    if ((this.wholeText.charAt(i)>='a'&&this.wholeText.charAt(i)<='z')||(this.wholeText.charAt(i)>='A'&&this.wholeText.charAt(i)<='Z')) {
                        letterArray[i] = this.wholeText.charAt(i);
                    }
                    else{
                        punctsArray[i] = this.wholeText.charAt(i);
                    }
                }
            }
            public char getletterArray{
                return letterArray;
            }
            public char getpunctsArray{
                return punctsArray;
            }
        }
        class words{
            private char[] wordFromLetters;
            public words(char[] wordByLetters){
                for(int i=0; i<wordByLetters.length; i++){
                    wordFromLetters[i]=wordByLetters[i];
                    if (wordByLetters[i]<'a'||wordByLetters[i]>'z'&&wordByLetters[i]<'A'||wordByLetters[i]>'Z'){
                        break;
                    }
                }
            }
            public char getwordFromLetters{
                return wordFromLetters;
            }
        }
        class punctuation{
            private char[] addingPuncts;
            public punctuation(char[] wordWithPuncts){
                for(int i=0; i<wordWithPuncts.length; i++){
                    addingPuncts[i]=wordWithPuncts;
                    for(int j=0; j<.getletterArray(); j++){
                        if (.getletterArray() = ''){
                            addingPuncts[i+1]=.getletterArray[j]
                        }
                    }
                    addingPuncts[i]=wordWithPuncts[i];
                }
            }
            public char getaddingPuncts{
                return addingPuncts;
            }
        }
        class sentence{

        }
        class text{

        }
        words[] dividedWords = new words[];
        for(int i=0;i<)
        students[0] = new student("Vasya", "Tupin", 2, 95, "PK-71");*/
    }
}
