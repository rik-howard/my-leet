package a0013_roman_to_integer;

class Solution {

    int romanToInt (String s) {
        return solution (s);
    }

    private Integer solution (String s) {
        Integer thousandsDigit = thousandsDigit (s); s = s.substring (romanLength (thousandsDigit));
        Integer hundredsDigit = hundredsDigit (s);   s = s.substring (romanLength (hundredsDigit));
        Integer tensDigit = tensDigit (s);           s = s.substring (romanLength (tensDigit));
        Integer unitsDigit = unitsDigit (s);
        return thousandsDigit * 1000
            + hundredsDigit * 100
            + tensDigit * 10
            + unitsDigit;
    }

    /** @noinspection DuplicateBranchesInSwitch*/
    private Integer romanLength (int digit) {
        switch (digit) {
            case 0: return 0;
            case 1: return 1;
            case 2: return 2;
            case 3: return 3;
            case 4: return 2;
            case 5: return 1;
            case 6: return 2;
            case 7: return 3;
            case 8: return 4;
            case 9: return 2;
            default: throw new UnsupportedOperationException ();
        }
    }

    private Integer unitsDigit (String s) {
        if (s.startsWith ("VIII")) return 8;
        else if (s.startsWith ("III")) return 3;
        else if (s.startsWith ("VII")) return 7;
        else if (s.startsWith ("II")) return 2;
        else if (s.startsWith ("IV")) return 4;
        else if (s.startsWith ("VI")) return 6;
        else if (s.startsWith ("IX")) return 9;
        else if (s.startsWith ("I")) return 1;
        else if (s.startsWith ("V")) return 5;
        else return 0;
    }

    private Integer tensDigit (String s) {
        if (s.startsWith ("LXXX")) return 8;
        else if (s.startsWith ("XXX")) return 3;
        else if (s.startsWith ("LXX")) return 7;
        else if (s.startsWith ("XX")) return 2;
        else if (s.startsWith ("XL")) return 4;
        else if (s.startsWith ("LX")) return 6;
        else if (s.startsWith ("XC")) return 9;
        else if (s.startsWith ("X")) return 1;
        else if (s.startsWith ("L")) return 5;
        else return 0;
    }

    private Integer hundredsDigit (String s) {
        if (s.startsWith ("DCCC")) return 8;
        else if (s.startsWith ("CCC")) return 3;
        else if (s.startsWith ("DCC")) return 7;
        else if (s.startsWith ("CC")) return 2;
        else if (s.startsWith ("CD")) return 4;
        else if (s.startsWith ("DC")) return 6;
        else if (s.startsWith ("CM")) return 9;
        else if (s.startsWith ("C")) return 1;
        else if (s.startsWith ("D")) return 5;
        else return 0;
    }

    private Integer thousandsDigit (String s) {
        if (s.startsWith ("MMM")) return 3;
        else if (s.startsWith ("MM")) return 2;
        else if (s.startsWith ("M")) return 1;
        else return 0;
    }

}
