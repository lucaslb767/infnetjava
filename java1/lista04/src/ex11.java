public class ex11 {
    public static void main(String[] args) {
        String[][] mat1 = new String[4][5];
        populaMatriz(mat1);

        mostraMatriz(mat1);
    }

    public static void mostraMatriz(String[][] mat) {

        for (int i=0; i < mat.length; i++){
            for (int j = 0; j< mat[i].length; j++) {
                System.out.printf(mat[i][j]);;
            }
            System.out.println("");
        }
        System.out.println("");
    }
    public static void populaMatriz(String[][] mat) {
        for (int i = 0; i< mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++){
                mat[i][j] = i+""+j + " ";
            }
        }
    }
}

