package mundo;

import mundo.facade.CheckFacade;

public class App {
	
	public static void main(String[] args) {
		CheckFacade cliente1 = new CheckFacade();
		cliente1.buscar("01/01/2022", "03/01/2022", "Quito", "Tokio");
		
		CheckFacade cliente2 = new CheckFacade();
		cliente2.buscar("01/01/2022", "03/01/2022", "Quito", "Kioto");
	}

}
