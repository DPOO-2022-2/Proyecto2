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

public class PantallaRegistroDeDesempenos extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldJugador;
	private JTextField textFieldEquipo;
	private JTextField textFieldMinutosJugados;
	private JTextField textFieldGoles;
	private JTextField textFieldAutogoles;
	private JTextField textFieldAsistencias;
	private JTextField textFieldGolesRecibidos;
	private JTextField textFieldPenalesDetenidos;
	private JTextField textFieldPenalesErrados;
	private JTextField textFieldTA;
	private JTextField textFieldTR;
	private JTextField textFieldPuntaje;
	private JTable table;


	/**
	 * Create the frame.
	 */
	public PantallaRegistroDeDesempenos() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 900, 700);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(192, 192, 192));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblRegistroDeDesempenos = new JLabel("REGISTRO DE DESEMPENOS");
		lblRegistroDeDesempenos.setBounds(260, 22, 396, 37);
		lblRegistroDeDesempenos.setFont(new Font("Tahoma", Font.PLAIN, 30));
		contentPane.add(lblRegistroDeDesempenos);
		
		JLabel lblNombreJugador = new JLabel("Nombre Jugador");
		lblNombreJugador.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNombreJugador.setBounds(93, 81, 153, 30);
		contentPane.add(lblNombreJugador);
		
		JLabel lblEquipo = new JLabel("Equipo");
		lblEquipo.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblEquipo.setBounds(174, 112, 60, 22);
		contentPane.add(lblEquipo);
		
		JLabel lblCantidadDeMinutos = new JLabel(" Minutos Jugados ");
		lblCantidadDeMinutos.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblCantidadDeMinutos.setBounds(80, 145, 170, 25);
		contentPane.add(lblCantidadDeMinutos);
		
		JLabel lblGoles = new JLabel("Goles");
		lblGoles.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblGoles.setBounds(189, 181, 49, 20);
		contentPane.add(lblGoles);
		
		JLabel lblAutoGoles = new JLabel("Auto Goles");
		lblAutoGoles.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblAutoGoles.setBounds(142, 212, 96, 20);
		contentPane.add(lblAutoGoles);
		
		JLabel lblAsistencias = new JLabel("Asistencias");
		lblAsistencias.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblAsistencias.setBounds(141, 243, 106, 20);
		contentPane.add(lblAsistencias);
		
		JLabel lblGolesRecibidos = new JLabel("Goles Recibidos");
		lblGolesRecibidos.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblGolesRecibidos.setBounds(496, 86, 153, 20);
		contentPane.add(lblGolesRecibidos);
		
		JLabel lblPenalesDetenidos = new JLabel("Penales Detenidos");
		lblPenalesDetenidos.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblPenalesDetenidos.setBounds(472, 113, 170, 20);
		contentPane.add(lblPenalesDetenidos);
		
		JLabel lblPenalesErrados = new JLabel("Penales Errados");
		lblPenalesErrados.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblPenalesErrados.setBounds(496, 147, 153, 20);
		contentPane.add(lblPenalesErrados);
		
		JLabel lblTarjetasAmarillas = new JLabel("Tarjetas Amarillas");
		lblTarjetasAmarillas.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblTarjetasAmarillas.setBounds(472, 178, 177, 20);
		contentPane.add(lblTarjetasAmarillas);
		
		JLabel lblTarjetasRojas = new JLabel("Tarjetas Rojas");
		lblTarjetasRojas.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblTarjetasRojas.setBounds(496, 209, 153, 20);
		contentPane.add(lblTarjetasRojas);
		
		JLabel lblPuntaje = new JLabel("Puntaje");
		lblPuntaje.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblPuntaje.setBounds(556, 243, 78, 20);
		contentPane.add(lblPuntaje);
		
		textFieldJugador = new JTextField();
		textFieldJugador.setColumns(10);
		textFieldJugador.setBounds(275, 90, 146, 20);
		contentPane.add(textFieldJugador);
		
		textFieldEquipo = new JTextField();
		textFieldEquipo.setColumns(10);
		textFieldEquipo.setBounds(275, 117, 146, 20);
		contentPane.add(textFieldEquipo);
		
		textFieldMinutosJugados = new JTextField();
		textFieldMinutosJugados.setColumns(10);
		textFieldMinutosJugados.setBounds(275, 151, 146, 20);
		contentPane.add(textFieldMinutosJugados);
		
		textFieldGoles = new JTextField();
		textFieldGoles.setColumns(10);
		textFieldGoles.setBounds(275, 185, 146, 20);
		contentPane.add(textFieldGoles);
		
		textFieldAutogoles = new JTextField();
		textFieldAutogoles.setColumns(10);
		textFieldAutogoles.setBounds(275, 216, 146, 20);
		contentPane.add(textFieldAutogoles);
		
		textFieldAsistencias = new JTextField();
		textFieldAsistencias.setColumns(10);
		textFieldAsistencias.setBounds(275, 247, 146, 20);
		contentPane.add(textFieldAsistencias);
		
		textFieldGolesRecibidos = new JTextField();
		textFieldGolesRecibidos.setColumns(10);
		textFieldGolesRecibidos.setBounds(652, 90, 146, 20);
		contentPane.add(textFieldGolesRecibidos);
		
		textFieldPenalesDetenidos = new JTextField();
		textFieldPenalesDetenidos.setColumns(10);
		textFieldPenalesDetenidos.setBounds(652, 117, 146, 20);
		contentPane.add(textFieldPenalesDetenidos);
		
		textFieldPenalesErrados = new JTextField();
		textFieldPenalesErrados.setColumns(10);
		textFieldPenalesErrados.setBounds(652, 145, 146, 20);
		contentPane.add(textFieldPenalesErrados);
		
		textFieldTA = new JTextField();
		textFieldTA.setColumns(10);
		textFieldTA.setBounds(652, 178, 146, 20);
		contentPane.add(textFieldTA);
		
		textFieldTR = new JTextField();
		textFieldTR.setColumns(10);
		textFieldTR.setBounds(652, 209, 146, 20);
		contentPane.add(textFieldTR);
		
		textFieldPuntaje = new JTextField();
		textFieldPuntaje.setColumns(10);
		textFieldPuntaje.setBounds(652, 243, 146, 20);
		contentPane.add(textFieldPuntaje);
		
		JLabel lblVistaRegistroDe = new JLabel("Vista Registro de Desempeños");
		lblVistaRegistroDe.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblVistaRegistroDe.setBounds(306, 326, 284, 31);
		contentPane.add(lblVistaRegistroDe);
		
		JButton btnCargarArchivo = new JButton("Cargar Archivo csv");
		btnCargarArchivo.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnCargarArchivo.setBounds(95, 368, 293, 31);
		contentPane.add(btnCargarArchivo);
		
		JButton btnGuardar = new JButton("Guardar");
		btnGuardar.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnGuardar.setBounds(467, 368, 293, 31);
		contentPane.add(btnGuardar);
		
		table = new JTable();
		table.setBounds(52, 410, 772, 198);
		contentPane.add(table);
		
		JButton btnRegresarMunoRegistros = new JButton("Regresar Menu Registros");
		btnRegresarMunoRegistros.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnRegresarMunoRegistros.setBounds(297, 619, 293, 31);
		contentPane.add(btnRegresarMunoRegistros);
		
		JButton btnCrear = new JButton("Crear");
		btnCrear.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnCrear.setBounds(359, 284, 158, 31);
		contentPane.add(btnCrear);
	}
}
