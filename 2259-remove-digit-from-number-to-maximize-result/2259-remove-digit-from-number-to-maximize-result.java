class Solution {
    public String removeDigit(String number, char digit) {
        String best = "";
        for (int i = 0; i < number.length(); i++) {
            if (number.charAt(i) == digit) {
                String temp = "";
                for (int j = 0; j < number.length(); j++) {
                    if (j != i) {
                        temp += number.charAt(j);
                    }
                }
                if (best.equals("") || temp.compareTo(best) > 0) {
                    best = temp;
                }
            }
        }
        return best;
    }
}