import java.util.Scanner;
public class Main {
    public Main() {

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a username:");
        String Username = sc.next();

        System.out.println("Please enter a password");
        String Password = sc.next();

        System.out.println("Please enter your cellphone number");
        String CellphoneNumber = sc.next();

    }

    public static boolean
    CheckCellphoneNumberComplexity(String CellphoneNumber) {

        if (CellphoneNumber.contains("+27") && CellphoneNumber.length() == 12) {
            System.out.println("Your number is correct.");
        } else {
            System.out.println("Your number is incorrect.");
        }
        return true;
    }

    public static boolean
    CheckUsername(String Username) {

        if (Username.contains("_") && Username.length() > 5) {
            System.out.println("Username has been successfully captured");
        } else {
            System.out.println("Username does not contain an underscore or is not 5 characters.");
        }
        return true;
    }

    public static boolean
    CheckPasswordComplexity(String Password) {

        if (Password.length() > 8) {
            System.out.println("Password captured successfully.");
        } else {
            System.out.println("Password is incorrect.");
        }

        boolean ContainsUppercase = false;
        boolean ContainsLowercase = false;
        boolean ContainsNumber = false;
        boolean ContainsSpecialCharacter = false;

        int i = 0;
        if (i < Password.length()) {
            char ch = Password.charAt(i);
            if (Character.isUpperCase(ch)) {
                ContainsUppercase = true;
            }
            if (Character.isLowerCase(ch)) {
                ContainsLowercase = true;
            }
            if (Character.isDigit(ch)) {
                ContainsNumber = true;
            }
            if (!Character.isLetter(ch) && !Character.isDigit(ch) && !Character.isWhitespace(ch)) {
                ContainsSpecialCharacter = true;
            }

        }
        return true;
    }
}

