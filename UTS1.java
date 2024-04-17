public class UTS1 {
    public static void main(String[] args) {
        int [] arr = {4,2,3,1,7,9};
        //selection sort
        for(int i = 0 ; i < arr.length ; i++){
            int min =i;
            for(int j = i+1 ; j < arr.length ;j++){
                if(arr[j] > arr[min]){
                    min =j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }

        for (int ang : arr){
            System.out.print(ang + " ");
        }
    }
}
