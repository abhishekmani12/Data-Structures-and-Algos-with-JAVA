package dsandalgo;

public class Main {

    public static void main(String[] args)
    {
           int[] arr={23,5,-89,-34,420,69,96,-21-1,45};

           for(int lastunsortedIndex=arr.length-1;lastunsortedIndex>0;lastunsortedIndex--)
           {
               int largest=0; //initialization
               for(int i=1;i<=lastunsortedIndex;i++) //don't forget <=lastunsortedIndex
               {
                   if(arr[i]>arr[largest])
                   {
                       largest=i;
                   }
               }
               swap(arr, largest, lastunsortedIndex);
           }

           for(int i=0;i<arr.length;i++)
           {
               System.out.print(arr[i]+" ");
           }

    }

    public static void swap(int[] arr,int i, int j)
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
