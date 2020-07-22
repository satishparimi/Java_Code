package com.org.onlineTest;

public class Run {

	public static void main(String[] args) {
		
		System.out.println("test started..");

        int n = 13;

        if(isPrime(n) && (n % 4 == 1)){
            System.out.println("Yes");
        }else{
            System.out.println("NO");
        }
	}
	
	 static boolean isPrime(int n){
	        
	        if(n <= 1)
	            return false;
	        if(n <= 3)
	            return true;

	        if(n % 2 == 0 || n % 3 == 0)
	            return false;
	        
	        for(int i = 5; i * i <= n; i = i + 6){
	            if(n % i == 0 || n % (i + 2) == 0){
	                return false;
	            }
	        }
			return true;

	       

	    }
	
	

}
