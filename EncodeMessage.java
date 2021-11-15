// Problem Statement
// You have been given a text message. You have to return the Run-length Encoding of the given message.
// Run-length encoding is a fast and simple method of encoding strings. The basic idea is to represent repeated successive characters as the character and a single count. For example, the string "aaaabbbccdaa" would be encoded as "a4b3c2d1a2".
// Input Format:
// The first line contains an integer 'T' which denotes the number of test cases or queries to be run. Then the test cases follow:

// The first and only line of each test case will contain a string denoting the message.


public class EncodeMessage 
{

    // For example, if the input string is “wwwwaaadexxxxxx”,
    // then the function should return “w4a3d1e1x6”.

    public static void main(String args[]) {

        String str = "aaaabbbccdddddddeeffffff";

        String value = getRunLengthEncodingForGivenString(str);
        System.out.println(value);
    }

    public static String getRunLengthEncodingForGivenString(String str) {
        String value = "", compare = "";

        for (int i = 0; i < str.length(); i++) {
            CharSequence seq = str.charAt(i) + "";

            if (compare.contains(seq))
                continue;

            compare = compare + str.charAt(i);

            int count = 0;
            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j))
                    count = count + 1;
            }

            value = value + str.charAt(i) + Integer.toString(count);
        }
        return value;
    }

}
