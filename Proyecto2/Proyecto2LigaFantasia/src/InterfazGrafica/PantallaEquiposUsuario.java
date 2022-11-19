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
import java.awt.event.ActionEvent;
import java.awt.Color;

public class PantallaEquiposUsuario extends JFrame {

	private JPanel contentPane;
	public PantallaEquiposUsuario() {

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 900, 700);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(192, 192, 192));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lbMenuequipoUs = new JLabel("MENU OPCIONES DE USUARIO - EQUIPO");
		lbMenuequipoUs.setBounds(170, 36, 566, 37);
		lbMenuequipoUs.setFont(new Font("Tahoma", Font.PLAIN, 30));
		contentPane.add(lbMenuequipoUs);
		
		JButton btncrearequip = new JButton("Crear nuevo equipo");
		btncrearequip.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 
				PantallaCrearEquipo EJ = new PantallaCrearEquipo();
				EJ.setVisible(true);
			}
		});
		btncrearequip.setFont(new Font("Tahoma", Font.PLAIN, 40));
		btncrearequip.setBounds(201, 397, 464, 94);
		contentPane.add(btncrearequip);
		
		JButton btnjugadores = new JButton("Comprar/vender jugadores"); //ES NECESARIO QUE EL ADMINISTRADOR PRIMERO HAGA UNA CARGA DE DATOS, PUESTO QUE SI NO LA HACE, NO HAY INFORMACION DE LAS TEMPORADAS Y SE ASUME QUE NO HA EMPEZADO :)
		btnjugadores.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				PantallaComprarVender EE = new PantallaComprarVender();
				EE.setVisible(true);
			}
		});
		btnjugadores.setFont(new Font("Tahoma", Font.PLAIN, 40));
		btnjugadores.setBounds(201, 263, 464, 94);
		contentPane.add(btnjugadores);
		
		JButton btnposiciones = new JButton("Editar posiciones");
		btnposiciones.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				PantallaEditarPosiciones pantallaTemporada = new PantallaEditarPosiciones();
				pantallaTemporada.setVisible(true);
			}
		});
		btnposiciones.setFont(new Font("Tahoma", Font.PLAIN, 40));
		btnposiciones.setBounds(201, 135, 464, 94);
		contentPane.add(btnposiciones);
		
		JButton btnRegresarMenuUs = new JButton("Regresar Menu Usuario");
		btnRegresarMenuUs.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				PantallaInicialUsuario PIA = new PantallaInicialUsuario();
				PIA.setVisible(true);
			}
		});
		btnRegresarMenuUs.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnRegresarMenuUs.setBounds(248, 559, 395, 31);
		contentPane.add(btnRegresarMenuUs);
	}
}
