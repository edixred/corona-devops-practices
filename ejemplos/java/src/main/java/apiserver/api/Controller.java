package apiserver.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
	
	@GetMapping("/hi")
	public String wellcome() {
		String response = addNumber("S","x",1,2,3,4);
		String demoerrorstring = "hola mundo" + "x" + "S";

		return "welcome to DEMO : " + response + demoerrorstring;
		
	}

	private String addNumber(String param1, String param2, int n1, int n2, int n3, int n4) {
		
		int resp = 0; 
		System.out.println("Hola mensaje");
		if(param1.equals("S")) {
			int acum1 = n3+n4;
			int acum2 = n1+n2;
			if(param2.equals("V")) {
				resp = multi(acum1,acum2);	
			} else {
				resp = suma(acum1,acum2);
			}			
		} else {
			resp = n1+n2+n3+n4;
		}
		return String.valueOf(resp);
	}

	public int suma(int acum1, int acum2) {
		// TODO Auto-generated method stub
		return acum1+acum2;
	}

	public int multi(int acum1, int acum2) {
		// TODO Auto-generated method stub
		return acum1 *acum2;
	}

	
}
