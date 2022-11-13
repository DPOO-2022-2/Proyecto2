package InterfazGrafica;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import Clases.Usuario;

public class PantallaLogIn extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JFrame frame;
	private JPanel contentPane;
	private JTextField textFieldUsuario;
	private JPasswordField passwordFieldContrasena;
	private JButton btnCrearUsuario;

	/**
	 * Create the frame.
	 */
	public PantallaLogIn() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 400);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(192, 192, 192));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Usuario:");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 24));
		lblNewLabel.setBounds(93, 88, 109, 41);
		contentPane.add(lblNewLabel);
		
		JLabel lblContrasena = new JLabel("Contraseña:");
		lblContrasena.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblContrasena.setBounds(58, 151, 134, 41);
		contentPane.add(lblContrasena);
		
		textFieldUsuario = new JTextField();
		textFieldUsuario.setBounds(206, 100, 285, 29);
		contentPane.add(textFieldUsuario);
		textFieldUsuario.setColumns(10);
		
		passwordFieldContrasena = new JPasswordField();
		passwordFieldContrasena.setBounds(206, 158, 285, 29);
		contentPane.add(passwordFieldContrasena);
		
		JButton btnIniciarSesion = new JButton("Iniciar sesion");
		btnIniciarSesion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String usuario = textFieldUsuario.getText();
				@SuppressWarnings("deprecation")
				String contresena = passwordFieldContrasena.getText();
				
				
				if("administrador".equals(usuario) && "administrador".equals(contresena))
				{
									
					PantallaInicialAdministrador pantalla = new PantallaInicialAdministrador();
					pantalla.setVisible(true);
					
					//JOptionPane.showMessageDialog(frame, "Inicio de sesion exitoso");
					
					
				}
				else 
				{
					for(Usuario u: Main.usuarios) 
					{
						if(u.getContrasena().equals(contresena) && u.getNombreUsuario().equals(usuario)) //revisa los usuarios guardados en el array list
						{
							PantallaInicialUsuario pantalla = new PantallaInicialUsuario();
							pantalla.setVisible(true);
							break;
						}
						else 
						{
						JOptionPane.showMessageDialog(frame, "Usuario o contrasena invalidos");
						}
					}
				}
			}		
			}
		);
		btnIniciarSesion.setBounds(315, 239, 176, 41);
		contentPane.add(btnIniciarSesion);
		
		btnCrearUsuario = new JButton("Crear Usuario");
		btnCrearUsuario.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//this.setVisible(false); 
				
				CreacionUsuario crear = new CreacionUsuario();
				crear.setVisible(true);
				
				
			}
		});
		btnCrearUsuario.setBounds(83, 239, 176, 41);
		contentPane.add(btnCrearUsuario);
	}



}

