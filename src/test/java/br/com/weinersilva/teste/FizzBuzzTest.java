package br.com.weinersilva.teste;

import static org.junit.Assert.*;

import org.junit.Test;

import br.com.weinersilva.dominio.FizzBuzz;

public class FizzBuzzTest {
	FizzBuzz jogo = new FizzBuzz();
	
	@Test
	public void testaZero(){
				
		assertEquals("0", jogo.digaMe(0));
	
	}
	
	@Test
	public void testaNegativo(){
		
		assertEquals("-1", jogo.digaMe(-1));
		
	}
	
	@Test
	public void testaFizz(){
		
		assertEquals("Fizz", jogo.digaMe(3));
		
	}
	
	@Test
	public void testaBuzz(){
		
		assertEquals("Buzz", jogo.digaMe(5));
		
	}
	
	@Test
	public void testaFizzBuzz(){
		
		assertEquals("Fizz Buzz", jogo.digaMe(15));
		
	}
	

}
