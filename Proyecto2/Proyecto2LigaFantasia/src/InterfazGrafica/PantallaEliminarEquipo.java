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
import java.awt.Color;
import javax.swing.JTable;

public class PantallaEliminarEquipo extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTable table;

	

	/**
	 * Create the frame.
	 */
	public PantallaEliminarEquipo() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 900, 700);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(192, 192, 192));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblEliminarEquipo = new JLabel("ELIMINAR EQUIPO");
		lblEliminarEquipo.setBounds(316, 33, 275, 37);
		lblEliminarEquipo.setFont(new Font("Tahoma", Font.PLAIN, 30));
		contentPane.add(lblEliminarEquipo);
		
		JLabel lblNombreEquipoA = new JLabel("Nombre equipo a eliminar:");
		lblNombreEquipoA.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNombreEquipoA.setBounds(131, 125, 383, 20);
		contentPane.add(lblNombreEquipoA);
		
		textField = new JTextField();
		textField.setBounds(414, 129, 301, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("Regresar Menu Configuracion");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				PantallaConfiguracionAdministrador CA = new PantallaConfiguracionAdministrador();
				CA.setVisible(true);
			}
		});
		btnNewButton.setBounds(264, 613, 368, 23);
		contentPane.add(btnNewButton);
		
		JButton btnEliminarEquipoDe = new JButton("Eliminar Equipo de la Temporada");
		btnEliminarEquipoDe.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnEliminarEquipoDe.setBounds(264, 173, 368, 23);
		contentPane.add(btnEliminarEquipoDe);
		
		table = new JTable();
		table.setBounds(37, 207, 801, 376);
		contentPane.add(table);
	}
}
