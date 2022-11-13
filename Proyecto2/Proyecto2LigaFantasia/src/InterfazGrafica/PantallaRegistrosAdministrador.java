package InterfazGrafica;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class PantallaRegistrosAdministrador extends JFrame {

	private JPanel contentPane;

	/**
	 * Create the frame.
	 */
	public PantallaRegistrosAdministrador() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 900, 700);
		contentPane = new JPanel();
		contentPane.setBackground(Color.LIGHT_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblMenuRegistros = new JLabel("MENU REGISTROS");
		lblMenuRegistros.setBounds(319, 46, 254, 37);
		lblMenuRegistros.setFont(new Font("Tahoma", Font.PLAIN, 30));
		contentPane.add(lblMenuRegistros);
		
		JButton btnRegistrarResultados = new JButton("Registrar Resultados");
		btnRegistrarResultados.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				PantallaRegistrarResultados RR = new PantallaRegistrarResultados();
				RR.setVisible(true);
			}
		});
		btnRegistrarResultados.setFont(new Font("Tahoma", Font.PLAIN, 40));
		btnRegistrarResultados.setBounds(223, 149, 464, 132);
		contentPane.add(btnRegistrarResultados);
		
		JButton btnRegistrarNominas = new JButton("Registrar Nominas");
		btnRegistrarNominas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				PantallaRegistroNominas RM = new PantallaRegistroNominas();
				RM.setVisible(true);
			}
		});
		btnRegistrarNominas.setFont(new Font("Tahoma", Font.PLAIN, 40));
		btnRegistrarNominas.setBounds(223, 379, 464, 132);
		contentPane.add(btnRegistrarNominas);
		
		JButton btnRegresarMenuAddministrador = new JButton("Regresar Menu Administrador");
		btnRegresarMenuAddministrador.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				PantallaInicialAdministrador PIA = new PantallaInicialAdministrador();
				PIA.setVisible(true);
			}
		});
		btnRegresarMenuAddministrador.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnRegresarMenuAddministrador.setBounds(255, 573, 395, 31);
		contentPane.add(btnRegresarMenuAddministrador);
	}
}
