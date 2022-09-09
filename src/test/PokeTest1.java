/**
 * @author lexer - lemarshall1 
 * CIS175 - Fall 2022
 * Sep 8, 2022
 */
package test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import model.PokemonCard;


public class PokeTest1 {
	PokemonCard Wailord = new PokemonCard("Wailord", 300,300,100,"water");
	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testStrongAgainst() {
		
		assertEquals("ice",Wailord.getType());
	}
	@Test
	public void testIsDead() {
		assertFalse(Wailord.isdead());
	}
	
	@Test
	public void testAttackSelf() {
		assertEquals(200, Wailord.getMaxHealth(),0.00);
	}

}
