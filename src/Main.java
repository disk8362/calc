import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws Exception,NumberFormatException {calc("");}
    public static String calc(String input) throws Exception {
        String arab = ("1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31,32,33,34,35,36,37,38,39,40,41,42,43,44,45,46,47,48,49,50,51,52,53,54,55,56,57,58,59,60,61,62,63,64,65,66,67,68,69,70,71,72,73,74,75,76,77,78,79,80,81,82,83,84,85,86,87,88,89,90,91,92,93,94,95,96,97,98,99,100");
        Scanner reader = new Scanner(System.in);
        System.out.println("Введите выражение");
        input = reader.nextLine();
        String[] words = input.split("[+,\\-,*,/]");
        if (words.length != 2) {throw new Exception(" формат математической операции не удовлетворяет заданию - два операнда и один оператор (+, -, /, *)");}
        String num1 = words[0];
        String num2 = words[1];
        //Римские
        try {
            Roman roman1 = Roman.valueOf(num1);
            Roman roman2 = Roman.valueOf(num2);
            int n1 = Integer.parseInt(roman1.getRoman());
            int n2 = Integer.parseInt(roman2.getRoman());
            if (n1 > 10 || n1 < 0) throw new Exception("Введите число не больше 10, не меньше 0");
            if (n2 > 10 || n2 < 0) throw new Exception("Введите число не больше 10, не меньше 0");
            // Сумма
            if (input.contains("+")) {
                int result = n1 + n2;
                String res = Integer.toString(result);
                Roman arabics = Roman.arabicToRoman(res);
                System.out.println(arabics);
            }
                //Разность
            if (input.contains("-")) {
                int result = n1 - n2;
                if (result <= 0) throw new Exception("в римской системе нет отрицательных чисел");
                String res = Integer.toString(result);
                Roman arabics = Roman.arabicToRoman(res);
                System.out.println(arabics);
            }
                // Произведение
            if (input.contains("*")) {
                int result = n1 * n2;
                String res = Integer.toString(result);
                Roman arabics = Roman.arabicToRoman(res);
                System.out.println(arabics);
            }
                //Частное
            if (input.contains("/")) {
                int result = n1 / n2;
                if (result <= 0) throw new Exception("в римской системе нет отрицательных чисел");
                String res = Integer.toString(result);
                Roman arabics = Roman.arabicToRoman(res);
                System.out.println(arabics);
            }
        }       catch (IllegalArgumentException e) {
               // Арабские
            if (arab.contains(num1)&&arab.contains(num2)) {
                int n1 = Integer.parseInt(num1);
                int n2 = Integer.parseInt(num2);}

            else throw new Exception("используются одновременно разные системы счисления");
                int n1 = Integer.parseInt(num1);
                int n2 = Integer.parseInt(num2);
            if (n1 > 10 || n1 < 0) throw new Exception("Введите число не больше 10, не меньше 0");
            if (n2 > 10 || n2 < 0) throw new Exception("Введите число не больше 10, не меньше 0");
                // Сумма
            if (input.contains("+")) {
                int result = n1 + n2;
                String res = Integer.toString(result);
                System.out.println(res);
            }
                //Разность
            if (input.contains("-")) {
                int result = n1 - n2;
                String res = Integer.toString(result);
                System.out.println(res);
            }
                // Произведение
            if (input.contains("*")) {
                int result = n1 * n2;
                String res = Integer.toString(result);
                System.out.println(res);
            }
                //Частное
            if (input.contains("/")) {
                int result = n1 / n2;
                String res = Integer.toString(result);
                System.out.println(res);
            }
        }
        return input;
    }
}






























