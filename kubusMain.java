public class kubusMain {
    public static void main(String[] args) {
        kubus[] kbs = new kubus[2];

        for(int i = 0 ; i < kbs.length ; i++){
            kbs[i] = new kubus();
            kbs[i].hitungVolume(i);
        }
    }
}
