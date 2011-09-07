import java.util.*;

//programma per cercare un dato valore in un array ordinato, viene restituita la posizione

public class Ricerca {
	public static void main (String [] args) {
		Scanner tastiera = new Scanner(System.in);
		int [] arr = {1,2,3,4,5,6,7,8,9,10};
		System.out.println("Inserisci il numero che vuoi cercare");
		int j = tastiera.nextInt();
		int ric = cerca (arr, 0, arr.length-1, j);
		if (ric == -1)
			System.out.println("il numero cercato non è presente");
		else
			System.out.println("posizione " + ric);
	}
	
//ricerco il valore tramite metodo ricorsivo, l'array deve essere ordinato
	
	public static int cerca (int a[], int i, int f, int k) {
		if (i >= f) {
			if (a[i]==k)
				return i;
			else
				return -1;
		} else {
			int m = (i+f)/2; //divido a metà l'array
			if (a[m]<k)
				return cerca(a, m+1, f, k);
			else {
				if (a[m]>k)
					return cerca(a, i, m, k);
				else
					return m;
			}
		}
	}

}
