package dsandalgo;

public class Main {

    public static void main(String[] args) {
        
	int[] arr={34,-90,34,67,1,0,32,-87};

    for(int gap=arr.length;gap>0;gap/=2)
    {
      for(int i=gap;i<arr.length;i++)
      {
          int NewEle=arr[i];
          int j=i;

          while(j>=gap && arr[j-gap]>NewEle)
          {
              arr[j]=arr[j-gap];
              j-=gap;
          }

          arr[j]=NewEle;
      }
    }

    for(int i=0;i<arr.length;i++)
    {
        System.out.print(arr[i]+" ");
    }

    }
}
