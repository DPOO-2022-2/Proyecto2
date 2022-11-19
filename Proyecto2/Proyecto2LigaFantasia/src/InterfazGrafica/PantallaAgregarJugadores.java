package InterfazGrafica;


import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import javax.swing.JOptionPane;

import Clases.Equipo;
import Clases.Usuario;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Clases.Usuario;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import Clases.Equipo;
public class PantallaAgregarJugadores extends JFrame {

	private JPanel contentPane;
	private JFrame frame;
	private Integer contador;
	private Integer cantidad;
	private JTextField textFieldNombre;
	private JTextField textFieldPosicion;
	private JTextField textFieldEquipo;
	private String Nombre;
	private ArrayList jugadores;
	private static String club;
	private String cristiano; //Va a ganar el mundial Siuuuuuuu
	private ArrayList jugadoresFantasiaComprados;
	private ArrayList guardar;
	public PantallaAgregarJugadores(String nombre){
		Nombre = nombre;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		setBounds(500, 500, 900, 700);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(192, 192, 192));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lbMenuequipoUs = new JLabel("MENU USUARIO - AGREGAR JUGADORES");
		lbMenuequipoUs.setBounds(140, 36, 566, 37);
		lbMenuequipoUs.setFont(new Font("Tahoma", Font.PLAIN, 30));
		contentPane.add(lbMenuequipoUs);

			setContentPane(contentPane); 
			contentPane.setLayout(null);
			
			JLabel lbCBusquedaJugador = new JLabel("Equipo: ");
			lbCBusquedaJugador.setBounds(121, 230, 251, 29);
			lbCBusquedaJugador.setFont(new Font("Tahoma", Font.PLAIN, 24));
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
			textFieldPosicion.setBounds(227, 161, 285, 29);
			contentPane.add(textFieldPosicion);
			
			
			textFieldEquipo = new JTextField();
			textFieldEquipo.setColumns(10);
			textFieldEquipo.setBounds(227, 230, 285, 29);
			contentPane.add(textFieldEquipo);

			String NombreEquipo = textFieldEquipo.getText();
			String jugador = textFieldNombre.getText();
			String Posicion = textFieldNombre.getText();
			
			JButton btnsiguiente = new JButton("Comprar");
			String equipo = textFieldEquipo.getText();
			cantidad = 0;
			contador = 0;
			btnsiguiente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			List jugadoresFantasiaComprados = new ArrayList();
			for (int i=0; Main.equipos.size()>i;i++) {
				club =  Main.equipos.get(i).getNombre(); //Pensamos en usar un HashMap para guardar como llave el club y como valor una lista de jugadores
				if (NombreEquipo == club) {
					contador = 0;
					List jugadores = Main.equipos.get(i).getJugadores();//Creamos una Lista paratener la lista de jugadores del respectivo equipo real
					for(int indice = 0;indice<jugadores.size();indice++)
					{
						cristiano =  jugadores.get(indice).toString();//cambiamos a String el nombre los jugadores
					    if (jugador == cristiano) {
					    	contador =0;
					    	for (int x =0; Main.equiposFantasia.size()>x; x++) {//Buscamos el equipo de fantasia
					    		if(Nombre == Main.equiposFantasia.get(x).getNombre()) {
					    			jugadoresFantasiaComprados.add(jugador);
					    			JOptionPane.showMessageDialog(frame, "Jugador añadido con exito");
					    			cantidad ++;	
					    			break;
					    		}
					    		contador ++;
					    		if(contador == Main.equiposFantasia.size()) {
					    			JOptionPane.showMessageDialog(frame, "Equipo de fantasía no se encuentra o no existe");
					    		}
					    		}
					    	}
					    contador ++;
					    if (contador==jugadores.size()) {
							JOptionPane.showMessageDialog(frame, "Nombre del jugador no existe");
							}
					}
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
		JButton btnRegresarEquiposUsuario = new JButton("Finalizar");
		btnRegresarEquiposUsuario.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (cantidad ==15 ) {
					JOptionPane.showMessageDialog(frame, "Compro todo su equipo con exito");
				    for (int x =0; Main.equiposFantasia.size()>x; x++) {//buscamos el equipo que es de fantasia
			    		if(Nombre == Main.equiposFantasia.get(x).getNombre()) {
			    			Main.equiposFantasia.get(x).setJugadores(jugadoresFantasiaComprados); //Añadimos el ArrayList a la lista de jugadores reales que ahora pertenece al respectivo equipo de fantasía
			    			}
			    			break;
			    		}
				    }
				}
		});
				if (Main.equipos.size()==0) {
					PantallaEquiposUsuario PIA = new PantallaEquiposUsuario();
					PIA.setVisible(true);
				}
				
			
		btnRegresarEquiposUsuario.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnRegresarEquiposUsuario.setBounds(248, 559, 395, 31);
		contentPane.add(btnRegresarEquiposUsuario);
		
			//if () {
				//cantidad es igual a 15, añadir todos los jugadores al equipo, reemplazando al equipo al que pertenecen
			//}
			
			
		//}
		//if (cantidad ==15 && jugadoresFantasiaComprados.size()==15) {
			
	//		}
			}
}


