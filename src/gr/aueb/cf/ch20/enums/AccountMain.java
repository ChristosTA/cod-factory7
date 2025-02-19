package gr.aueb.cf.ch20.enums;

public class AccountMain {

    public static void main(String[] args) {
//        AccountType accountType = AccountType.CURRENT;
//
//        // enum --> String
//        String strAccountType = accountType.name();
//        System.out.println(strAccountType);
//
//        //String ---> enum
//        AccountType accountType1 = AccountType.valueOf(strAccountType);

        for (AccountType value : AccountType.values()){
            System.out.print(value.name() + " ");         // String
            System.out.println(value.ordinal());    // Ordinal number
        }
    }
}
