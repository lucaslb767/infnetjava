public class ex02 {

    public static void main(String[] args) {

        int[] vet1 = {1,2,3,4,5,6,7,8};
        int[] vet2 = {10,20,30,40,50,60,70,80};
        int[] vet3 = new int[8];

        for (int i =0 ; i < vet1.length; i++) {
            vet3[i] = vet1[i] + vet2[i];
        }

        for (int i = 0; i < vet1.length; i++){
            System.out.printf("%d ", vet3[i]);
        }
        System.out.println("");
    }
}
