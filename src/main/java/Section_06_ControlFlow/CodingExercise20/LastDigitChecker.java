package Section_06_ControlFlow.CodingExercise20;

public class LastDigitChecker {
    // write your code here
    public static boolean hasSameLastDigit(int num1, int num2, int num3){
        if (!isValid(num1) || !isValid(num2) || !isValid(num3)){
            return false;
        }

        int num1LastDigit = num1 % 10;
        int num2LastDigit = num2 % 10;
        int num3LastDigit = num3 % 10;

        if ((num1LastDigit == num2LastDigit) || (num2LastDigit == num3LastDigit) || (num1LastDigit == num3LastDigit)){
            return true;
        }
        return false;
    }

    public static boolean isValid(int number) {
        return number >= 10 && number <= 1000;
    }
}
