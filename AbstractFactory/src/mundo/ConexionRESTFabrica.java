package mundo;

import mundo.inter.*;
import mundo.inter.impl.*;

public class ConexionRESTFabrica implements FabricaAbstracta {

	@Override
	public IConexionREST getREST(String area) {
		if (area == null)
			return new ConexionRESTNoArea();

		if (area.equalsIgnoreCase("COMPRAS"))
			return new ConexionRESTCompras();
		else if (area.equalsIgnoreCase("VENTAS"))
			return new ConexionRESTVentas();

		return new ConexionRESTNoArea();
	}

	@Override
	public IConexionBD getBD(String motor) {
		return null;
	}
}
