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
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class PantallaCrearTemporada extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTable table;

	/**
	 * Create the frame.
	 */
	public PantallaCrearTemporada() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 900, 700);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(192, 192, 192));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblCrearTemporada = new JLabel("CREAR TEMPORADA");
		lblCrearTemporada.setBounds(303, 31, 274, 37);
		lblCrearTemporada.setFont(new Font("Tahoma", Font.PLAIN, 30));
		contentPane.add(lblCrearTemporada);
		
		JLabel lblFechaDeLa = new JLabel("Fecha de la Temporada (año):");
		lblFechaDeLa.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblFechaDeLa.setBounds(163, 108, 274, 20);
		contentPane.add(lblFechaDeLa);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(447, 112, 203, 20);
		contentPane.add(textField);
		
		JButton btnCargarArchivoCsv = new JButton("Cargar Archivo csv (Equipos)");
		btnCargarArchivoCsv.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnCargarArchivoCsv.setBounds(101, 180, 303, 31);
		contentPane.add(btnCargarArchivoCsv);
		
		JButton btnCargarArchivoCsv_2 = new JButton("Cargar Archivo csv Liga");
		btnCargarArchivoCsv_2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnCargarArchivoCsv_2.setBounds(471, 180, 303, 31);
		contentPane.add(btnCargarArchivoCsv_2);
		
		table = new JTable();
		table.setBounds(56, 232, 778, 350);
		contentPane.add(table);
		
		JButton btnNewButton = new JButton("Regresar Menu Configuracion");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				PantallaConfiguracionAdministrador CA = new PantallaConfiguracionAdministrador();
				CA.setVisible(true);
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton.setBounds(259, 606, 368, 23);
		contentPane.add(btnNewButton);
	}
}
