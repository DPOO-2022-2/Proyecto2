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

public class PantallaInicialAdministrador extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	
	/**
	 * Create the frame.
	 */
	public PantallaInicialAdministrador() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 900, 700);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(192, 192, 192));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lbMenuAdministrador = new JLabel("MENU ADMINISTRADOR");
		lbMenuAdministrador.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lbMenuAdministrador.setBounds(271, 39, 359, 34);
		contentPane.add(lbMenuAdministrador);
		
		JButton btnRegistros = new JButton("Registros");
		btnRegistros.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				PantallaRegistrosAdministrador r = new PantallaRegistrosAdministrador();
				r.setVisible(true);
			}
		});
		btnRegistros.setFont(new Font("Tahoma", Font.PLAIN, 40));
		btnRegistros.setBounds(239, 144, 392, 132);
		contentPane.add(btnRegistros);
		
		JButton btnConfiguracion = new JButton("Configuracion");
		btnConfiguracion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				PantallaConfiguracionAdministrador PCA = new PantallaConfiguracionAdministrador();
				PCA.setVisible(true);
			}
		});
		btnConfiguracion.setFont(new Font("Tahoma", Font.PLAIN, 40));
		btnConfiguracion.setBounds(239, 360, 392, 132);
		contentPane.add(btnConfiguracion);
		
		Canvas canvas = new Canvas();
		canvas.setBounds(154, 10, 94, 74);
		contentPane.add(canvas);
		
		JLabel lblNewLabel = new JLabel("Registro de resultados y nominas");
		lblNewLabel.setBounds(356, 282, 274, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Configuracion de aspectos y Temporada");
		lblNewLabel_1.setBounds(341, 503, 227, 14);
		contentPane.add(lblNewLabel_1);
	}
}
