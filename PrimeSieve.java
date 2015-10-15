import java.util.Scanner;

public class PrimeSieve {
    public static void main(String[] args) { 
    	
        int N;
        int i;
    
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the max number you want to check it for");
        N = sc.nextInt();
        sc.close();
        
        // initially assume all integers are prime
        boolean[] isPrime = new boolean[N];
        isPrime[0] = false;
        for (int c = 1; c < N; c++) {
            isPrime[c] = true;
            
        }

        // mark non-primes <= N using Sieve of Eratosthenes
        for (i = 2; i <= N; i++) {
        	
            if (isPrime[i-1]) {
            	
            	System.out.println(i);
            	
            	//cross off multiple
                for (int j = i*i ; j <= N; j+= i) {
                    isPrime[j-1] = false;
                    
                }
            }
           
        }

      
        try {
			int  counter = 0; 
			for (int z = 0; z < N; z++){
				if (isPrime [i]= true) counter++;
			}
			System.out.println("The number of primes <= " + N + " is " + counter);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Something went wrong :/ ");
		}
        
    
       
    }
}
