import java.util.*;

//calcolo del fattoriale di un numero

public class Fattoriale {
	public static void main (String [] args) {
		Scanner tastiera = new Scanner(System.in);
		System.out.println("inserisci il numero del quale vuoi venga calcolato il fattoriale");
		int numero = tastiera.nextInt();
		numero = calcola(numero);
		System.out.println("risultato " + numero);
	}
	
	public static int calcola (int n) {
		if (n==0)
			return 1;
		else
			return calcola(n-1)*n;
	}
}
