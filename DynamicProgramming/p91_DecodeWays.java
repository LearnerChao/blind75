package DynamicProgramming;

class Solution {
    public int numDecodings(String s) {
        if (s == null || s.length() == 0) {
            return 0;
        }

        int len = s.length();
        int[] ways = new int[len + 1];
        ways[0] = 1;
        for (int i = 0; i < len; i++) {
            if (isValidCode(s, i, 1)) {
                ways[i+1] += ways[i];
            }

            if (isValidCode(s, i, 2)) {
                ways[i+1] += ways[i-1];
            }
        }

        return ways[len];
    }

    private boolean isValidCode(String s, int end, int offset) {
        int start = end + 1 - offset;
        if (start < 0) {
            return false;
        }

        String code = s.substring(start, end + 1);
        if (code.startsWith("0")) {
            return false;
        }

        try {
            int num = Integer.parseInt(code);
            if (num <= 0 || num > 26) {
                return false;
            }
        } catch (Exception e) {
            return false;
        }

        return true;
    }
}