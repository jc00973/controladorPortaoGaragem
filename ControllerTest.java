package controlador;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

class ControllerTest {

	@Test
	public void test1() {
		Controller p = new Controller();
		assertEquals("001234321000", p.execute("..P...O....."));
		System.out.println("Passou no teste 1.");
	}
	
	@Test
	public void test2() {
		Controller p = new Controller();
		assertEquals("012345", p.execute(".P...."));
		System.out.println("Passou no teste 2.");
	}
	
	@Test
	public void test3() {
		Controller p = new Controller();
		assertEquals("000122222345", p.execute("...P.P...P.."));
		System.out.println("Passou no teste 3.");
	}
	
	@Test
	public void test4() {
		Controller p = new Controller();
		assertEquals("123210", p.execute("P..O.."));
		System.out.println("Passou no teste 4.");
	}
	
	@Test
	public void test5() {
		Controller p = new Controller();
		assertEquals("123333343210", p.execute("P..P...PO..."));
		System.out.println("Passou no teste 5.");
	}
	
	@Test
	public void test6() {
		Controller p = new Controller();
		assertEquals("123432344444555", p.execute("P...O.O.P...P.."));
		System.out.println("Passou no teste 6.");
	}
	
	@Test
	public void test7() {
		Controller p = new Controller();
		assertEquals("123455433332100", p.execute("P.....P.P..P..."));
		System.out.println("Passou no teste 7.");
	}
}
