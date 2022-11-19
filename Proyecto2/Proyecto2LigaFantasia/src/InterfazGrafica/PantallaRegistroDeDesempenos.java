package InterfazGrafica;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

import Clases.DesempenioPartido;
import Clases.Partido;

import javax.swing.JLabel;
import java.awt.Font;
import java.util.LinkedList;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JTable;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.awt.event.ActionEvent;

public class PantallaRegistroDeDesempenos extends JFrame {

	
	LinkedList<DesempenioPartido> desempenos = new LinkedList<>();
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	protected static final Partido P = null;
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
	private JTextField textFieldPosicion; 


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
		btnCargarArchivo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
			JFileChooser seleccionarArchivo = new JFileChooser();
			FileNameExtensionFilter filtro = new FileNameExtensionFilter("Archivos csv","csv");
				
			seleccionarArchivo.setFileFilter(filtro);
				
			int seleccionar = seleccionarArchivo.showOpenDialog(btnCargarArchivo);
				
			if(seleccionar == JFileChooser.APPROVE_OPTION) 
				{
					File archivo = seleccionarArchivo.getSelectedFile();
					cargarArchivo(archivo);		
				}
			}

			
		});
		btnCargarArchivo.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnCargarArchivo.setBounds(95, 368, 293, 31);
		contentPane.add(btnCargarArchivo);
		
		JButton btnGuardar = new JButton("Guardar");
		btnGuardar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				JFileChooser seleccionarArchivo = new JFileChooser();
				FileNameExtensionFilter filtro = new FileNameExtensionFilter("Archivos csv","csv");
				
				seleccionarArchivo.setFileFilter(filtro);
				
				int seleccionar = seleccionarArchivo.showOpenDialog(btnGuardar);
				
				if(seleccionar == JFileChooser.APPROVE_OPTION) 
				{
					
					File archivo = seleccionarArchivo.getSelectedFile();
					guardarArchivo(archivo);		
				}
			}
			
			
			private void guardarArchivo(File archivo) {
				
				FileWriter archive = null;
				PrintWriter pw = null;
				
				try {
					
					archive = new FileWriter(archivo);
					pw = new PrintWriter(archive);
					
					for (DesempenioPartido DP: desempenos) {
						
						String linea = DP.getCantidadMinutosJugados()+","+ DP.getGoles()+ "," + DP.getAutogoles() + "," + DP.getAsistencias() + "," + DP.getGolesRecibidos()+ "," +DP.getPenalesDetenidos()+ "," +DP.getPenalesErrados()+ "," +DP.getTarjetasAmarillas()+ "," + DP.getTarjetasRojas();
						pw.println(linea);
						
					}
					
				} catch(Exception ex){
					
					ex.printStackTrace();
				}
				
				finally {
					try 
					{
						if(archive != null) {
							archive.close();
						}
					} catch(Exception e) {
						
						e.printStackTrace();
					}
					
				}
			
			}
		});
		btnGuardar.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnGuardar.setBounds(467, 368, 293, 31);
		contentPane.add(btnGuardar);
		
		table = new JTable();
		table.setFillsViewportHeight(true);
		table.setBounds(52, 410, 772, 198);
		contentPane.add(table);
		
		JButton btnRegresarMunoRegistros = new JButton("Regresar Menu Registros");
		btnRegresarMunoRegistros.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				PantallaRegistrosAdministrador RA = new PantallaRegistrosAdministrador();
				
				RA.setVisible(true);
			}
		});
		btnRegresarMunoRegistros.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnRegresarMunoRegistros.setBounds(297, 619, 293, 31);
		contentPane.add(btnRegresarMunoRegistros);
		
		JButton btnCrear = new JButton("Crear");
		btnCrear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				DesempenioPartido DP = new DesempenioPartido();
				DP.setId(desempenos.size());
				DP.setNombre(textFieldJugador.getText());
				DP.setEquipo(textFieldEquipo.getText());
				DP.setPosicion(textFieldPosicion.getText());
				DP.setCantidadMinutosJugados(textFieldMinutosJugados.getText());
				DP.setGoles(textFieldGoles.getText());
				DP.setAutogoles(textFieldAutogoles.getText());
				DP.setAsistencias(textFieldAsistencias.getText());
				DP.setGolesRecibidos(textFieldGolesRecibidos.getText());
				DP.setPenalesDetenidos(textFieldPenalesDetenidos.getText());
				DP.setPenalesErrados(textFieldPenalesErrados.getText());
				DP.setTarjetasAmarillas(textFieldTA.getText());
				DP.setTarjetasRojas(textFieldTR.getText());
				DP.setPuntaje(textFieldPuntaje.getText());
				
				desempenos.add(DP);
				
				textFieldJugador.setText("");
				textFieldEquipo.setText("");
				textFieldPosicion.setText("");
				textFieldMinutosJugados.setText("");
				textFieldGoles.setText("");
				textFieldAutogoles.setText("");
				textFieldAsistencias.setText("");
				textFieldGolesRecibidos.setText("");
				textFieldPenalesDetenidos.setText("");
				textFieldPenalesErrados.setText("");
				textFieldTA.setText("");
				textFieldTR.setText("");
				textFieldPuntaje.setText("");
				
				llenarTabla();
				
			}
			
		});
		btnCrear.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnCrear.setBounds(640, 284, 158, 31);
		contentPane.add(btnCrear);
		
		JLabel lblPosicion = new JLabel("Posicion");
		lblPosicion.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblPosicion.setBounds(174, 274, 106, 20);
		contentPane.add(lblPosicion);
		
		textFieldPosicion = new JTextField();
		textFieldPosicion.setColumns(10);
		textFieldPosicion.setBounds(275, 278, 146, 20);
		contentPane.add(textFieldPosicion);
	}
	
	private void llenarTabla() {
		
		DefaultTableModel MD = new DefaultTableModel(new String[]{"Nombre", "Equipo", "Posicion", "CantidadMinutosJugados" , "Goles" , "Autogoles", "Asistencias", "GolesRecibidos", "PenalesDetenidos", "PenalesErrados", "TarjetasAmarillas", "TarjetasRojas", "Puntaje"}, desempenos.size());
		
		table.setModel(MD);
		
		TableModel TM = table.getModel();
		
		for(int i = 0; i<desempenos.size();i++){
			
			DesempenioPartido DP = desempenos.get(i);

			TM.setValueAt(DP.getNombre(), i, 1);
			TM.setValueAt(DP.getEquipo(), i, 2);
			TM.setValueAt(DP.getPosicion(), i, 3);
			TM.setValueAt(DP.getCantidadMinutosJugados(), i, 4);
			TM.setValueAt(DP.getGoles(), i, 5);
			TM.setValueAt(DP.getAutogoles(), i, 6);
			TM.setValueAt(DP.getAsistencias(), i, 7);
			TM.setValueAt(DP.getGolesRecibidos(), i, 8);
			TM.setValueAt(DP.getPenalesDetenidos(), i, 9);
			TM.setValueAt(DP.getPenalesErrados(), i, 10);
			TM.setValueAt(DP.getTarjetasAmarillas(), i, 11);
			TM.setValueAt(DP.getTarjetasRojas(), i, 12);
			TM.setValueAt(DP.getPuntaje(), i, 13);
			
		}
		
	}
	
	private void cargarArchivo(File archivo) {
		FileReader fr = null;
		BufferedReader br = null;
		
	
		try {
			
			fr = new FileReader(archivo);
			br = new BufferedReader(fr);
			
			String linea;
			
			while ((linea=br.readLine()) !=null) {
				
				String arreglo []= linea.split(",");
				
				if(arreglo.length == 15)
				{
					DesempenioPartido DP = new DesempenioPartido();
					
					
					DP.setId(Integer.parseInt(arreglo[0]));
					DP.setNombre(arreglo[1]);
					DP.setEquipo(arreglo[2]);
					DP.setCantidadMinutosJugados(arreglo[3]);
					DP.setGoles(arreglo[4]);
					DP.setAutogoles(arreglo[5]);
					DP.setAsistencias(arreglo[6]);
					DP.setGolesRecibidos(arreglo[7]);
					DP.setPenalesDetenidos(arreglo[8]);
					DP.setPenalesErrados(arreglo[9]);
					DP.setTarjetasAmarillas(arreglo[10]);
					DP.setTarjetasRojas(arreglo[11]);
					DP.setPuntaje(arreglo[12]);
					
					desempenos.add(DP);
					
				}
			}
			
			llenarTabla();
			
		} 
		
		catch(Exception ex) 
		{
			ex.printStackTrace();
		}
		
		finally {
			try {
				if( fr != null) {
					fr.close();
				}
				
			}
			catch(Exception ex) {
				
				ex.printStackTrace();	
			}
		}
	}
}

	
