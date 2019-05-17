public class ex01 {
    public static void main(String[] args) {
        int[] vetorA= {10,20,30,40,50,60,70,80};
        int[] vetorB = new int[8];

        for (int i = 0; i <vetorA.length; i++){
            vetorB[i] = vetorA[i];
        }

        for (int i = vetorB.length -1; i >= 0; i--){
            System.out.printf("%d ",vetorB[i]);
        }

        System.out.println("");
    }
}
