public class ex07 {
    public static void main(String[] args) {
        int[] vet = {10,2,30,4,50,6,70,8,9,1};
        int menor = Integer.MAX_VALUE, pos = 0;

        for (int i=0; i < vet.length; i++) {
            if (vet[i] < menor) {
                menor = vet[i];
                pos = i;
            }
        }

        System.out.println("Menor é " + menor + " na posição " + pos);
    }
}
