package dsandalgo;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	int[] arr={45,23,89,1,34,0};

    Arrays.sort(arr);          //uses dual pivot sort

    Arrays.parallelSort(arr);  //Can be used for larger datasets as it uses threading

    for(int i=0;i<arr.length;i++)
    {
        System.out.print(arr[i]+" ");
    }
    
    }
}

//Right click on method-->go to Declaration or Usages--> See comments about the method.
