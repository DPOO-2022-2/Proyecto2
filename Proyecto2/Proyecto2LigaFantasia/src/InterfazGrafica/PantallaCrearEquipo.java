package InterfazGrafica;


import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import Clases.Usuario;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Clases.Usuario;
import Clases.EquipoFantasia;
import Clases.JugadorFantasia;

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
public class PantallaCrearEquipo extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldEquipo;
	private JButton btnCrearEquipo;
	private JFrame frame;

	public PantallaCrearEquipo(){
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 900, 700);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(192, 192, 192));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Nombre del equipo:");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 24)); 
		lblNewLabel.setBounds(93, 88, 109, 41);
		contentPane.add(lblNewLabel); 
		
		textFieldEquipo = new JTextField();
		textFieldEquipo.setBounds(206, 100, 285, 29);
		contentPane.add(textFieldEquipo);
		textFieldEquipo.setColumns(10);
		JButton btnRegresarEquiposUsuario = new JButton("Regresar Menu Equipos - Usuario");
		btnRegresarEquiposUsuario.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				PantallaEquiposUsuario PIA = new PantallaEquiposUsuario();
				PantallaCrearEquipo F = new PantallaCrearEquipo();
				F.setVisible(false);;
				PIA.setVisible(true);
			}
		}); 
		btnRegresarEquiposUsuario.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnRegresarEquiposUsuario.setBounds(248, 559, 395, 31);
		contentPane.add(btnRegresarEquiposUsuario);
		
		JButton btnsiguiente = new JButton("Siguiente");
		String equipo = textFieldEquipo.getText();
		btnsiguiente.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			if (Main.equiposFantasia.contains(equipo)) {//revisa los equipos guardados en el array list del Main
				JOptionPane.showMessageDialog(frame, "Nombre del equipo ya en uso");
			}
			else {
				EquipoFantasia Equipo = new EquipoFantasia();
				Equipo.setNombre(equipo);
				Main.equiposFantasia.add(Equipo);
				textFieldEquipo.setText("");
				JOptionPane.showMessageDialog(frame, "Equipo creado con exito");
				PantallaAgregarJugadores pantallaAgregarJugadores = new PantallaAgregarJugadores(equipo);
				pantallaAgregarJugadores.setVisible(true);
			}
		}
		});
		btnsiguiente.setFont(new Font("Tahoma", Font.PLAIN, 40));
		btnsiguiente.setBounds(201, 263, 464, 94);
		contentPane.add(btnsiguiente);
	}
}