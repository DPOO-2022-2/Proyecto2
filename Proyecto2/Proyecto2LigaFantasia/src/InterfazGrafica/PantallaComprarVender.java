package InterfazGrafica;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Clases.Equipo;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import java.awt.event.ActionEvent;
import java.awt.Color;
public class PantallaComprarVender extends JFrame {
	private JFrame frame;
	private JTextField textFieldNombre;
	private JTextField textFieldPosicion;
	private JTextField textFieldEquipoReal;
	private JTextField textFieldEquipo;
	private String Nombre;
	private ArrayList jugadores;

	private ArrayList jugadoresF;
	private Integer cantidad;
	private static String club;
	private String cristiano; //Va a ganar el mundial Siuuuuuuu
	private ArrayList jugadoresFantasiaComprados;
	private JPanel contentPane;
	private Integer contador;
	public PantallaComprarVender() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		setBounds(500, 500, 900, 700);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(192, 192, 192));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lbMenuequipoUs = new JLabel("MENU USUARIO - COMPRAR/VENDER JUGADORES");
		lbMenuequipoUs.setBounds(140, 36, 566, 37);
		lbMenuequipoUs.setFont(new Font("Tahoma", Font.PLAIN, 30));
		contentPane.add(lbMenuequipoUs);

			setContentPane(contentPane); 
			contentPane.setLayout(null);
			
			JLabel lbCBusquedaJugador = new JLabel("Equipo Fantasia propio: "); //Consideramos que si hubieramos usado un HashMap el cual la llave sea el usuario y su la lista de jugadores
			lbCBusquedaJugador.setBounds(50, 230, 251, 29);
			lbCBusquedaJugador.setFont(new Font("Tahoma", Font.PLAIN, 15));
			contentPane.add(lbCBusquedaJugador);
			
			JLabel lbNombre = new JLabel("Nombre:");
			lbNombre.setFont(new Font("Tahoma", Font.PLAIN, 24));
			lbNombre.setBounds(121, 98, 96, 41);
			contentPane.add(lbNombre);

			textFieldNombre = new JTextField();
			textFieldNombre.setColumns(10);
			textFieldNombre.setBounds(227, 98, 285, 29);
			contentPane.add(textFieldNombre);
			
			JLabel lbPosicion = new JLabel("Posición:");
			lbPosicion.setFont(new Font("Tahoma", Font.PLAIN, 24));
			lbPosicion.setBounds(121, 161, 128, 41); 
			contentPane.add(lbPosicion);
			
			textFieldPosicion = new JTextField();
			textFieldPosicion.setColumns (10);
			textFieldPosicion.setBounds(227, 161, 285, 29);
			contentPane.add(textFieldPosicion);
			
			
			textFieldEquipo = new JTextField();
			textFieldEquipo.setColumns(10);
			textFieldEquipo.setBounds(227, 230, 285, 29);
			contentPane.add(textFieldEquipo);
			
			JLabel lbEquipoReal = new JLabel("Equipo Real:");
			lbEquipoReal.setFont(new Font("Tahoma", Font.PLAIN, 15));
			lbEquipoReal.setBounds(80, 300, 128, 41); 
			contentPane.add(lbEquipoReal);
			
			textFieldEquipoReal = new JTextField();
			textFieldEquipoReal.setColumns (10);
			textFieldEquipoReal.setBounds(227, 300, 285, 29);
			contentPane.add(textFieldEquipoReal);
			

			String NombreEquipo = textFieldEquipo.getText();
			String jugador = textFieldNombre.getText();
			String Posicion = textFieldNombre.getText();
			String NombreEquipoReal = textFieldEquipoReal.getText();
			
			contador = 0;
			JButton btnsiguiente = new JButton("Comprar");
			String equipo = textFieldEquipo.getText();
			btnsiguiente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			for (int i=0; Main.equipos.size()>i;i++) {//Busca todos los equiposFantasia que hay en el ArrayList
				club =  Main.equipos.get(i).getNombre();//Pensamos en usar un HashMap para guardar como llave el club y como valor una lista de jugadores
				if (NombreEquipoReal == club) {
					List jugadores = Main.equipos.get(i).getJugadores();
					cantidad = jugadores.size();
					contador = 0;
					for(int indice = 0;indice<jugadores.size();indice++)
					{
						cristiano =  jugadores.get(indice).toString();//Mira todos los jugadores en String
					    if (jugador == cristiano) {
					    	contador = 0;
					    	for (int x =0; Main.equiposFantasia.size()>x; x++) {
					    		if(Nombre == Main.equiposFantasia.get(x).getNombre()) {
					    			List jugadoresF = Main.equiposFantasia.get(x).getJugadores();
					    			if (jugadoresF.size()>=15) {
										JOptionPane.showMessageDialog(frame, "Su equipo ya tiene los 15 jugadores necesarios");//Revisa que pueda hacer la compra
					    			}
					    			contador ++;
					    			if(contador ==jugadoresF.size()) {
						    			JOptionPane.showMessageDialog(frame, "Equipo no encontrado");
					    			}
					    			if (contador !=Main.equiposFantasia.size() && jugadoresF.size()>=15) {
					    			jugadoresF.add(jugador);
					    			Main.equiposFantasia.get(i).setJugadores(jugadoresF);
					    			JOptionPane.showMessageDialog(frame, "Jugador añadido con exito");
					    			break;
					    			}
					    		}
					    	}
					    }
					    contador ++;
					    if (contador == jugadores.size()) {
							JOptionPane.showMessageDialog(frame, "Nombre del jugador no existe");
							}
					}
				}
				contador ++;
				if (contador ==Main.equipos.size()) {
					JOptionPane.showMessageDialog(frame, "Nombre del equipo no existe");
				}
			}
			if (Main.equipos.size()==0) {
    			JOptionPane.showMessageDialog(frame, "No hay jugadores cargados (No hay temporada, disfruta las vacaciones, viva el Bicho :)");
			}
		}
			});

		btnsiguiente.setFont(new Font("Tahoma", Font.PLAIN, 40));
		btnsiguiente.setBounds(201, 340, 464, 94);
		contentPane.add(btnsiguiente);
		contador =0;
		JButton btnsiguienteCompra = new JButton("Vender");
		btnsiguienteCompra.addActionListener(new ActionListener() {
		public void actionPerformed (ActionEvent e) {
			for (int a=0; Main.equiposFantasia.size()>a;a++) {//Busca todos los equiposFantasia que hay en el ArrayList
				club =  Main.equiposFantasia.get(a).getNombre();//Pensamos en usar un HashMap para guardar como llave el club y como valor una lista de jugadores
				if (NombreEquipo == club) {
					contador = 0;
					List jugadores = Main.equiposFantasia.get(a).getJugadores();
					cantidad = jugadores.size();
					for(int indice = 0;indice<jugadores.size();indice++)
					{
						cristiano =  jugadores.get(indice).toString();//Mira todos los jugadores en String
					    if (jugador == cristiano) {
					    	jugadores.remove(indice);//remueve jugador de la lista de jugadores
					    	Main.equiposFantasia.get(a).setJugadores(jugadores);//devuelve lista sin el jugador dado
					    	JOptionPane.showMessageDialog(frame, "Jugador removido con exito");
					    	}
					    contador ++;
					    if (contador ==jugadores.size()) {
							JOptionPane.showMessageDialog(frame, "Nombre del jugador no existe en el equipo");	   
					    }
					}
				}
				contador ++;
				if (contador == Main.equiposFantasia.size()) {
					JOptionPane.showMessageDialog(frame, "Nombre del equipo no existe");
				}
			}
			if (Main.equipos.size()==0) {
    			JOptionPane.showMessageDialog(frame, "No hay jugadores cargados (No hay temporada, disfruta las vacaciones, viva el Bicho :)");
			}
		}
	});
		btnsiguienteCompra.setFont(new Font("Tahoma", Font.PLAIN, 40));
		btnsiguienteCompra.setBounds(201, 450, 464, 94);
		contentPane.add(btnsiguienteCompra);
		JButton btnRegresarEquiposUsuario = new JButton("Finalizar");
		btnRegresarEquiposUsuario.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (cantidad ==15 ) {
					JOptionPane.showMessageDialog(frame, "Su equipo esta completo con exito");
					PantallaEquiposUsuario PIA = new PantallaEquiposUsuario();
					PIA.setVisible(true);
				}
				if (Main.equipos.size()==0) {
					PantallaEquiposUsuario PIA = new PantallaEquiposUsuario();
					PIA.setVisible(true);
				}
				
			}
		});
		btnRegresarEquiposUsuario.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnRegresarEquiposUsuario.setBounds(248, 559, 395, 31);
		contentPane.add(btnRegresarEquiposUsuario);
		
	}
}