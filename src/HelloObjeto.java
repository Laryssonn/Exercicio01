import java.util.Date;

public class HelloObjeto {

	public static void main(String[] args) {
		HelloObjeto helloObjeto = new HelloObjeto();
		
		String exemplo= String.format("%s bom dia, hoje é o dia %s","Fulando", new Date());
		System.out.println(exemplo);
		//"%s é % s"
		helloObjeto.exibirNumerosParesImpares();

	}
	
	public void verificaParouImpar(int x) {
		
			System.out.println(String.format("%s é %s",x,x % 2 == 0 ? " par" : " impar"));

	}

	public  void exibirNumerosParesImpares() {
		for (int x = 1; x <= 100; x++) {
			verificaParouImpar(x);
			
		}
	}

	public void exibirNumerosPrimos() {
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
