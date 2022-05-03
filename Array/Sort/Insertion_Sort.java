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
