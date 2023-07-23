public class Exercise6By22 {

    private static boolean isNumber(String str) {
        if(!str.isBlank()){
            return str.chars().allMatch(Character::isDigit);
        }
        return false;
    }

    public static void main(String[] args) {
        String str = "123";
        System.out.println(str+"는 숫자입니까? " + isNumber(str));

        str = "";
        System.out.println(str+"는 숫자입니까? " + isNumber(str));
    }
}
