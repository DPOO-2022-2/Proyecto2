package InterfazGrafica;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JFileChooser;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;

import Clases.DesempenioPartido;

import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JTable;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class PantallaRegistrarResultados extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textFieldEquipoLocal;
	private JTextField textFieldMarcadoEquipoLocal;
	private JTextField textFieldEquipoVisitante;
	private JTextField textFieldMarcadorEquipoVisitante;
	private JTextField textFieldFechaPartido;
	private JTable table;

	/**
	 * Create the frame.
	 */
	public PantallaRegistrarResultados() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 900, 700);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(192, 192, 192));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblRegistroDeResultados = new JLabel("REGISTRO DE RESULTADOS");
		lblRegistroDeResultados.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblRegistroDeResultados.setBounds(269, 42, 393, 37);
		contentPane.add(lblRegistroDeResultados);
		
		textFieldEquipoLocal = new JTextField();
		textFieldEquipoLocal.setBounds(230, 145, 203, 20);
		contentPane.add(textFieldEquipoLocal);
		textFieldEquipoLocal.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Equipo Local");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel.setBounds(93, 141, 127, 20);
		contentPane.add(lblNewLabel);
		
		JLabel lblMarcadorEquipoLocal = new JLabel("Marcador Equipo Local");
		lblMarcadorEquipoLocal.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblMarcadorEquipoLocal.setBounds(480, 141, 203, 20);
		contentPane.add(lblMarcadorEquipoLocal);
		
		textFieldMarcadoEquipoLocal = new JTextField();
		textFieldMarcadoEquipoLocal.setColumns(10);
		textFieldMarcadoEquipoLocal.setBounds(714, 145, 105, 20);
		contentPane.add(textFieldMarcadoEquipoLocal);
		
		JLabel lblEquipoVisitante = new JLabel("Equipo Visitante");
		lblEquipoVisitante.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblEquipoVisitante.setBounds(62, 172, 158, 20);
		contentPane.add(lblEquipoVisitante);
		
		textFieldEquipoVisitante = new JTextField();
		textFieldEquipoVisitante.setColumns(10);
		textFieldEquipoVisitante.setBounds(230, 176, 203, 20);
		contentPane.add(textFieldEquipoVisitante);
		
		JLabel lblMarcadorEquipoVisitante = new JLabel("Marcador Equipo Visitante");
		lblMarcadorEquipoVisitante.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblMarcadorEquipoVisitante.setBounds(451, 176, 232, 20);
		contentPane.add(lblMarcadorEquipoVisitante);
		
		textFieldMarcadorEquipoVisitante = new JTextField();
		textFieldMarcadorEquipoVisitante.setColumns(10);
		textFieldMarcadorEquipoVisitante.setBounds(714, 176, 105, 20);
		contentPane.add(textFieldMarcadorEquipoVisitante);
		
		JLabel lblFechaPartidos = new JLabel("Fecha Partido (DD/MM/AA)");
		lblFechaPartidos.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblFechaPartidos.setBounds(203, 110, 274, 20);
		contentPane.add(lblFechaPartidos);
		
		textFieldFechaPartido = new JTextField();
		textFieldFechaPartido.setColumns(10);
		textFieldFechaPartido.setBounds(480, 110, 203, 20);
		contentPane.add(textFieldFechaPartido);
		
		JLabel lblCargarDesempenos = new JLabel(" Desempeños De Jugadores ");
		lblCargarDesempenos.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblCargarDesempenos.setBounds(314, 218, 274, 31);
		contentPane.add(lblCargarDesempenos);
		
		table = new JTable();
		table.setBounds(62, 302, 772, 276);
		contentPane.add(table);
		
		JButton btnGuardar = new JButton("Guardar");
		btnGuardar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				JFileChooser seleccionarArchivo = new JFileChooser();
				FileNameExtensionFilter filtro = new FileNameExtensionFilter("Archivos csv","csv");
				
				seleccionarArchivo.setFileFilter(filtro);
				
				int seleccionar = seleccionarArchivo.showOpenDialog(this);
				
				if(seleccionar == JFileChooser.APPROVE_OPTION) 
				{
					
					File archivo = new seleccionarArchivo.getSelectedFile();
					guardarArchivo(archivo);		
				}
			}

			private void guardarArchivo(File archivo) {
				
				FileWriter archive = null;
				PrintWriter pw = null;
				
				try {
					
					archive = new FileWriter(archivo);
					pw = new PrintWriter(archive);
					
					for (DesempenioPartido DP: desempeno) {
						
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
		btnGuardar.setBounds(492, 260, 293, 31);
		contentPane.add(btnGuardar);
		
		JButton btnCargarArchivo = new JButton("Cargar Archivo csv");
		btnCargarArchivo.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			
			JFileChooser seleccionarArchivo = new JFileChooser();
			FileNameExtensionFilter filtro = new FileNameExtensionFilter("Archivos csv","csv");
			
			seleccionarArchivo.setFileFilter(filtro);
			
			int seleccionar = seleccionarArchivo.showOpenDialog(this);
			
			if(seleccionar == JFileChooser.APPROVE_OPTION) 
			{
				
				File archivo = new seleccionarArchivo.getSelectedFile();
				cargarArchivo(archivo);		
			}
			}
		});
		btnCargarArchivo.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnCargarArchivo.setBounds(110, 260, 293, 31);
		contentPane.add(btnCargarArchivo);
		
		JButton btnRegresarMenuRegistros = new JButton("Regresar Menu Registros");
		btnRegresarMenuRegistros.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				PantallaRegistrosAdministrador r = new PantallaRegistrosAdministrador();
				r.setVisible(true);
			}
		});
		btnRegresarMenuRegistros.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnRegresarMenuRegistros.setBounds(314, 602, 293, 31);
		contentPane.add(btnRegresarMenuRegistros);
		}
		
		public void cargarArchivo(File archivo) {
			
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
						
						DP.setCantidadMinutosJugados(Integer.parseInt(arreglo[0]));
						DP.setGoles(Integer.parseInt(arreglo[1]));
						DP.setAutogoles(Integer.parseInt(arreglo[2]));
						DP.setAsistencias(Integer.parseInt(arreglo[3]));
						DP.setGolesRecibidos(Integer.parseInt(arreglo[4]));
						DP.setPenalesDetenidos(Integer.parseInt(arreglo[5]));
						DP.setPenalesErrados(Integer.parseInt(arreglo[6]));
						DP.setTarjetasAmarillas(Integer.parseInt(arreglo[7]));
						DP.setTarjetasRojas(Integer.parseInt(arreglo[8]));
						DP.setPuntaje(Integer.parseInt(arreglo[9]));
						
						DesempenioPartido.add(DP);
						
						
						
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
	
	
		
	private void llenarTabla() {
		DefaultTableModel modelo = new DefaultTableModel(new String[]{"CantidadMinutosJugados" , "Goles" , "Autogoles", "Asistencias", "GolesRecibidos", "PenalesDetenidos", "PenalesErrados", "TarjetasAmarillas", "TarjetasRojas", "Puntaje", "PuntajeDesenpenio"}, defaultCloseOperation);
		
	}
}
