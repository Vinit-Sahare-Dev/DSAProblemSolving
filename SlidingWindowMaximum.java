
public class SlidingWindowMaximum {
        public static void main (String[] args){
        int[] arr = { 2,9,3,4,7,6,5,2,3,4};
        int k = 3;
        int[] arr1 = new int[arr.length - k + 1];
        for(int i = 0; i<arr.length - k+1;i++){
            int max = arr[i];
            for (int j = i; j < i + k; j++){
               if (arr[j] > max){
                   max = arr[j];
               }
        }
        arr1[i]=max;
        }
        for (int i : arr1) 
        {
        System.out.print(i +" ");
         }

    }
    
 }  