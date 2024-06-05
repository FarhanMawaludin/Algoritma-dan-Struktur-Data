package TugasLatihan;

public class binaryTreeArray11 {

        int[] data;
        int idxLast;
    
        public binaryTreeArray11(){
            data = new int[10];
            idxLast = -1; // array kosong saat proses inisialisasi
        }
    
        void populateData(int data[], int idxLast){
            this.data = data;
            this.idxLast = idxLast;
        }

        void add(int data) {
            // cek penuh atau tidak
            if (idxLast == this.data.length - 1) {
                System.out.println("The Tree is Full");
                return;
            }
            idxLast++;
            this.data[idxLast] = data;
        }
    
        void traverseInOrder(int idxStart){
            if (idxStart <= idxLast) {
                traverseInOrder(2*idxStart+1);
                System.out.print(data[idxStart] + " ");
                traverseInOrder(2*idxStart+2);
            }
        }

        void traversePreOrder(int idxStart) {
            if (idxStart <= idxLast) {
                System.out.print(this.data[idxStart] + " ");
                traversePreOrder(2 * idxStart + 1);
                traversePreOrder(2 * idxStart + 2);
            }
        }
    
        void traversePostOrder(int idxStart) {
            if (idxStart <= idxLast) {
                traversePostOrder(2 * idxStart + 1);
                traversePostOrder(2 * idxStart + 2);
                System.out.print(this.data[idxStart] + " ");
            }
        }
    }
