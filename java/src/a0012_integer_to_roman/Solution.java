package a0012_integer_to_roman;

import java.util.ArrayList;
import java.util.List;

class Solution {

    String intToRoman (int num) {
        return solution (num);
    }

    private String solution (Integer natural) {
        List <Integer> digits = digits (natural);
        return romanThousands (digits.get (0))
            + romanHundreds (digits.get (1))
            + romanTens (digits.get (2))
            + romanUnits (digits.get (3));
    }

    private String romanThousands (Integer digit) {
        if (digit.equals (0)) return "";
        else if (digit.equals (1)) return "M";
        else if (digit.equals (2)) return "MM";
        else return "MMM";  // digit must be 3
    }

    private String romanHundreds (Integer digit) {
        if (digit.equals (0)) return "";
        else if (digit.equals (1)) return "C";
        else if (digit.equals (2)) return "CC";
        else if (digit.equals (3)) return "CCC";
        else if (digit.equals (4)) return "CD";
        else if (digit.equals (5)) return "D";
        else if (digit.equals (6)) return "DC";
        else if (digit.equals (7)) return "DCC";
        else if (digit.equals (8)) return "DCCC";
        else return "CM";  // digit must be 9
    }

    private String romanTens (Integer digit) {
        if (digit.equals (0)) return "";
        else if (digit.equals (1)) return "X";
        else if (digit.equals (2)) return "XX";
        else if (digit.equals (3)) return "XXX";
        else if (digit.equals (4)) return "XL";
        else if (digit.equals (5)) return "L";
        else if (digit.equals (6)) return "LX";
        else if (digit.equals (7)) return "LXX";
        else if (digit.equals (8)) return "LXXX";
        else return "XC";  // digit must be 9
    }

    private String romanUnits (Integer digit) {
        if (digit.equals (0)) return "";
        else if (digit.equals (1)) return "I";
        else if (digit.equals (2)) return "II";
        else if (digit.equals (3)) return "III";
        else if (digit.equals (4)) return "IV";
        else if (digit.equals (5)) return "V";
        else if (digit.equals (6)) return "VI";
        else if (digit.equals (7)) return "VII";
        else if (digit.equals (8)) return "VIII";
        else return "IX";  // digit must be 9
    }

    private List <Integer> digits (Integer arabic) {
        List <Integer> digits = new ArrayList <> (4);
        digits.add (0, arabic / 1000);
        digits.add (1, arabic % 1000 / 100);
        digits.add (2, arabic % 100 / 10);
        digits.add (3, arabic % 10);
        return digits;
    }

}
