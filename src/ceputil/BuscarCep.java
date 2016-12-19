package ceputil;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import org.json.JSONException;
import org.json.JSONObject;

public class BuscarCep {
	
	public BuscarCep(){}
	
	public Cep buscar(String cep) throws JSONException, IOException {
		String currentCep = cep;

		String url = "http://viacep.com.br/ws/" + cep + "/json/unicode";

		JSONObject obj = new JSONObject(getHttpGET(url));

		if (!obj.has("erro")) {
			String cep2 = obj.getString("cep");
			String logradouro = obj.getString("logradouro");
			String bairro = obj.getString("bairro");

			Cep cep3 = new Cep();
			cep3.setCep(cep2);
			cep3.setLogradouro(logradouro);
			cep3.setBairro(bairro);

			return cep3;
		} else {
			System.out.println("O Cep " + currentCep + " não existe!");
		}
		return null;

	}

	public final String getHttpGET(String urlToRead) throws IOException {
		StringBuilder result = new StringBuilder();
		
			URL url = new URL(urlToRead);

			HttpURLConnection conn = (HttpURLConnection) url.openConnection();

			conn.setRequestMethod("GET");
			BufferedReader rd = new BufferedReader(new InputStreamReader(conn.getInputStream()));
			String line;
			while ((line = rd.readLine()) != null) {
				result.append(line);
			}
			 
		
		return result.toString();
			
	}

}
