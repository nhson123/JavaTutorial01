package klassen.String;

/**
 * Package: klassen.String
 * Generated by: Hoang.Son.Nguyen
 * Generated at: 20.02.2018 2018
 */
public class StringRegex {
    public String[] stringRegexSplit(String text) {
        //String reg = ",";
        String[] res = text.split(",");
        return res;
    }

    public String stringBlanc(String text) {
        return text.replaceAll(" +", ""); // Attention alle Leerzeichen werden eliminiert
    }

    public String extendString(String origString, int newLength) {
        if (origString.length() < newLength) {
            StringBuilder origBuilder = new StringBuilder(origString);
            for (int i = origString.length(); i <newLength; i++){
                origBuilder.append(' ');
            }
            return origBuilder.toString();
        } else if (origString.length() == newLength) {
            return origString;
        } else
            System.out.println("die länge bereit zu kurz!");
            return null;
    }
}
