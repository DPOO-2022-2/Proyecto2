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

public class CreacionUsuario extends JFrame {

	private static final long serialVersionUID = 1L;
	private JFrame frame;
	private JPanel contentPane;
	private JTextField textFieldUsuarioNuevo;
	private JPasswordField passwordFieldContrasenaNueva;

	
	public CreacionUsuario() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 400);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(192, 192, 192));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lbCreacionNuevoUsuario = new JLabel("Creacion nuevo usuario");
		lbCreacionNuevoUsuario.setBounds(161, 22, 251, 29);
		lbCreacionNuevoUsuario.setFont(new Font("Tahoma", Font.PLAIN, 24));
		contentPane.add(lbCreacionNuevoUsuario);
		
		JLabel lbUsuario = new JLabel("Usuario:");
		lbUsuario.setFont(new Font("Tahoma", Font.PLAIN, 24));
		lbUsuario.setBounds(121, 98, 96, 41);
		contentPane.add(lbUsuario);
		
		JLabel lbContrasena = new JLabel("Contraseña:");
		lbContrasena.setFont(new Font("Tahoma", Font.PLAIN, 24));
		lbContrasena.setBounds(89, 161, 128, 41);
		contentPane.add(lbContrasena);
		
		textFieldUsuarioNuevo = new JTextField();
		textFieldUsuarioNuevo.setColumns(10);
		textFieldUsuarioNuevo.setBounds(227, 110, 285, 29);
		contentPane.add(textFieldUsuarioNuevo);
		
		passwordFieldContrasenaNueva = new JPasswordField();
		passwordFieldContrasenaNueva.setBounds(227, 168, 285, 29);
		contentPane.add(passwordFieldContrasenaNueva);
		
		JButton btnCrear = new JButton("Crear");
		btnCrear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String usuario = textFieldUsuarioNuevo.getText();
				String contrasena = passwordFieldContrasenaNueva.getText();
				
				Usuario UsuarioNuevo = new Usuario();
				UsuarioNuevo.setNombreUsuario(usuario);
				UsuarioNuevo.setContrasena(contrasena);
				
				Main.usuarios.add(UsuarioNuevo);
				
				textFieldUsuarioNuevo.setText("");
				passwordFieldContrasenaNueva.setText("");
				
				JOptionPane.showMessageDialog(frame, "Usuario creado con exito");
				
				
				
			}
		});
		btnCrear.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnCrear.setBounds(343, 250, 169, 47);
		contentPane.add(btnCrear);
		
		JButton btnRegresar = new JButton("Regresar");
		btnRegresar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 
				 PantallaLogIn pantalla = new PantallaLogIn();
				 pantalla.setVisible(true);
						 
			}
		});
		btnRegresar.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnRegresar.setBounds(89, 250, 169, 47);
		contentPane.add(btnRegresar);
	}

}
