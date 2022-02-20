package mundo.interf.impl;

import mundo.interf.ICuentaBancaria;
import mundo.model.Cuenta;

public class CuentaAhorro implements ICuentaBancaria {

	@Override
	public void abrirCuenta(Cuenta c) {
		System.out.println("-------------------------");
		System.out.println("Se abri� una cuenta de Ahorros");
		System.out.println("Cliente: " + c.getCliente());		
	}

}
