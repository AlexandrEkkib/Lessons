import java.util.Scanner;



public class Main
{
    public static void main(String[] args) {

        String data1 = "2345678910";
        String data2 = "IIIVIIIX";
        int marker1 = 1, marker2 = 1, marker3 = 1, marker4 = 1;
        int a = 0, b = 0, n = 0;

        Scanner in = new Scanner(System.in);
        System.out.println("Введите выражение: ");
        String str = in.next();

        String[] parts = str.split("[*+-/]+");
        for (String x : parts);

        if (parts.length == 2) {
            //Узнаем, какие значения введены:4 - арабское число, 2 - римское.
            for (int i = 0; i < data1.length(); i++) {
                if ((data1.indexOf(parts[0]) > -1)) {
                    marker1 = 4;
                    break;
                }
            }
            for (int i = 0; i < data1.length(); i++) {
                if ((data1.indexOf(parts[1]) > -1)) {
                    marker2 = 4;
                    break;
                }
            }
            for (int i = 0; i < data2.length(); i++) {
                if ((data2.indexOf(parts[0]) > -1)) {
                    marker3 = 2;
                    break;
                }
            }
            for (int i = 0; i < data2.length(); i++) {
                if ((data2.indexOf(parts[1]) > -1)) {
                    marker4 = 2;
                    break;
                }
            }
        }
        else if (parts.length == 1) {
            System.out.println("Введенная строка не является математической операцией!");
        }
        else if (parts.length > 2) {
            System.out.println("формат математической операции не удовлетворяет заданию - два операнда и один оператор (+, -, /, *).");
        }
        if (marker1 * marker2 * marker3 * marker4 == 16) {
            if (str.indexOf("+") > -1) {
                System.out.println(Integer.parseInt(parts[0]) + Integer.parseInt(parts[1]));
            }
            if (str.indexOf("-") > -1) {
                System.out.println(Integer.parseInt(parts[0]) - Integer.parseInt(parts[1]));
            }
            if (str.indexOf("*") > -1) {
                System.out.println(Integer.parseInt(parts[0]) * Integer.parseInt(parts[1]));
            }
            if (str.indexOf("/") > -1) {
                System.out.println(Integer.parseInt(parts[0]) / Integer.parseInt(parts[1]));
            }
        }
        else if (marker1 * marker2 * marker3 * marker4 == 4)
        { //перевод из римского в арабское
            switch (parts[0]) {
                case "I":
                    a = 1;
                    break;
                case "II":
                    a = 2;
                    break;
                case "III":
                    a = 3;
                    break;
                case "IV":
                    a = 4;
                    break;
                case "V":
                    a = 5;
                    break;
                case "VI":
                    a = 6;
                    break;
                case "VII":
                    a = 7;
                    break;
                case "VIII":
                    a = 8;
                    break;
                case "IX":
                    a = 9;
                    break;
                case "X":
                    a = 10;
                    break;
                default:
                    System.out.println("Введено недопустимое значение");
                    break;
            }
            switch (parts[1]) {
                case "I":
                    b = 1;
                    break;
                case "II":
                    b = 2;
                    break;
                case "III":
                    b = 3;
                    break;
                case "IV":
                    b = 4;
                    break;
                case "V":
                    b = 5;
                    break;
                case "VI":
                    b = 6;
                    break;
                case "VII":
                    b = 7;
                    break;
                case "VIII":
                    b = 8;
                    break;
                case "IX":
                    b = 9;
                    break;
                case "X":
                    b = 10;
                    break;
                default:
                    System.out.println("Введено недопустимое значение");
                    break;
            }
            //распознавание знака
            if (str.indexOf("+") > -1) {
                n = (a + b);
            }
            if (str.indexOf("-") > -1) {
                n = a - b;
            }
            if (str.indexOf("*") > -1) {
                n = a * b;
            }
            if (str.indexOf("/") > -1) {
                n = a / b;
            }
            if ((n>0)&&(n<=100)) {
                int unit = (n) % 10;
                int tens = (n) / 10;
                String c = "";
                String d = "";
                switch (unit) {
                    case 1:
                        c = "I";
                        break;
                    case 2:
                        c = "II";
                        break;
                    case 3:
                        c = "III";
                        break;
                    case 4:
                        c = "IV";
                        break;
                    case 5:
                        c = "V";
                        break;
                    case 6:
                        c = "VI";
                        break;
                    case 7:
                        c = "VII";
                        break;
                    case 8:
                        c = "VIII";
                        break;
                    case 9:
                        c = "IX";
                        break;
                }
                switch (tens) {
                    case 1:
                        d = "X";
                        break;
                    case 2:
                        d = "XX";
                        break;
                    case 3:
                        d = "XXX";
                        break;
                    case 4:
                        d = "XL";
                        break;
                    case 5:
                        d = "L";
                        break;
                    case 6:
                        d = "LX";
                        break;
                    case 7:
                        d = "LXX";
                        break;
                    case 8:
                        d = "LXXX";
                        break;
                    case 9:
                        d = "XC";
                        break;
                    case 10:
                        d = "C";
                        break;
                }
                System.out.println(d + c);
            }
                else if (n<=0){System.out.println("B римской системе нет отрицательных чисел");}
            }
        else {System.out.println(" Используются одновременно разные системы счисления.");}
        }
    }
