package pl.javastart.first;

public class Palindrom {
	

		public static void main (String [] arg) {

		Palindrom palindrom = new Palindrom();
		
		char[] slowo = {'m', 'a', 'd', 'a', 'm'};
		
		if (palindrom.czyPalindrom(slowo, 0, 4) == true) {
			System.out.println("Prawda");
		}
			else {
			System.out.println("Fałsz");
			}
		}
		public boolean czyPalindrom (char[] slowo, int p, int k) {
			if (k<=p) {
				return true;
			}
			else if (slowo[p] !=slowo[k]) {
				return false ;
			}
			else {
				return czyPalindrom(slowo , p+1, k-1);
			}
	}}
