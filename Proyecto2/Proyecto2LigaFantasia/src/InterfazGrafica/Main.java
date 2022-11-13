package InterfazGrafica;
import java.util.ArrayList;


public class Main 
{
	
	public static ArrayList<Usuario> usuarios;
	
	
	public static void main(String[] args) 
	{
		usuarios = new ArrayList<>();
		
		PantallaLogIn log = new PantallaLogIn();
		
		log.setVisible(true);
		
	}
	


}

