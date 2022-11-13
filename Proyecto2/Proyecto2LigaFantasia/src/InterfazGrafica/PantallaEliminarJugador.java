package InterfazGrafica;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTable;
import java.awt.Color;

public class PantallaEliminarJugador extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTable table;

	

	/**
	 * Create the frame.
	 */
	public PantallaEliminarJugador() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 900, 700);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(192, 192, 192));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblEliminarJugador = new JLabel("ELIMINAR JUGADOR");
		lblEliminarJugador.setBounds(301, 22, 291, 37);
		lblEliminarJugador.setFont(new Font("Tahoma", Font.PLAIN, 30));
		contentPane.add(lblEliminarJugador);
		
		JLabel lblNombreJugadorA = new JLabel("Nombre jugador a eliminar:");
		lblNombreJugadorA.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNombreJugadorA.setBounds(135, 124, 383, 20);
		contentPane.add(lblNombreJugadorA);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(417, 128, 301, 20);
		contentPane.add(textField);
		
		JButton btnNewButton = new JButton("Regresar Menu Configuracion");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				PantallaConfiguracionAdministrador CA = new PantallaConfiguracionAdministrador();
				CA.setVisible(true);
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton.setBounds(255, 610, 368, 23);
		contentPane.add(btnNewButton);
		
		JButton btnEliminarJugadorDe = new JButton("Eliminar Jugador de la Temporada");
		btnEliminarJugadorDe.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnEliminarJugadorDe.setBounds(255, 169, 368, 23);
		contentPane.add(btnEliminarJugadorDe);
		
		table = new JTable();
		table.setBounds(51, 217, 801, 376);
		contentPane.add(table);
	}

}
