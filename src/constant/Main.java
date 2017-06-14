package constant;

public class Main {
	
	static private enum Jours {
		LUNDI,
		MARDI,
		MERCREDI,
		JEUDI,
		VENDREDI,
		SAMEDI,
		DIMANCHE
	}
	
	public static void main(String[] args) {
		
		final int TOTAL = 1000;
		Main.Jours test = null;
		
		System.out.println("Utilisation d'une constante : le total est de " + TOTAL);
		// TOTAL++; impossible
		
		System.out.println();
		System.out.println("Test d'un enum qui contient les jours de la semaine :");
		
		test = test.LUNDI;
		switch (test) {
			case LUNDI:System.out.println("Fin du week-end");
						break;
			case VENDREDI:System.out.println("Début du week-end");
						break;
			default:break;
		}
	}
	
}
