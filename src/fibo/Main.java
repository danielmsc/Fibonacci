package fibo;

public class Main {

	public static void main(String[] args) {
		
		Fibonacci f = new Fibonacci();
		
		for (int i = 1; i <= 50 ; i++)
			System.out.println(f.numero(i));
		
		//Le paso la posicion del vector para obtener el resultado que estaría en esa posición.
		
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
