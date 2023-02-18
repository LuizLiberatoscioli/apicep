import java.io.IOException;

import model.Endereco;
import service.ViacepService;

public class Main {

	public static void main(String[] args) {
		
		ViacepService viacepService = new ViacepService();
		
		try {
			Endereco endereco = viacepService.getEndereco("72155613");
			
			System.out.println(endereco);
			
		}  catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 

	}

}
