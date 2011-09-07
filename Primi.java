import java.util.*;

public class Primi {
	
	public static void main(String args[]) {
		Scanner tastiera = new Scanner(System.in);
		System.out.println("CALCOLO DEL PRIMO NUMERO PRIMO SUCCESSIVO A N");
		System.out.println("Inserisci un numero");
		int n = tastiera.nextInt();
		System.out.println("Il primo numero primo successivo è " + numerosuccessivo(n));
	}
	
	public static int numerosuccessivo(int n) {
		boolean test;
		do {
			n++;
			test=Primo(n);
		} while (test==false);
		return n;
	}
	
	public static boolean Primo(int n) {
		int i;
		for (i=2;i<n;i++) {
			if ((n%i)== 0)
				break;
		}
		if (i==n) return true;
		else return false;
	}
}
