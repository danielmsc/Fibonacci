package fibo;

public class Main {

	public static void main(String[] args) {
		
		//le paso la posicion del vector
		
		/*System.out.println("RECURSIVO");
		for(long i = 0; i<95; i++) {
			System.out.println(i + ": " + Fibonacci.recursivo(i));
		}*/
		
		System.out.println("ITERATIVO");
		for(int i = 0; i<94; i++) {
			System.out.println(i + ": " + Fibonacci.iterativo(i));
		}
		
	}

}
