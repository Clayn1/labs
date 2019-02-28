package lab3;
import java.lang.String;
/**
 * 7105
 * C3=1 - StringBuffer
 * C17=16 - В кожному слові заданого тексту, видалити всі попередні входження останньої літери цього слова.
 */
public class strs {
    public static void main(String[] args) {
        StringBuffer general = new StringBuffer();
        StringBuffer strn = new StringBuffer("gggggggggg qwerttt fasdff hgakaak ");
        int substringStart = 0;
        for (int i = 0; i < strn.length(); i++) {
            if ((strn.charAt(i) == ' ')||i == strn.length()-1){
                String substrn = strn.substring(substringStart,i);
                StringBuffer substrn1 = new StringBuffer(substrn);
                for (int i1 = 0; i1 < substrn1.length()-1; i1++){
                    if (substrn1.charAt(i1)==substrn1.charAt(substrn1.length()-1)){
                        substrn1.deleteCharAt(i1);
                        i1--;
                    }
                }
                general.append(substrn1);
                substringStart=i;
            }
            }
        System.out.println(general);
        }
}
