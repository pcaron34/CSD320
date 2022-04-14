
public class mod6 {

	public static void main(String[] args) {
		
		int n = 7;
		for(int i = 1; i <= n; i++){
			int p = 1;
			int square = p * p;
			String q = "@";
			
			for(int j = i; j <= n; j++){
				System.out.print("  ");
			}
			for(int j = 1; j < i; j++){
				System.out.print(p++ + " ");
			}
			for(int j = 1; j <= i; j++){
				System.out.print(p-- + " ");
			}
			for(int j = 1; j <= i; j++){
				System.out.print(" ");
			}
			for(int j = 7; j <= i; j++){
				System.out.print(q + " ");
			}
						
			System.out.println();
		}
				
	}
}

