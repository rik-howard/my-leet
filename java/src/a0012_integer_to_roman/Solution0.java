package a0012_integer_to_roman;

public class Solution0 {

    public String intToRoman(int num) {
        return solution (num);
    }

    private String solution (Integer natural) {
        return roman(natural, "", 0);
    }

    private String roman(Integer arabic, String roman, Integer column) {
        Integer digit = arabic % 10;
        arabic /= 10;
        roman = roman(digit, column) + roman;
        column += 1;
        return arabic.equals(0)? roman: roman(arabic, roman, column);
    }

    private String roman(Integer digit, Integer column) {
        String one = one(column);
        String five = five(column);
        String ten = ten(column);
        switch (digit) {
            case 1: return one;
            case 2: return one + one;
            case 3: return one + one + one;
            case 4: return one + five;
            case 5: return five;
            case 6: return five + one;
            case 7: return five + one + one;
            case 8: return five + one + one + one;
            case 9: return one + ten;
            default: return  "";  // case 0
        }
    }

    private String one(Integer column) {
        switch (column) {
            case 0: return "I";
            case 1: return "X";
            case 2: return "C";
            default: return "M";  // case 3
        }
    }

    private String five(Integer column) {
        switch (column) {
            case 0: return "V";
            case 1: return "L";
            case 2: return "D";
            default: return "";  // case 3 -- won't occur
        }
    }

    private String ten(Integer column) {
        switch (column) {
            case 0: return "X";
            case 1: return "C";
            case 2: return "M";
            default: return "";  // case 3 -- won't occur
        }
    }

}
