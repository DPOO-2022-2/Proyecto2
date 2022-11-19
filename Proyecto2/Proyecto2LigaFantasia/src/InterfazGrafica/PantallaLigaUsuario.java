package InterfazGrafica;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Clases.Usuario;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
public class PantallaLigaUsuario extends JFrame {

	private JPanel contentPane;
	public PantallaLigaUsuario() {

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 900, 700);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(192, 192, 192));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lbMenuequipoUs = new JLabel("MENU OPCIONES DE USUARIO - Liga");
		lbMenuequipoUs.setBounds(170, 36, 566, 37);
		lbMenuequipoUs.setFont(new Font("Tahoma", Font.PLAIN, 30));
		contentPane.add(lbMenuequipoUs);
		
		JButton btncrearequip = new JButton("Rankings");
		btncrearequip.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				PantallaRankings EJ = new PantallaRankings();
				EJ.setVisible(true);
			}
		});
		btncrearequip.setFont(new Font("Tahoma", Font.PLAIN, 40));
		btncrearequip.setBounds(201, 397, 464, 94);
		contentPane.add(btncrearequip);
		
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

