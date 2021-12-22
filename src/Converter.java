import java.util.HashMap;
import java.util.Map;

public class Converter {
    public static void ArabicaMetod(String[] arr) {
        int a = Integer.parseInt(arr[0]);
        int b = Integer.parseInt(arr[2]);

        System.out.println(Algebra.Arithmetic(arr[1], a, b));

    }
    public static void RomanMetod(String[] arr) throws Exception {
        char[] symbols = arr[0].toCharArray();
        int[] number = new int [symbols.length];
        int first = 0;

        String operator = arr[1];

        char[] symbols2 = arr[2].toCharArray();
        int[] number2 = new int [symbols2.length];
        int second = 0;


        HashMap<Integer, String> rom = new HashMap<>();
        rom.put(1000, "M");
        rom.put(500, "D");
        rom.put(100, "C");
        rom.put(50, "L");
        rom.put(10, "X");
        rom.put(5, "V");
        rom.put(1, "I");
        for (int i = 0; i < symbols.length; i++) {
            for (Map.Entry<Integer, String> entry : rom.entrySet()) {
                if (entry.getValue().equals(("" + symbols[i]))) {
                    number[i] = entry.getKey();

                }
            }
        }
        for (int i = 0; i < symbols2.length; i++) {
            for (Map.Entry<Integer, String> entry : rom.entrySet()) {
                if (entry.getValue().equals(("" + symbols2[i]))) {
                    number2[i] = entry.getKey();

                }
            }
        }
        for(int i = 0; i< number.length; i++){
            first = first + number[i];
            if (i >0 && number[i] > number[i-1]) {
                first = first - ((first - number[i])*2);
            }
        }
        for(int i = 0; i< number2.length; i++){
            second = second  + number2[i];
            if (i >0 && number2[i] > number2[i-1]) {
                second = second - ((second - number2[i])*2);
            }
        }
        int result = Algebra.Arithmetic(operator, first, second);

        if (result <= 0) {
            throw new Exception();
        }

        String vivod = "";
        while(result!=0) {
            if (result == 100) {
                vivod = "C";
                result = result - 100;
            }
            if (result < 100 && result > 90) {
                vivod = "XC";
                result = result - 90;
            }
            if (result < 90 && result > 50) {
                vivod = vivod + "L";
                result = result - 50;
            }
            if (result == 50) {
                vivod = "L";
            }
            if (result < 50 && result >= 40){
                vivod = vivod + "XL";
                result = result - 40;
            }

            if (result < 40 && result > 9)
            {
                vivod = vivod + "X";
                result = result - 10;
            }
            if (result == 9) {
                vivod = vivod + "IX";
                result = result - 9;
            }
            if (result == 8) {
                vivod = vivod + "IIX";
                result = result - 8;
            }
            if (result == 7) {
                vivod = vivod + "VII";
                result = result - 7;
            }
            if (result == 6) {
                vivod = vivod + "VI";
                result = result - 6;
            }
            if (result == 5) {
                vivod = vivod + "V";
                result = result - 5;
            }
            if (result == 4) {
                vivod = vivod + "IV";
                result = result - 4;
            }
            if (result == 3) {
                vivod = vivod + "III";
                result = result - 3;
            }
            if (result == 2) {
                vivod = vivod + "II";
                result = result - 2;
            }
            if (result == 1) {
                vivod = vivod + "I";
                result = result - 1;
            }
        }
        System.out.println(vivod);


    }
}





