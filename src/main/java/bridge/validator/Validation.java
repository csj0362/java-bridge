package bridge.validator;

public class Validation {

    public static void validateNumber(String bridgeLength) {
        for (char c : bridgeLength.toCharArray()) {
            if (!Character.isDigit(c)) {
                throw new IllegalArgumentException("[ERROR] 입력된 다리 길이가 숫자가 아닙니다.");
            }
        }
    }

    public static void validateNumberThreeToTwenty(String bridgeLength) {
        int number = Integer.parseInt(bridgeLength);
        if (number < 3 ) {
            throw  new IllegalArgumentException("[ERROR] 입력된 숫자가 3보다 작습니다.");
        }
        if (number > 20) {
            throw new IllegalArgumentException("[ERROR] 입력된 숫자가 20보다 큽니다.");
        }
    }

    public static void validateMoving(String move) {
        if (!move.equals("U") && !move.equals("D")) {
            throw new IllegalArgumentException("[ERROR] 입력된 문자가 대문자 U 또는 대문자 D가 아닙니다.");
        }
    }
}
