package apiserver.api;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ControllerTest {

	Controller con = new Controller();
	@Test
	public void suma() {
		int resp = con.suma(3, 2);
		int esperado = 5;
		assertEquals(esperado, resp);
	}
	
	@Test
	public void multi(){
		int resp = con.multi(4,4);
		int esperado = 16;
		assertEquals(esperado, resp);
	}
}
