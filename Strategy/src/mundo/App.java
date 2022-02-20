package mundo;

import mundo.strategy.AntivirusAvanzado;
import mundo.strategy.Contexto;

public class App {
	
	public static void main(String[] args) {
		Contexto contexto = new Contexto(new AntivirusAvanzado());
		contexto.ejecutar();
	}

}
