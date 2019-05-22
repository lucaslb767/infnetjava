public class ex09 {
    public static void main(String[] args) {

        int[][] mat1 = {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
        int[][] mat2;

        mat2 = inverteLinhaColuna(mat1);

        mostraMatriz(mat1);
        mostraMatriz(mat2);
    }

    public static void mostraMatriz(int[][] mat) {

        for (int i=0; i < mat.length; i++){
            for (int j = 0; j< mat[i].length; j++) {
                System.out.printf("%2d ", mat[i][j]);;
            }
            System.out.println("");
        }
        System.out.println("");
    }

    public static int[][] inverteLinhaColuna(int[][] mat){
        int [][] mat2 = new int[4][3];

        for (int i = 0; i<mat.length;i++) {
            for (int j= 0; j< mat[i].length;j++){
                mat2[j][i] = mat[i][j];
            }
        }
        return mat2;
    }
}
