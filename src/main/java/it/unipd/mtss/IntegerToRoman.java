////////////////////////////////////////////////////////////////////
// Francesco Sorge 1170715
// Enrico Zangrando 2000547
////////////////////////////////////////////////////////////////////

package it.unipd.mtss;

public class IntegerToRoman {

    public static String convert(int number) {
        String[] romanNums = { "M", "CM", "D", "CD", "C", "XC", "L",
                "XL", "X", "IX", "V", "IV", "I" };
        int[] arabicNums = { 1000, 900, 500, 400, 100,
             90, 50, 40, 10, 9, 5, 4, 1 };
        StringBuilder romanNumStringBuilder = new StringBuilder();
        int i = 0;

        while (number > 0) {
            while (number >= arabicNums[i]) {
                romanNumStringBuilder.append(romanNums[i]);
                number -= arabicNums[i];
            }
            i++;
        }

        return romanNumStringBuilder.toString();
    }
}
