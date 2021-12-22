import java.util.Scanner;

public class Main {
    private static final String arabic  = "1 2 3 4 5 6 7 8 9 10";
    private static final String roman =  "I II III IV V VI VII IIX IX X";
    private static final String operato =  "+ - * /";

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] strings = str.split(" ");

        if (strings.length > 3) {
            throw new Exception();
        }

        int arab1 =  arabic.indexOf(strings[0]);
        int arab2 = arabic.indexOf(strings[2]);
        int rom1 =  roman.indexOf(strings[0]);
        int rom2 = roman.indexOf(strings[2]);
        int oper = operato.indexOf(strings[1]);

        if (oper < 0) {
            throw new Exception();
        }

        if ((arab1 < 0 && arab2 < 0) && (rom1 < 0 && rom2 < 0)) {
            throw new Exception();
        }
        if ((arab1 >=0 || arab2 >=0) && (rom1 >= 0 || rom2 >=0)) {
            throw new Exception();
        }

        if (arab1 >= 0 && arab2 >= 0){
            Converter.ArabicaMetod(strings);
        } else {
            Converter.RomanMetod(strings);
        }







    }
}
