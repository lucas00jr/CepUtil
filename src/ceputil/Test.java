package ceputil;

import java.io.IOException;

import org.json.JSONException;

public class Test {
	public static void main(String[] args) throws JSONException, IOException {
		String cepBuscar = ("79020190");
		
		BuscarCep b = new BuscarCep();
		
		Cep cep = new Cep();
		cep = b.buscar(cepBuscar); 
		
		System.out.println("Cep:"+cep.cep+"\nLogradouro:"+cep.logradouro+
				"\nBairro:"+cep.bairro);
		
		
		
		
	}

	
}
