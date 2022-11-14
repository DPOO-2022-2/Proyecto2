package InterfazGrafica;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JFileChooser;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

import Clases.Partido;

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
import java.util.LinkedList;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class PantallaRegistrarResultados extends JFrame {
	
	
	LinkedList<Partido> partidos = new LinkedList<>();

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
		lblRegistroDeResultados.setBounds(269, 23, 393, 37);
		contentPane.add(lblRegistroDeResultados);
		
		textFieldEquipoLocal = new JTextField();
		textFieldEquipoLocal.setBounds(230, 119, 203, 20);
		contentPane.add(textFieldEquipoLocal);
		textFieldEquipoLocal.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Equipo Local");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel.setBounds(93, 115, 127, 20);
		contentPane.add(lblNewLabel);
		
		JLabel lblMarcadorEquipoLocal = new JLabel("Marcador Equipo Local");
		lblMarcadorEquipoLocal.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblMarcadorEquipoLocal.setBounds(480, 115, 203, 20);
		contentPane.add(lblMarcadorEquipoLocal);
		
		textFieldMarcadoEquipoLocal = new JTextField();
		textFieldMarcadoEquipoLocal.setColumns(10);
		textFieldMarcadoEquipoLocal.setBounds(714, 119, 105, 20);
		contentPane.add(textFieldMarcadoEquipoLocal);
		
		JLabel lblEquipoVisitante = new JLabel("Equipo Visitante");
		lblEquipoVisitante.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblEquipoVisitante.setBounds(62, 146, 158, 20);
		contentPane.add(lblEquipoVisitante);
		
		textFieldEquipoVisitante = new JTextField();
		textFieldEquipoVisitante.setColumns(10);
		textFieldEquipoVisitante.setBounds(230, 150, 203, 20);
		contentPane.add(textFieldEquipoVisitante);
		
		JLabel lblMarcadorEquipoVisitante = new JLabel("Marcador Equipo Visitante");
		lblMarcadorEquipoVisitante.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblMarcadorEquipoVisitante.setBounds(451, 146, 232, 20);
		contentPane.add(lblMarcadorEquipoVisitante);
		
		textFieldMarcadorEquipoVisitante = new JTextField();
		textFieldMarcadorEquipoVisitante.setColumns(10);
		textFieldMarcadorEquipoVisitante.setBounds(714, 150, 105, 20);
		contentPane.add(textFieldMarcadorEquipoVisitante);
		
		JLabel lblFechaPartidos = new JLabel("Fecha Partido (DD/MM/AA)");
		lblFechaPartidos.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblFechaPartidos.setBounds(200, 84, 274, 20);
		contentPane.add(lblFechaPartidos);
		
		textFieldFechaPartido = new JTextField();
		textFieldFechaPartido.setColumns(10);
		textFieldFechaPartido.setBounds(480, 84, 203, 20);
		contentPane.add(textFieldFechaPartido);
		
		JLabel lblCargarDesempenos = new JLabel("Vista Registro de Resultados");
		lblCargarDesempenos.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblCargarDesempenos.setBounds(314, 232, 274, 31);
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
					
					for (Partido P: partidos) {
						
						String linea = P.getId()+","+ P.getEquipo_local() +","+P.getGoles_local() +","+ P.getEquipo_visitante()+","+P.getGoles_visitante();
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
			
			int seleccionar = seleccionarArchivo.showOpenDialog(btnCargarArchivo);
			
			if(seleccionar == JFileChooser.APPROVE_OPTION) 
			{
				
				File archivo = seleccionarArchivo.getSelectedFile();
				cargarArchivo(archivo);		
			}
			}
		});
		btnCargarArchivo.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnCargarArchivo.setBounds(110, 260, 293, 31);
		contentPane.add(btnCargarArchivo);
		
		JButton btnRegresarMenuRegistros = new JButton("Registro de Desempeños");
		btnRegresarMenuRegistros.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				PantallaRegistroDeDesempenos r = new PantallaRegistroDeDesempenos();
				r.setVisible(true);
			}
		});
		btnRegresarMenuRegistros.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnRegresarMenuRegistros.setBounds(314, 602, 293, 31);
		contentPane.add(btnRegresarMenuRegistros);
		
		JButton btnCrear = new JButton("Crear");
		btnCrear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Partido P = new Partido();
				P.setId(partidos.size());
				P.setFecha(textFieldFechaPartido.getText());
				P.setEquipo_local(textFieldEquipoLocal.getText());
				P.setGoles_local(textFieldMarcadoEquipoLocal.getText());
				P.setEquipo_visitante(textFieldEquipoVisitante.getText());
				P.setGoles_visitante(textFieldMarcadorEquipoVisitante.getText());
				
				partidos.add(P);
				
				textFieldFechaPartido.setText("");
				textFieldEquipoLocal.setText("");
				textFieldMarcadoEquipoLocal.setText("");
				textFieldEquipoVisitante.setText("");
				textFieldMarcadorEquipoVisitante.setText("");
				
				llenarTabla();
				
				
			}
		});
		btnCrear.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnCrear.setBounds(370, 190, 158, 31);
		contentPane.add(btnCrear);
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
						Partido P = new Partido();
						
						P.setId(Integer.parseInt(arreglo[0]));
						P.setFecha(arreglo[1]);
						P.setEquipo_local(arreglo[2]);
						P.setGoles_local(arreglo[3]);
						P.setEquipo_visitante(arreglo[4]);
						P.setGoles_visitante(arreglo[5]);
						
						partidos.add(P);
						
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
		DefaultTableModel MD = new DefaultTableModel(new String[]{"Fechas", "Equipo local" , "Marcador Equipo local" , "Equipo Visitante", "Marcador Equipo Visitante"}, partidos.size());
		
		table.setModel(MD);
		
		TableModel TM = table.getModel();
		
		for(int i = 0; i<partidos.size();i++){
			
			Partido P = partidos.get(i);
			TM.setValueAt(P.getFecha(), i, 0);
			TM.setValueAt(P.getEquipo_local(), i, 1);
			TM.setValueAt(P.getGoles_local(), i, 2);
			TM.setValueAt(P.getEquipo_visitante(), i, 3);
			TM.setValueAt(P.getGoles_visitante(), i, 4);
		}
		
	}
}
