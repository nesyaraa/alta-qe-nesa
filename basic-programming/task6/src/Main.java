public class Main {
    private static void DrawXYZ (int n){
        int bintang = 0;
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                bintang++;
                if (bintang % 3 ==  0){ //
                    System.out.print("x ");
                } else if (bintang%2!=0){
                    System.out.print("y ");
                }
                else if(bintang%2==0){
                    System.out.print("z ");
                }

            }
            System.out.println();
            }
        }


    public static void main(String[] args) {
        DrawXYZ(3);
        /*
        Y Z X
        Y Z X
        Y Z X
        */

        DrawXYZ(5);
        /*
        Y Z X Z Y
        X Y Z X Z
        Y X Y Z X
        Z Y X Y Z
        X Z Y X Y
         */
        DrawXYZ(1);
        // Y
    }
}