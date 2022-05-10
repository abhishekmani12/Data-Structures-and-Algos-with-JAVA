//UNSTABLE SORT

package dsandalgo;

public class Main {

    public static void main(String[] args) {

        int[] arr={3,8,2,4,6,5,1,4,9,1};

        CountSort(arr,1,10);  //range

        for(int i=0; i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }

    public static void CountSort(int [] input, int min, int max)
    {
        int[] countArr=new int[(max-min)+1]; //Range of arr

        for(int i=0;i<input.length;i++)
        {
            countArr[input[i]-min]++;   //Counter and Incrementer
        }

        int j=0; //for input array

        for(int i=min;i<=max;i++)      //writing elements to arr based on countArr
        {
            while(countArr[i-min]>0)
            {
                input[j++]=i;
                countArr[i-min]--;
            }
        }
    }
}


//STABLE SORT
