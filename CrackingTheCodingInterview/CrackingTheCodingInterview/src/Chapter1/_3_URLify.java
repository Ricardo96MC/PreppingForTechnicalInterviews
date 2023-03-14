package Chapter1;

public class _3_URLify {

    /**
     * Write a meethoff to replace all the spaces in a stirng with '%20'. You may
     * assume that the string
     * has sufficient space at the end to hold the additional characters, and that
     * you are given the 'true length'
     * of the string.
     * 
     * INPUT: "Mr John Smith", 13
     * OUTPUT: "Mr%20John%20Smith"
     * 
     */

    public void replaceSpaces(char[] str, int trueLength) {
        // 1. Get the total spaces we will need;
        int spaceCount = 0, index, i = 0;
        for (i = 0; i < trueLength; i++) {
            if (str[i] == ' ') {
                spaceCount++;
            }
        }

        // 2. Find the actual length of the new string after editing it
        index = trueLength + spaceCount * 2;
        // 3. We want to start backwards on the string
        if (trueLength < str.length)
            str[trueLength] = '\0';

        for (i = trueLength - 1; i >= 0; i--) {
            if (str[i] == ' ') {
                str[index - 1] = '0';
                str[index - 2] = '2';
                str[index - 3] = '%';
                index = index - 3;
            } else {
                str[index - 1] = str[i];
                index--;
            }
        }
        System.out.println("Filled String: " + String.valueOf(str));
    }
}
