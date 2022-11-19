package InterfazGrafica;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import java.awt.Color;

public class PantallaConfiguracionAdministrador extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;


	/**
	 * Create the frame.
	 */
	public PantallaConfiguracionAdministrador() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 900, 700);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(192, 192, 192)); 
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lbMenuAdministrador = new JLabel("MENU CONFIGURACION DE ASPECTOS");
		lbMenuAdministrador.setBounds(170, 36, 566, 37);
		lbMenuAdministrador.setFont(new Font("Tahoma", Font.PLAIN, 30));
		contentPane.add(lbMenuAdministrador);
		
		JButton btnEliminarJugador = new JButton("Eliminar Jugador");
		btnEliminarJugador.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				PantallaEliminarJugador EJ = new PantallaEliminarJugador();
				EJ.setVisible(true);
			}
		});
		btnEliminarJugador.setFont(new Font("Tahoma", Font.PLAIN, 40));
		btnEliminarJugador.setBounds(201, 397, 464, 94);
		contentPane.add(btnEliminarJugador);
		
		JButton btnEliminarEquipo = new JButton("Eliminar Equipo");
		btnEliminarEquipo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				PantallaEliminarEquipo EE = new PantallaEliminarEquipo();
				EE.setVisible(true);
			}
		});
		btnEliminarEquipo.setFont(new Font("Tahoma", Font.PLAIN, 40));
		btnEliminarEquipo.setBounds(201, 263, 464, 94);
		contentPane.add(btnEliminarEquipo);
		
		JButton btnCrearTemporada = new JButton("Crear Temporada");
		btnCrearTemporada.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				PantallaCrearTemporada pantallaTemporada = new PantallaCrearTemporada();
				pantallaTemporada.setVisible(true);
			}
		});
		btnCrearTemporada.setFont(new Font("Tahoma", Font.PLAIN, 40));
		btnCrearTemporada.setBounds(201, 135, 464, 94);
		contentPane.add(btnCrearTemporada);
		
		JButton btnRegresarMenuAddministrador = new JButton("Regresar Menu Administrador");
		btnRegresarMenuAddministrador.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				PantallaInicialAdministrador PIA = new PantallaInicialAdministrador();
				PIA.setVisible(true);
			}
		});
		btnRegresarMenuAddministrador.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnRegresarMenuAddministrador.setBounds(248, 559, 395, 31);
		contentPane.add(btnRegresarMenuAddministrador);
	}
}
