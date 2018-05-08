package fibo;

public class Fibonacci {
	
	private long[] vector;
	
	public Fibonacci(int cant){
		vector = new long[cant+1];
		vector[0] = 0;
		vector[1] = 1;
		for( int i = 2 ; i < vector.length ; i++ )
			vector[i] = vector[i-1] + vector[i-2];
	}
	
	public Fibonacci(){
		this(92);
	}
	
	public long numero(int n){
		return n < 93 ? vector[n] : -1;
	}
	
	public static long recursivo(long n) {
		if(n < 0) return 0;
		if(n < 2) return 1;
		return recursivo(n-2) + recursivo(n-1);
	}
	
	public static long iterativo(int n) {
		if(n < 0) return 0;
		
		long a = 1;
		long b = 1;
		
		for(int i = 0; i < n-1; i++) {
			//Guardo el resultado en A o B (empiezo con A) para ir acumulando
			if(i % 2 == 0)
				a = a + b;
			else
				b = a + b;
		}
		
		//Retorno el mas alto (es el que tiene el resultado final)
		return (a > b) ? a : b;
	}

}
