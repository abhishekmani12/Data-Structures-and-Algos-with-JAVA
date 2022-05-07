package dsandalgo;

public class Main {


    public static void main(String[] args) {

        int[] arr={30,-24,21,90,32,-1,32};

        QuickSort(arr, 0, arr.length);

        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }

    }

    public static void QuickSort(int [] input, int start, int end)
    {
        if(end-start< 2)
        {
            return;
        }

        int pivotIndex=Partition(input, start, end);

        QuickSort(input, start, pivotIndex);        //left sub array
        QuickSort(input, pivotIndex+1, end);   //right sub array

    }

    public static int Partition(int [] input, int start, int end)
    {
       int pivot=input[start]; //First element of arr or subarr is taken as the pivot

       int i=start;
       int j=end;

       while(i<j) //checking if i and j have crossed
       {
         
         
          while(i<j && input[--j] >=pivot); //R to L ----> j
           if(i<j)
           {
               input[i]=input[j];
           }


           while(i<j && input[++i] <=pivot);  //L to R  ----> i
           if(i<j)
           {
               input[j]=input[i];
           }
       }

       input[j]=pivot;  
       return j;  //Final position for the pivot
    }
}
