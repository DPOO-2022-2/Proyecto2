package InterfazGrafica;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Canvas;
import java.awt.Color;

public class PantallaInicialUsuario extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	

	/**
	 * Create the frame.
	 */
	public PantallaInicialUsuario() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 900, 700);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(192, 192, 192));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("USUARIO");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblNewLabel.setBounds(271, 39, 359, 34);
		contentPane.add(lblNewLabel);
		
		JButton btnEquipos = new JButton("Equipo");
		btnEquipos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				PantallaEquiposUsuario EE = new PantallaEquiposUsuario();
				EE.setVisible(true);
			}
		});
		 
		btnEquipos.setFont(new Font("Tahoma", Font.PLAIN, 40));
		btnEquipos.setBounds(239, 144, 392, 132);
		contentPane.add(btnEquipos);
		
		JButton btnLiga = new JButton("Liga");
		btnLiga.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				PantallaLigaUsuario LU = new PantallaLigaUsuario();
				LU.setVisible(true);
			}
		});
		btnLiga.setFont(new Font("Tahoma", Font.PLAIN, 40));
		btnLiga.setBounds(239, 360, 392, 132);
		contentPane.add(btnLiga);
		
		Canvas canvas = new Canvas();
		canvas.setBounds(154, 10, 94, 74);
		contentPane.add(canvas);
		
	}
}
