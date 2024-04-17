public class UTS {
    public static void main(String[] args) {
        int[] angka = {5, 3, 8, 1, 2};

        //buble sort
        for(int i=0 ; i < angka.length ; i++  ){
            for (int j = 1 ; j < angka.length ; j++){
                if (angka[j] < angka[j-1]){
                    int tmp = angka[j];
                    angka[j] = angka[j - 1];
                    angka[j - 1] = tmp;
                }
            }

        }
        for (int num : angka) {
            System.out.print(num + " ");
        }
    }
}
