package InterfazGrafica;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import Clases.Equipo;
import Clases.DesempenioPartido;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.stream.Stream;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.List;
import java.awt.event.ActionEvent;
import java.awt.Color;
public class PantallaRankings extends JFrame {
	private static ArrayList club;

	private JFrame frame;
	private JPanel contentPane;
	private String nombre;
	private Integer suma;
	private HashMap mejores;
	private ArrayList jugadores;
	private String jugador;
	private Integer peqe;
	private Integer primero;
	private Integer segundo;
	private String one;
	private String two;
	private String llaves;
	public PantallaRankings() {

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 900, 700);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(192, 192, 192));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		JLabel lbMenuequipoUs = new JLabel("Rankings");
		lbMenuequipoUs.setBounds(170, 36, 566, 37);
		lbMenuequipoUs.setFont(new Font("Tahoma", Font.PLAIN, 30));
		contentPane.add(lbMenuequipoUs);
		primero = 0;
		segundo = 0;
		one = "";
		two = "";
		
		for (int i=0; Main.equiposFantasia.size()>i;i++) {
			suma = 0;
			List club =  Main.equiposFantasia.get(i).getJugadores(); //Pensamos en usar un HashMap para guardar como llave el club y como valor una lista de jugadores
			for (int a = 0; club.size()>a; a++) {
				nombre = club.get(a).toString();//Nombre jugador
				for (int x = 0; Main.equipos.size()>x;x++) {
					List jugadores = Main.equipos.get(x).getJugadores();
					for (int z = 0; jugadores.size()>z;z++) {
						jugador = jugadores.get(z).toString(); //Nombre de cada jugador de equipo
						if (jugador ==nombre) {
							DesempenioPartido puntaje = new DesempenioPartido();
							peqe = Integer.parseInt(puntaje.getPuntaje());//Se supone que debería sacar del desempeño del jugador dado
							suma = suma + peqe;
						}
					}
				}
			if (suma>primero) {
				mejores.remove(primero, one);
				primero = suma;
				one = Main.equiposFantasia.get(i).getNombre();
				mejores.put(one, suma); //guarda en el HashMap el primer valor de la suma
			}
			if (suma>segundo) {
				mejores.remove(segundo,two);//revisa si entra de segundo lugar
				segundo = suma;
				two = Main.equiposFantasia.get(i).getNombre();
				mejores.put(two, segundo);
			}
			
			}
		if (Main.equiposFantasia.size()==0) {
			JOptionPane.showMessageDialog(frame, "No hay jugadores cargados (No hay temporada, disfruta las vacaciones, viva el Bicho :)");
		}
	}
	System.out.print(mejores.get(primero) +" Es el puntaje del primer equipo número uno del rankingque es el equipo "+ one);

	System.out.print(mejores.get(segundo) +" Es el puntaje del segundo equipo número dos del ranking  que es el equipo "+ two);
	JButton btnRegresarEquiposUsuario = new JButton("Regresar Menu Liga - Usuario");
	btnRegresarEquiposUsuario.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			
			PantallaLigaUsuario PIA = new PantallaLigaUsuario();
			PantallaCrearEquipo F = new PantallaCrearEquipo();
			F.setVisible(false);;
			PIA.setVisible(true);
		}
	}); 
	btnRegresarEquiposUsuario.setFont(new Font("Tahoma", Font.PLAIN, 20));
	btnRegresarEquiposUsuario.setBounds(248, 559, 395, 31);
	contentPane.add(btnRegresarEquiposUsuario);
	}
}

