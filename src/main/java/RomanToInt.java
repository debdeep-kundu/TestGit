import java.util.HashMap;
import java.util.Map;

public class RomanToInt {
    public static void main(String[] args) {


        System.out.println(romanToInt("MCMXCIV"));
    }

    public static int romanToInt(String s) {
        int result = 0;
        int[] roman = new int[128];

        roman['I'] = 1;
        roman['V'] = 5;
        roman['X'] = 10;
        roman['L'] = 50;
        roman['C'] = 100;
        roman['D'] = 500;
        roman['M'] = 1000;
        for (int i = 0; i + 1 < s.length(); ++i){
            if (roman[s.charAt(i)] < roman[s.charAt(i + 1)])
                result -= roman[s.charAt(i)];
            else
                result += roman[s.charAt(i)];
            System.out.println(s.charAt(i) + " , "+ result);
        }
        return result + roman[s.charAt(s.length()-1)];
    }
}
