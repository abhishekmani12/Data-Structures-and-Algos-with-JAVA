package dsandalgo;

public class Main {

    public static void main(String[] args) {

        int[] arr={398,294,305,398,452,592,721}; //same radix and same width

         RadixSort(arr, 10, 3);

        for(int i=0;i<arr.length;i++)
          {
              System.out.print(arr[i]+" ");
          }
    }

    public static void RadixSort(int[] input, int radix, int width)  //positions
    {
      for(int i=0;i<width;i++)
      {
          radSingleSort(input, i, radix);
      }
    }

    public static void radSingleSort(int[] input, int position,int radix)  //Extracting and comparing
    {
        int length=input.length;

        int[] countArr=new int[radix];

        for(int value: input)
        {
            countArr[getDigit(position, value, radix)]++;
        }

        for(int j=1; j<radix;j++)   //for stability
        {
            countArr[j]+=countArr[j-1];
        }

        int[] temp=new int[length];

        for(int tempIndex=length-1;tempIndex>=0;tempIndex--)   //R---L
        {
           temp[--countArr[getDigit(position, input[tempIndex],radix)]]=input[tempIndex];
        }

        for(int tempIndex=0; tempIndex<length;tempIndex++)  //copying
        {
            input[tempIndex]=temp[tempIndex];
        }
    }

    public static int getDigit(int position, int value, int radix)
    {
        return value/ (int) Math.pow(radix,position) % radix; //to get the digit for comparison(one, tens, hundreds..)based on position-"i"
    }
