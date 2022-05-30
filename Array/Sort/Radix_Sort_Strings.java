//Replace int with String
//Line 56: Replaced 'getDigit' to 'getIndexChar' to calculate alphabet value through 'value.charAt(position)-'a''
//Line 21: changed 'for' loop to iterate from the back of the string as 'getIndexChar' returns 'value' from the back


package dsandalgo;

public class Main {

    public static void main(String[] args) {

        String[] arr = {"bcdef", "dbaqc", "abcde", "omadd", "bbbbb"}; //same radix and same width

        RadixSort(arr, 26, 5);  //Radix=(No of alphabets)--26, Width=5

        for (int i = 0; i<arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void RadixSort(String[] input, int radix, int width)  //positions
    {
        for (int i = width-1; i >=0; i--) {
            radSingleSort(input, i, radix);
        }
    }

    public static void radSingleSort(String[] input, int position, int radix)  //Extracting and comparing
    {
        int length = input.length;

        int[] countArr = new int[radix];

        for (String value : input) {
            countArr[getIndexChar(position, value)]++;
        }

        for (int j = 1; j < radix; j++)   //for stability
        {
            countArr[j] += countArr[j - 1];
        }

        String[] temp = new String[length];

        for (int tempIndex = length - 1; tempIndex >= 0; tempIndex--)   //R---L
        {
            temp[--countArr[getIndexChar(position, input[tempIndex])]] = input[tempIndex];
        }

        for (int tempIndex = 0; tempIndex < length; tempIndex++)  //copying
        {
            input[tempIndex] = temp[tempIndex];
        }
    }

    public static int getIndexChar(int position, String value) {

        return value.charAt(position)-'a';  //ascii calculations which results in values starting ranging from 0-26

    }
}
