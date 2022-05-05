package dsandalgo;

public class Main {

    public static void main(String[] args)
    {
	   int[] arr={67,45,-23,5,9,-21,69,32,42,0};

       MergeSort(arr, 0, arr.length);

       for(int i=0;i<arr.length;i++)
       {
           System.out.print(arr[i]+" ");
       }
    }

    public static void MergeSort(int[] input, int start, int end) //Partitions recursively
    {

        if(end-start<2)
        {
            return;
        }

        int mid=(start+end)/2;
        MergeSort(input, start, mid);  //for left array
        MergeSort(input, mid, end);    // for right array

        Merge(input, start, mid, end);

    }

    public static void Merge(int[] input, int start, int mid, int end)  //Merge by sorting
    {

        if(input[mid-1] <= input[mid])   //last left sub arr element <=first right sub arr element
        {
            return;
        }

        int i=start;  // left sub arr element
        int j=mid;    // right sub arr element
                      //Both of them start at the first elements of their sub arrays

        int[] tempArr=new int[end-start];
        int tempIndex=0;

        while(i<mid && j<end)
        {
            tempArr[tempIndex++]=input[i] <= input[j] ? input[i++] : input[j++]; // comparison for sort
        }

        System.arraycopy(input, i, input, start + tempIndex, mid -i); //copying the leftover elements in left sub arr

        System.arraycopy(tempArr,0,input, start, tempIndex); //copying tempArr to original arr


    }


}
