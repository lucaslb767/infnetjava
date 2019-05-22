public class ex10 {
    public static void main(String[] args) {
        int [][] mat1 = {{1,2}, {3,4}};
        int [][] mat2 = {{5,6}, {7,8}};
        int [][] mat3;

        mat3 = soma(mat1,mat2);

        mostraMatriz(mat1);
        mostraMatriz(mat2);
        mostraMatriz(mat3);
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
    public static int[][] soma(int [][] mat1,int [][] mat2) {
        int [][] mat3 = new int [2][2];

        for (int i=0; i < mat1.length; i++){
            for (int j = 0; j< mat1[i].length; j++) {
                mat3[i][j] = mat1[i][j] + mat2[i][j];
            }
        }
        return mat3;
    }
}
