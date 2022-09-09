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
/**
 * @author lexer
 *
 */
public class PokeTest2 {
	PokemonCard Charizard = new PokemonCard("Charizard",200, 0, 300, "fire");
	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testStrongAgainst() {
		assertEquals("ice",Charizard.getType());
	}
	@Test
	public void testIsDead() {
		assertTrue(Charizard.isdead());
	}
	@Test
	public void testAttackSelf() {
		assertEquals(-300, Charizard.getHealthPoints());
	}

}
