package trabajosPrácticosDesarrolladorJavaInicial;

public class TPClaseN1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int númeroI = 5, númeroF = 14;
		//Ejercicio 1.a:
		System.out.print("El resultado del while en 1.a es: ");
		while (númeroI <= númeroF) {
			System.out.print(númeroI + ", ");
			númeroI++;
		}
		
		//Ejercicio 1.b:
		/*System.out.println();
		while (númeroI>=6) {
			//System.out.print(númeroI + ", ");
			númeroI--;
		}*/
		//O
		System.out.println();
		for (int i = númeroI; númeroI >= 6; númeroI--) {
			//System.out.print(númeroI + ", ");
		}
		System.out.println();
		System.out.print("El resultado del while en 1.b es: ");
		while (númeroI <= númeroF) {
			if (númeroI %2 == 0) {
			System.out.print(númeroI + ", ");
			}
			númeroI++;
		}	

		//Ejercicio 1.c:
		System.out.println();
		while (númeroI>=6) {
			//System.out.print(númeroI + ", ");
			númeroI--;
		}
		boolean pares = false;
		System.out.println();
		System.out.print("El resultado del while en 1.c es: ");
		while (númeroI <= númeroF) {
			if (pares == true) {
				if (númeroI %2 == 0) {
					System.out.print(númeroI + ", ");
				}
			}	else {
					if (númeroI %2 != 0) {
					System.out.print(númeroI + ", ");	
					}
				}
			númeroI++;
		}	
		
		//Ejercicio 1.d:
		System.out.println();
		while (númeroI>=6) {
			//System.out.print(númeroI + ", ");
			númeroI--;
		}
		System.out.println();
		System.out.print("El resultado del while en 1.d es: ");
		for (int i = númeroF; i >= númeroI; i--) {
			if (i %2 == 0) {
			System.out.print(i + ", ");
			}
		}
	}
}
