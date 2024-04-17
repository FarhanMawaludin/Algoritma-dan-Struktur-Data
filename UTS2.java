public class UTS2 {
    public static void main(String[] args) {
        int [] arr = {4,2,3,1,7,9};
        // selection sort
        for (int i = 0 ; i < arr.length ; i++){
            int temp = arr[i];
            int  j =i;
            while (j > 0 &&  arr[j - 1] > temp){
                arr[j] = arr [j-1];
                j--;
            }
            arr[j] = temp;
        }
        for (int x : arr) {
            System.out.print(x + " ");
    }
}
}