package lab3;
import java.lang.String;
public class polin {
    public static void main(String[] args) {

        //StringBuilder strn = new StringBuilder("ЕПГРЕЕН АРРА нМОКнЕТ, ОКСаНА С КОТЕНКОМ КВНАШЩГ ЕРРЕ.");
        StringBuilder strn = new StringBuilder("Ф ф Ф ф ");

        Integer max = 0;

        for (int i1 = 0; i1 < strn.length(); i1++) {
            if (strn.charAt(i1) == ',' || strn.charAt(i1) == '.' || strn.charAt(i1) == '!' || strn.charAt(i1) == '?' || strn.charAt(i1) == '_'){
                strn.setCharAt(i1,' ');
            }
        }


        for (int i = 0; i < strn.length(); i++) {
                if (strn.charAt(i) == ' ') {
                    for (int j = i; j < strn.length(); j++) {
                        if ((strn.charAt(j) == ' ') || (j == strn.length()-1) && (i != j)) {
                            StringBuilder substrn1 = new StringBuilder(strn.substring(i, j));
                            for (int k = 0; k < substrn1.length(); k++) {
                                if (substrn1.charAt(k) == ' ') {
                                    substrn1.deleteCharAt(k);
                                    k--;
                                }
                            }
                            Integer len = substrn1.length();
                            StringBuilder reversed = new StringBuilder();
                            reversed.setLength(len);
                            for (int k = 0; k < substrn1.length(); k++) {
                                reversed.setCharAt(len - k - 1, substrn1.charAt(k));
                            }
                            if (reversed.toString().equalsIgnoreCase(substrn1.toString())) {
                                    if (max < len) {
                                        max = len;
                                }
                            }


                        }
                    }
                }
            }
            for (int i = 0; i < strn.length(); i++) {
                if ((strn.charAt(i) == ' ') || (i == 0)) {
                    for (int j = i; j < strn.length(); j++) {
                        if (((strn.charAt(j) == ' ') || (j == strn.length()-1) && (i != j))) {
                            StringBuilder substrn1 = new StringBuilder(strn.substring(i, j));
                            for (int k = 0; k < substrn1.length(); k++) {
                                if (substrn1.charAt(k) == ' ') {
                                    substrn1.deleteCharAt(k);
                                    k--;
                                }
                            }
                            Integer len = substrn1.length();
                            StringBuilder reversed = new StringBuilder();
                            reversed.setLength(len);
                            for (int k = 0; k < substrn1.length(); k++) {
                                reversed.setCharAt(len - k - 1, substrn1.charAt(k));
                            }
                            if (reversed.toString().equalsIgnoreCase(substrn1.toString()) && len.equals(max)) {
                                System.out.println(strn.substring(i,j));
                            }
                        }
                    }
                }
            }
        }
    }