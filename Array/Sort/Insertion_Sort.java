package dsandalgo;

public class Main {

    public static void main(String[] args)
    {
//fui--First Unsorted Index
      int[] arr={20,35,-15,7,55,1,-22};

      for(int fui=1;fui<arr.length;fui++)
      {
          int NewEle=arr[fui];

          int i;

          for(i=fui;i>0 && arr[i-1]>NewEle;i--)
          {
              arr[i]=arr[i-1];
          }

          arr[i]=NewEle;
      }




      for(int i=0;i<arr.length;i++)
      {
          System.out.print(arr[i]+" ");
      }

    }
}


//RECURSIVE:

package dsandalgo;

public class Main {

    public static void main(String[] args)
    {

        int[] arr={20,35,-15,7,55,1,-22};

        Insort(arr, arr.length);

        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }

        Insort(arr, arr.length);
    }

    public static void Insort(int[] input, int unsortedelements)  //Acts as the main 'for' loop in Line 10
    {
         if(unsortedelements<2)
         {
             return;
         }

         Insort(input, unsortedelements-1);

         int NewEle=input[unsortedelements-1];

         int i;

         for(i=unsortedelements-1;i>0 && input[i-1]>NewEle;i--)
         {
            input[i]=input[i-1];
         }

         input[i]=NewEle;
    }
}
