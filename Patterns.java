package DATATYPES;

public class Patterns {

    public static void main(String[] args) {
        // int rows = 5;
        // for (int i = 1; i <= rows; ++i) {
        //     for (int j = 1; j <= rows - i; ++j) {
        //         System.out.print(" "); 
        //     }
        //     for (int j = 1; j <= 2 * i - 1; ++j) {
        //         System.out.print("*");
        //     }
            
        //     System.out.println();
        // }
        // for (int i = 4; i > 0; --i) {
        //     for (int j = 1; j <= rows - i; --j) {
        //         System.out.print(" "); 
        //     }
        //     for (int j = 4; j > 0 ; --j) {
        //         System.out.print("*");
        //     }
           
            // System.out.println();
            int rows = 5; 
        // for (int i = 1; i <= rows; ++i) {
        //     for(int h = 5; h>=0;--h){

        //         for(int g=1; g<=h-1; g++){

        //         System.out.print(" ");
        //     }
        //     }

        //     // for (int j = 1; j <= 2* i-1; j++) {
        //     //     System.out.print("* ");
        //     // }
        //     // System.out.println(); 
        // }
        for(int k=1; k<=1; ++k){
        for (int i = 1; i <= rows; ++i){

            for(int j=1; j <= rows - i; ++j){
                System.out.print(" ");
            }

            for(int j=1; j<=i;++j){
                System.out.print("*");
            }
            System.out.println(" ");
        }
        for(int l= 4; l >=0; --l){
            for(int j = 1; j <= rows-l; ++j)
            {
                System.out.print(" ");
            }
            for(int j = 1; j <= l; ++j){
                System.out.print("*");
            }
            System.out.println(" ");
        }

        

        }
    }
}
