class Solution {
    public int countOfSubstrings(String word, int k) {

        int count = 0;

        for (int i = 0; i < word.length(); i++) {

            int consonants = 0;
            int a = 0, e = 0, in = 0, o = 0, u = 0;

            for (int j = i; j < word.length(); j++) {

                char ch = word.charAt(j);

                if (ch == 'a')
                    a++;
                else if (ch == 'e')
                    e++;
                else if (ch == 'i')
                    in++;
                else if (ch == 'o')
                    o++;
                else if (ch == 'u')
                    u++;
                else
                    consonants++;

                if (a > 0 && e > 0 && in > 0 && o > 0 && u > 0
                        && consonants == k) {
                    count++;
                }
            }
        }

        return count;
    }
}