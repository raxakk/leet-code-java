public class RomanToInteger {
    public static int romanToInt(String s) {
        int number = 0;
        for (int i = 0; i < s.length(); i++) {
            char numeral = s.charAt(i);
            char nextNumeral = 0;
            if (i + 1 < s.length()) {
                nextNumeral = s.charAt(i + 1);
            }
            switch (numeral) {
                case 'M' -> number += 1000;
                case 'D' -> number += 500;
                case 'C' -> {
                    switch (nextNumeral) {
                        case 'D' -> {
                            number += 400;
                            i++;
                        }
                        case 'M' -> {
                            number += 900;
                            i++;
                        }
                        default -> number += 100;
                    }
                }
                case 'L' -> number += 50;
                case 'X' -> {
                    switch (nextNumeral) {
                        case 'L' -> {
                            number += 40;
                            i++;
                        }
                        case 'C' -> {
                            number += 90;
                            i++;
                        }
                        default -> number += 10;
                    }
                }
                case 'V' -> number += 5;
                case 'I' -> {
                    switch (nextNumeral) {
                        case 'V' -> {
                            number += 4;
                            i++;
                        }
                        case 'X' -> {
                            number += 9;
                            i++;
                        }
                        default -> number += 1;
                    }
                }
            }
        }
        return number;
    }
}
