package gr.aueb.cf.ch20;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ZeroLengthAssertion {

    public static void main(String[] args) {
        String s = "BCDeX";

        Pattern pattern = Pattern.compile("^(?=.*?[a-z]).{4,}$");  // ?= Assert within ()
        Matcher matcher = pattern.matcher(s);

        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}
