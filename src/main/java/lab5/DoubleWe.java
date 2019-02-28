package lab5;
import java.util.Arrays;

public class DoubleWe {
    public static void main(String[] args) {
        String strn = "Abcd      adadada, opqrs.\n      New lineeee! Opa hope its  eeeee  not a new line.";
        Text text = new Text(strn);
        System.out.println(text);
    }
}
class TextMember {
}
class ParagraphMember {
}
class SentenceMember {
}
class WordMember {
}
class Letter extends WordMember {
    private char letterA;

    @Override
    public boolean equals(Object object){
        if (object instanceof Letter){
            Letter letter = (Letter) object;
            if(letterA == letter.letterA){
                return true;
            }
        }
        return false;
    }

    public Letter(char letterString) {
        letterA = letterString;
    }

    @Override
    public String toString() {
        return ""+letterA;
    }
}
class Words extends SentenceMember {
    private WordMember[] WordMembers;
    @Override
    public String toString() {
        String result = "";
        for (int i = 0; i < WordMembers.length; i++) {
            if (WordMembers[i]!=null) {
                result += WordMembers[i].toString();
            }
        }
        return result;
    }
    public Words(String wordString) {
        WordMembers = new WordMember[wordString.length()];
        for (int i = 0; i < wordString.length(); i++) {
            WordMembers[i] = new Letter(wordString.charAt(i));
        }
        for (int i = 0; i < WordMembers.length - 1; i++) {
            if (WordMembers[i].equals(WordMembers[WordMembers.length - 1])) {
                WordMembers[i] = null;
            }
        }
    }
}
class Sentences extends ParagraphMember {
    private SentenceMember[] SentenceMembers;
    @Override
    public String toString() {
        String result = "";
        for (int i = 0; i < SentenceMembers.length; i++) {
            if (SentenceMembers[i] != null) {
                result += SentenceMembers[i].toString();
            }

        }
        return result;
    }
    public Sentences(String senString) {
        int a = 0;
        for (int i = 0; i < senString.length(); i++) {
            if (senString.charAt(i) < 'a' || senString.charAt(i) > 'Z' || senString.charAt(i) > 'z' && senString.charAt(i) < 'A') {
                a += 1;
            }
        }
        String[] SplitByWords = senString.split("(?=, |\\+|_| )");     //Надо будет в SM и знаки впихнуть
        SentenceMembers = new SentenceMember[SplitByWords.length + a];
        char[] SentenceMembersPunct = new char[SplitByWords.length + a];
        for (int i = 0; i < SplitByWords.length + a; i++) {
            if (i < SplitByWords.length) {
                if (senString.charAt(i) < 'a' || senString.charAt(i) > 'Z' || senString.charAt(i) > 'z' && senString.charAt(i) < 'A') {
                    SentenceMembersPunct[i] = senString.charAt(i);
                }
            }
        }
        for (int i = 0; i < SplitByWords.length; i++) {
            SentenceMembers[i] = new Words(SplitByWords[i]);
        }
    }
}
class Paragraphs extends TextMember {
    private ParagraphMember[] ParagraphMembers;
    @Override
    public String toString() {
        String result = "";
        for (int i = 0; i < ParagraphMembers.length; i++) {
            result+=ParagraphMembers[i].toString();
        }
        return result;
    }
    public Paragraphs(String parString) {
        String[] SplitBySentence = parString.split("(?=\\.|!|\\?)");
        ParagraphMembers = new ParagraphMember[SplitBySentence.length];
        for (int i = 0; i < SplitBySentence.length; i++) {
            ParagraphMembers[i] = new Sentences(SplitBySentence[i]);
        }
    }
}
class Text {
    private TextMember[] TextMembers;

    @Override
    public String toString() {
        String result = "";
        for (int i = 0; i < TextMembers.length; i++) {
            result+=TextMembers[i].toString()+'\n';
        }
        return result;
    }

    public Text(String textString) {
        String[] SplitByParagraphs = textString.split("\n");
        TextMembers = new TextMember[SplitByParagraphs.length];
        for (int i = 0; i < SplitByParagraphs.length; i++) {
            TextMembers[i] = new Paragraphs(SplitByParagraphs[i]);
        }
    }
}