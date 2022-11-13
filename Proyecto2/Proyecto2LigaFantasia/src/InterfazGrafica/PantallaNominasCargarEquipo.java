package InterfazGrafica;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTable;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class PantallaNominasCargarEquipo extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTable table;

	
	/**
	 * Create the frame.
	 */
	public PantallaNominasCargarEquipo() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 900, 700);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(192, 192, 192));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblCargarEquipo = new JLabel("CARGAR EQUIPO");
		lblCargarEquipo.setBounds(327, 33, 252, 37);
		lblCargarEquipo.setFont(new Font("Tahoma", Font.PLAIN, 30));
		contentPane.add(lblCargarEquipo);
		
		JLabel lblNombreEquipo = new JLabel("Nombre Equipo Real");
		lblNombreEquipo.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNombreEquipo.setBounds(211, 91, 203, 20);
		contentPane.add(lblNombreEquipo);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(424, 95, 298, 20);
		contentPane.add(textField);
		
		JButton btnCargarInformacion = new JButton("Cargar Informacion");
		btnCargarInformacion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnCargarInformacion.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnCargarInformacion.setBounds(273, 138, 368, 23);
		contentPane.add(btnCargarInformacion);
		
		table = new JTable();
		table.setBounds(58, 172, 787, 425);
		contentPane.add(table);
		
		JButton btnRegresarMenuRegistro = new JButton("Regresar Menu Registro de Nominas");
		btnRegresarMenuRegistro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				PantallaRegistroNominas RN = new PantallaRegistroNominas();
				RN.setVisible(true);
			}
		});
		btnRegresarMenuRegistro.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnRegresarMenuRegistro.setBounds(263, 608, 395, 31);
		contentPane.add(btnRegresarMenuRegistro);
	}
}
