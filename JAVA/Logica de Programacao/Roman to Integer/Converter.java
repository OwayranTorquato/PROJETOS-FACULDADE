public class Converter {
    public static int romanToInt(String s) {
        int[] romanValues = new int[26];
        romanValues['I' - 'A'] = 1;
        romanValues['V' - 'A'] = 5;
        romanValues['X' - 'A'] = 10;
        romanValues['L' - 'A'] = 50;
        romanValues['C' - 'A'] = 100;
        romanValues['D' - 'A'] = 500;
        romanValues['M' - 'A'] = 1000;

        int result = 0;

        for (int i = 0; i < s.length(); i++) {
            int value = romanValues[s.charAt(i) - 'A'];
            if (i < s.length() - 1 && romanValues[s.charAt(i + 1) - 'A'] > value) {
                result -= value;
            } else {
                result += value;
            }
        }

        return result;
    }
}
