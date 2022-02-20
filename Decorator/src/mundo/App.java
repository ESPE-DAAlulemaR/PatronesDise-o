package mundo;

import mundo.decorador.BlindajeDecorador;
import mundo.interf.ICuentaBancaria;
import mundo.interf.impl.CuentaAhorro;
import mundo.model.Cuenta;

public class App {

	public static void main(String[] args) {
		Cuenta c = new Cuenta(1, "Leonardo Flores");	
		
		ICuentaBancaria cuenta = new CuentaAhorro();
		ICuentaBancaria cuentaBlindada = new BlindajeDecorador(cuenta);
		
		//cuenta.abrirCuenta(c);
		cuentaBlindada.abrirCuenta(c);
	}

}
