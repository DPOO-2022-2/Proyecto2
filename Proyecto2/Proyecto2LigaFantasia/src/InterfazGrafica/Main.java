package InterfazGrafica;
import java.util.ArrayList;

import Clases.DesempenioPartido;
import Clases.Usuario;


public class Main 
{
	
	public static ArrayList<Usuario> usuarios;
	
	
	public static void main(String[] args) 
	{
		usuarios = new ArrayList<>();
		
		PantallaLogIn log = new PantallaLogIn();
		
		log.setVisible(true);
		
	}
	
	public static ArrayList<DesempenioPartido> desempeno;
	
	public static void main1(String[] args) 
	{
		desempeno = new ArrayList<>();
		

		
	}

}

