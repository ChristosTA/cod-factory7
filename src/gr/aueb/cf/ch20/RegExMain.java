package gr.aueb.cf.ch20;

public class RegExMain {

    public static void main(String[] args) {
        String s = "Red";
        String s1 = "green";
        String s2 = "Getting";
        String s3 = " 9";
        String s4 = "info.dada@email.com";
        String s5 = "27/03/1997";
        String s6 = "Athens Uni          Of    Eco and      Bus";
//        System.out.println(isRed(s));
//        System.out.println();
//        System.out.println(isrRedOrgGreen(s1));
//        System.out.println();
//        System.out.println(beginsWithOneUpperCaseAndEndsIng(s2));
//        System.out.println(isOneLetterEndsIng(s2));
//        System.out.println();
//        System.out.println(whitespaceDigit(s3));
//        System.out.println();
//        System.out.println(isEmail(s4));
//        System.out.println();
//        System.out.println(isDate(s5));
//
//        String[] tokens = doSplit(s6);
//        for (String token : tokens) {
//            System.out.println(token);
//        }
        System.out.println(doReplace(s6));


    }

    /**
     * Ελεγχει (matches) αν το input string
     * ειναι το "Red"
     * @param s
     * @return
     */
    public static boolean isRed(String s) {
        return s.matches("Red");
    }

    public static boolean isRedOrGreen(String s) {
        return s.matches("Red|Green");
    }

    public static boolean isrRedOrgGreen(String s) {
        return s.matches("[rR]ed|[gG]reen");
    }

    public static boolean beginsWithOneUpperCaseAndEndsIng (String s) {
        return s.matches("[A-Z]ing$");
    }

    public static boolean isOneLetterEndsIng(String s) {
        return s.matches("[A-Za-z]ing$");
    }

    public static boolean whitespaceDigit(String s) {
        return s.matches("^\\s\\d");
    }

    public static boolean anySymbolDigit(String s){
        return s.matches(".\\d");
    }
    public static boolean isEmail(String s) {
        return s.matches("\\w*\\.?\\w+@\\w+\\.[a-z]{2,4}");
    }

    public static boolean isDate(String s) {
        return s.matches("\\d{2}/\\d{2}/\\d{4}");
    }

    public static String[] doSplit(String s) {
        return s.split("\\s+");
    }

    public static String doReplace(String s){
        return s.replaceAll("\\s+" , " ");
    }

    public static String doReplaceBackReferences(String s) {
        return s.replaceAll("(.+)\\s+(.+)", "$2,$1");
    }
}
