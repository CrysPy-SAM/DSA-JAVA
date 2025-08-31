public class adv_Patterns{
    public static void hollow_ractangle(int totRows, int totCols){
        for(int i=1; i<=totRows; i++){
            for(int j=1; j<=totCols; j++){
                if(i == 1 || i == totRows || j == 1 || j ==  totCols){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }



    public static void inverted_roteted_half_pyramid(int n){
        for (int  i =1; i<=n; i++){
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            for (int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }


    public static void floyes_trangle( int n ){
        int counter = 1; 
          for(int i=1; i<=n; i++){
            for (int j=1; j<=i; j++){
                System.out.print(counter+"");
                counter++; 
            }
            System.out.println();
             
          }
    }

    public static  void  dimond(int n){
        //  1st half

        for (int i=1; i<=n; i++){
            //spaces
            for (int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            //stars
            for( int j=1; j<=(2*i)-1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        // 2nd half
        for (int i=n; i>=1; i--){
            //spaces
            for (int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            //stars
            for( int j=1; j<=(2*i)-1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        // hollow_ractangle(4, 5);
        // inverted_roteted_half_pyramid(4);
        // floyes_trangle(5);
        dimond(4);
    }
}