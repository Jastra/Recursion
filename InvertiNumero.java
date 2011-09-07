import java.util.*;

//inversione delle cifre di un numero

public class InvertiNumero {
	public static void main (String [] args) {
		Scanner tastiera = new Scanner(System.in);
		System.out.println("inserire il numero che si vuole invertire");
		int n = tastiera.nextInt();
		n = inverti(n, 0);
		System.out.println(n);
	}
	
//inversione delle cifre tramite ricorsione
	
	public static int inverti (int par, int i) {
		if (par < 10)
			return (par+(i*10));
		else {
			int x = par%10;
			i = (i*10)+x;
			par = par/10;
			return inverti(par, i);
		}
	}
}
