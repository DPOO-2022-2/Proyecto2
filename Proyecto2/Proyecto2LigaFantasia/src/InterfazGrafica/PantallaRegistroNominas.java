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
import java.awt.Color;

public class PantallaRegistroNominas extends JFrame {

	private JPanel contentPane;

	/**
	 * Create the frame.
	 */
	public PantallaRegistroNominas() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 900, 700);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(192, 192, 192));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblRegistroDeNominas = new JLabel("REGISTRO DE NOMINAS");
		lblRegistroDeNominas.setBounds(289, 32, 354, 37);
		lblRegistroDeNominas.setFont(new Font("Tahoma", Font.PLAIN, 30));
		contentPane.add(lblRegistroDeNominas);
		
		JButton btnCargarEquipo = new JButton("CARGAR EQUIPO");
		btnCargarEquipo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				PantallaNominasCargarEquipo pantallaEquipo = new PantallaNominasCargarEquipo();
				pantallaEquipo.setVisible(true);
			}
		});
		btnCargarEquipo.setFont(new Font("Tahoma", Font.PLAIN, 40));
		btnCargarEquipo.setBounds(216, 142, 464, 132);
		contentPane.add(btnCargarEquipo);
		
		JButton btnCargarNomina = new JButton("CARGAR NOMINA");
		btnCargarNomina.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				PantallaNominasCargarLiga NCL = new PantallaNominasCargarLiga();
				NCL.setVisible(true);
			}
		});
		btnCargarNomina.setFont(new Font("Tahoma", Font.PLAIN, 40));
		btnCargarNomina.setBounds(216, 364, 464, 132);
		contentPane.add(btnCargarNomina);
		
		JButton btnRegresarMenuRegistros = new JButton("Regresar Menu Registros");
		btnRegresarMenuRegistros.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				PantallaRegistrosAdministrador PRA = new PantallaRegistrosAdministrador();
				PRA.setVisible(true);
			}
		});
		btnRegresarMenuRegistros.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnRegresarMenuRegistros.setBounds(248, 568, 395, 31);
		contentPane.add(btnRegresarMenuRegistros);
	}
}
