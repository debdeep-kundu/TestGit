import java.util.LinkedHashMap;
import java.util.Map;

public class IntToRoman {
    public static void main(String[] args) {


        System.out.println(intToRoman(20));
    }

    public static String intToRoman(int num) {

        Map<String, Integer> map = new LinkedHashMap<>();
        map.put("M",1000);
        map.put("CM", 900);
        map.put("D", 500);
        map.put("CD", 400);
        map.put("C", 100);
        map.put("XC", 90);
        map.put("L", 50);
        map.put("XL", 40);
        map.put("X", 10);
        map.put("IX", 9);
        map.put("V", 5);
        map.put("IV", 4);
        map.put("I", 1);
        StringBuilder sb = new StringBuilder();
        while(num>0){
            for(String key :map.keySet()){
                if(num>= map.get(key)){
                    sb.append(key);
                    num = num - map.get(key);
                    break;
                }
                System.out.println("Num - "+ num+" Sb - "+sb.toString());
            }
        }
        return sb.toString();

    }
}
