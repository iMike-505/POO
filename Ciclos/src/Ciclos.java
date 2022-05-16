public class Ciclos {

    public static void main(String[] args) {

        int numeritos[][]= new int[4][4];
        int k = 0;
        for (int i=0;i<4;i++){
            for (int j=0;j<4;j++){
                numeritos[i][j]=j*2+2+k;
                System.out.print(+numeritos[i][j]+"\t");
            }
            System.out.print("\n");
            k+=8;
        }
    }   
}
