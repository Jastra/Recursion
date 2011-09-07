import java.util.*;

//programma per verificare che una parola sia palindroma

public class Palindroma {
	public static void main (String [] args) {
		Scanner tastiera = new Scanner(System.in);
		System.out.println("inserisci una parola");
		String parola = tastiera.next();
		int j = pali(parola,0,parola.length()-1);
		if (j == 1)
			System.out.println("si, è palindroma");
		else
			System.out.println("no, non è palondroma");
	}
	
//per verificare che la parola è palindroma utilizzo un metodo ricorsivo
	
	public static int pali (String parola, int i, int n) {
		if (n<=1)
			return 1;
		else {
			if (parola.charAt(i)==parola.charAt(n)) {
				i++;
				n--;
				return pali (parola, i, n);
			} else
				return 0;
		}
	}

}
