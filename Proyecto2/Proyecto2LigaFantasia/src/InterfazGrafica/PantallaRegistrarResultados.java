package InterfazGrafica;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JFileChooser;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JTable;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.awt.event.ActionEvent;

public class PantallaRegistrarResultados extends JFrame {

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
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblRegistroDeResultados = new JLabel("REGISTRO DE RESULTADOS");
		lblRegistroDeResultados.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblRegistroDeResultados.setBounds(269, 42, 393, 37);
		contentPane.add(lblRegistroDeResultados);
		
		textFieldEquipoLocal = new JTextField();
		textFieldEquipoLocal.setBounds(231, 202, 203, 20);
		contentPane.add(textFieldEquipoLocal);
		textFieldEquipoLocal.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Equipo Local");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel.setBounds(94, 198, 127, 20);
		contentPane.add(lblNewLabel);
		
		JLabel lblMarcadorEquipoLocal = new JLabel("Marcador Equipo Local");
		lblMarcadorEquipoLocal.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblMarcadorEquipoLocal.setBounds(480, 202, 203, 20);
		contentPane.add(lblMarcadorEquipoLocal);
		
		textFieldMarcadoEquipoLocal = new JTextField();
		textFieldMarcadoEquipoLocal.setColumns(10);
		textFieldMarcadoEquipoLocal.setBounds(714, 202, 105, 20);
		contentPane.add(textFieldMarcadoEquipoLocal);
		
		JLabel lblEquipoVisitante = new JLabel("Equipo Visitante");
		lblEquipoVisitante.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblEquipoVisitante.setBounds(67, 240, 158, 20);
		contentPane.add(lblEquipoVisitante);
		
		textFieldEquipoVisitante = new JTextField();
		textFieldEquipoVisitante.setColumns(10);
		textFieldEquipoVisitante.setBounds(231, 244, 203, 20);
		contentPane.add(textFieldEquipoVisitante);
		
		JLabel lblMarcadorEquipoVisitante = new JLabel("Marcador Equipo Visitante");
		lblMarcadorEquipoVisitante.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblMarcadorEquipoVisitante.setBounds(451, 244, 232, 20);
		contentPane.add(lblMarcadorEquipoVisitante);
		
		textFieldMarcadorEquipoVisitante = new JTextField();
		textFieldMarcadorEquipoVisitante.setColumns(10);
		textFieldMarcadorEquipoVisitante.setBounds(714, 244, 105, 20);
		contentPane.add(textFieldMarcadorEquipoVisitante);
		
		JLabel lblFechaPartidos = new JLabel("Fecha Partido (DD/MM/AA)");
		lblFechaPartidos.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblFechaPartidos.setBounds(202, 132, 274, 20);
		contentPane.add(lblFechaPartidos);
		
		textFieldFechaPartido = new JTextField();
		textFieldFechaPartido.setColumns(10);
		textFieldFechaPartido.setBounds(480, 132, 203, 20);
		contentPane.add(textFieldFechaPartido);
		
		JLabel lblCargarDesempenos = new JLabel(" Desempeños De Jugadores ");
		lblCargarDesempenos.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblCargarDesempenos.setBounds(303, 285, 274, 31);
		contentPane.add(lblCargarDesempenos);
		
		table = new JTable();
		table.setBounds(67, 374, 772, 276);
		contentPane.add(table);
		
		JButton btnCargarArchivocsv = new JButton("Cargar Archivo Csv");
		btnCargarArchivocsv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				JFileChooser seleccionarArchivo = new JFileChooser();
				FileNameExtensionFilter filtro = new FileNameExtensionFilter("Archivos csv","csv");
				
				seleccionarArchivo.setFileFilter(filtro);
				
				int seleccionar = seleccionarArchivo.showOpenDialog(this);
				
				if(seleccionar == JFileChooser.APPROVE_OPTION) {
					
					File archivo = new seleccionarArchivo.getSelectedFile();
					cargarArchivo(archivo);
					
					
					
				}
			}
		});
		
		public void cargarArchivo(File archivo) {
			
			FileReader fr = null;
			BufferedReader br = null;
			
			try {
				
				fr = new FileReader(archivo);
				br = new BufferedReader(fr);
				
				String linea;
				
				while ((linea=br.readLine()) !=null) {
					
					
					String arreglo []= linea.split(",");
					
					if(arreglo.lengh == 15)
					{
						
						u
						
						
					}
				}
				
				
			} 
			
			catch(Exception ex) 
			
			{
				
				
				
			}
			
		}
		
		
		
		
		btnCargarArchivocsv.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnCargarArchivocsv.setBounds(158, 327, 246, 37);
		contentPane.add(btnCargarArchivocsv);
		
		JButton btnGuardar = new JButton("Guardar");
		btnGuardar.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnGuardar.setBounds(473, 327, 246, 37);
		contentPane.add(btnGuardar);
	}
}
