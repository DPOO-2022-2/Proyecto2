package InterfazGrafica;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTable;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class PantallaNominasCargarLiga extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldNombreLiga;
	private JTable table;


	/**
	 * Create the frame.
	 */
	public PantallaNominasCargarLiga() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 900, 700);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(192, 192, 192));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblCargarLiga = new JLabel("CARGAR LIGA");
		lblCargarLiga.setBounds(341, 24, 214, 37);
		lblCargarLiga.setFont(new Font("Tahoma", Font.PLAIN, 30));
		contentPane.add(lblCargarLiga);
		
		JLabel lblNombreLiga = new JLabel("Nombre Liga");
		lblNombreLiga.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNombreLiga.setBounds(209, 88, 203, 25);
		contentPane.add(lblNombreLiga);
		
		textFieldNombreLiga = new JTextField();
		textFieldNombreLiga.setColumns(10);
		textFieldNombreLiga.setBounds(379, 94, 298, 20);
		contentPane.add(textFieldNombreLiga);
		
		JButton btnCargarInformacion = new JButton("Cargar Informacion");
		btnCargarInformacion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnCargarInformacion.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnCargarInformacion.setBounds(266, 135, 368, 23);
		contentPane.add(btnCargarInformacion);
		
		table = new JTable();
		table.setBounds(64, 169, 787, 425);
		contentPane.add(table);
		
		JButton btnRegresarMenuRegistro = new JButton("Regresar Menu Registro de Nominas");
		btnRegresarMenuRegistro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				PantallaRegistroNominas RN = new PantallaRegistroNominas();
				RN.setVisible(true);
			}
		});
		btnRegresarMenuRegistro.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnRegresarMenuRegistro.setBounds(266, 605, 395, 31);
		contentPane.add(btnRegresarMenuRegistro);
	}

}
