public class Latihan02 {

    public static void main(String[] args) {
        int[] ages = new int[5];

        // ISI nilai array dengan looping
        for (int i = 0; i < ages.length; i++) {
            ages[i] = (i + 1) * 10;   // 10, 20, 30, 40, 50
        }

        // OUTPUT
        System.out.println("=Value by index=");
        System.out.println("ages[2]=" + ages[2]);

        System.out.println("=Use Loop=");
        for (int i = 0; i < ages.length; i++) {
            System.out.println("ages[" + i + "]=" + ages[i]);
        }
    }
}