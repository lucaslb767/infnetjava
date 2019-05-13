public class ex08 {
    public static void main(String[] args) {

        int t1 = 0, t2 = 1, t3;
        System.out.println(t1);
        System.out.println(t2);
        for (int i =3; i <=10; i++){
            t3 = t2 + t1;
            System.out.println(t3);

            t1 = t2;
            t2 = t3;
        }
    }

}
