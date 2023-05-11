////////////////////////////////////////////////////////////////////
// Francesco Sorge 1170715
// Enrico Zangrando 2000547
////////////////////////////////////////////////////////////////////

package it.unipd.mtss;

import java.util.HashMap;
import java.util.Map;

public class RomanPrinter {
    public static String print(int num) {
        return printAsciiArt(IntegerToRoman.convert(num));
    }

    private static String printAsciiArt(String romanNumber) {
        String asciiArt = "";
        String[] rows = new String[] { "", "", "", "", "", "" };
        Map<Character, String> asciiMap = new HashMap<>();

        asciiMap.put(
            'I',
            " _____ \n|_   _|\n  | |  \n  | |  \n _| |_ \n|_____|\n"
        );

        asciiMap.put(
            'L',
            " _      \n| |     \n| |     \n| |     \n| |____ \n|______|\n"
        );

        asciiMap.put(
            'V', 
            "__      __\n\\ \\    / /\n \\ \\  / / \n  "+
            "\\ \\/ /  \n   \\  /   \n    \\/    \n"
        );

        asciiMap.put(
            'X', 
            "__   __\n\\ \\ / /\n \\ V / \n  > <  \n / . \\ \n/_/ \\_\\\n"
        );

        asciiMap.put(
            'C', 
            " _____ \n/  ___|\n| |    \n| |    \n| |___ \n\\_____|\n"
        );

        asciiMap.put(
            'D', 
            " _____  \n|  __ \\ \n| |  | |\n| |  | |\n| |__| |\n|_____/ \n"
        );

        asciiMap.put(
            'M', 
            " __  __ \n|  \\/  |\n| \\  / |\n| |\\/| |\n| |  | |\n|_|  |_|\n"
        );


        for (int i = 0; i < romanNumber.length(); ++i) {
            String letterArt = asciiMap.get(romanNumber.charAt(i));
            String[] splittedLetter = letterArt.split("\n");
            for (int j = 0; j < splittedLetter.length; ++j) {
                rows[j] += (splittedLetter[j] + " ");
                if (i == romanNumber.length() - 1) {
                    rows[j] += "\n";
                    asciiArt += rows[j];
                }
            }
        }

        return asciiArt;
    }
}
