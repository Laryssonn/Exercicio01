
public class Hello {
	
	public static void main(String[] args) {
		exibirNumerosPrimos();
	}

	public static void par(int x) {
		System.out.println(x + " é par");
	}

	public static void impar(int x) {
		if (x % 2 == 1) {
			System.out.println(x + " é impar");
		}

	}

	public static void exibirNumerosParesImpares() {
		for (int x = 1; x <= 100; x++) {
			if (x % 2 == 0) {
				par(x);
			} else {
				impar(x);
			}

		}
	}

	public static void exibirNumerosPrimos() {
		int c = 0;
		for (int x = 0; x <= 100; x++) {
			int aux = x;
			while (aux > 0 && c < 3) {
				if (x % aux == 0) {
					c++;
				}
				
				aux--;
			}
			
			if (c == 2) {
				System.out.println(x);
			}
			c = 0;
		}
	}

}
