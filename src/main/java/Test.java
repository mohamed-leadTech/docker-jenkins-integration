public class Test {
    static String converterString(String[] s) {
        return String.join("", s);
    }
    static Boolean isPhoneNumber(String str) {
        return str
                .chars()
                .filter(Character::isDigit)
                .count() >=2;
    }
    public static void main(String[] args) {
        String [] str = {"k", "a", "l", "l", "o"};
        String string = "33556565656";
        System.out.println(converterString(str));
        System.out.println(isPhoneNumber(string));

    }
}
