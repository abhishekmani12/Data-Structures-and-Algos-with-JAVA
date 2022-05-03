package dsandalgo;

public class Main {

    public static void main(String[] args)
    {
         int[] arr={34,-70,46,12,-400,65,91,0};

         for(int lastPartitionedIndex=arr.length-1;lastPartitionedIndex>0;lastPartitionedIndex--)
         {
             for(int i=0;i<lastPartitionedIndex;i++)
             {
                 if(arr[i]>arr[i+1])
                 {
                     swap(arr,i,i+1);
                 }
             }
         }

         for(int i=0;i<arr.length;i++)
         {
             System.out.print(arr[i]+" ");
         }

    }
    public static void swap(int arr[], int i, int j)
    {
        if(i==j)
        {
            return;
        }

        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;

    }
}
