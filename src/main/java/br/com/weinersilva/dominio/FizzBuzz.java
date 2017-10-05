package br.com.weinersilva.dominio;

public class FizzBuzz {
	
	String resposta="";
	
	public String digaMe(int numero){
		
		
		if (numero == 0){
			resposta = "0";
		}
		else if( numero % 3 == 0 && numero % 5 == 0){
			resposta = "Fizz Buzz";
		}
		else if( numero % 3 == 0 ){
			resposta = "Fizz";
		}
		else if( numero % 5 == 0 ){
			resposta = "Buzz";
		}
		else {
			resposta = ""+ numero;
		}
		
		return resposta;
		
		
		
	}
	

}
