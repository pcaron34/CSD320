//Paul Caron
//4/17/22
//Module 6 Assignment

package difficultone;

public class diffOne {

	public static void main(String[] args) {
		
		// the while loop is here just because the instructions required it
        int b = 1;
		while(b==1){
            // set n to 7
        int n = 7;
        
        // Could not for the life of me figure out how to get the 
        // numbers to square properly
        for(int i = 1; i <= n; i++){
            int p = 1;
            int zigi = p * p;
            String q = "@";
            
            for(int j = i; j <= n; j++){
                System.out.print("  ");
            }
            for(int j = 1; j < i; j++){
                System.out.print(zigi++ + " ");
            }
            for(int j = 1; j <= i; j++){
                System.out.print(zigi-- + " ");
            }
            for(int j = 1; j <= i; j++){
                System.out.print("");
            }

            for(int j = i; j <= n; j++){
                System.out.print("  ");
            }

            System.out.println(q);
            System.out.println();
            b=0;
            }

	}

		
}}
