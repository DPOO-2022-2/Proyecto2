package InterfazGrafica;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

import Clases.DesempenioPartido;
import Clases.Equipo;
import Clases.Temporada;

import javax.swing.JLabel;
import java.awt.Font;
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
import java.util.LinkedList;
import java.awt.event.ActionEvent;

public class PantallaNominasCargarLiga extends JFrame {

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	LinkedList<Equipo> equipos = new LinkedList<>();
	LinkedList<Temporada> temporadas = new LinkedList<>(); 
	private JPanel contentPane;
	private JTextField textFieldNombreLiga;
	private JTable table;


	/**
	 * Create the frame. 
	 */
	public PantallaNominasCargarLiga() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 900, 700);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(192, 192, 192));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblCargarLiga = new JLabel("CARGAR LIGA");
		lblCargarLiga.setBounds(356, 29, 214, 37);
		lblCargarLiga.setFont(new Font("Tahoma", Font.PLAIN, 30));
		contentPane.add(lblCargarLiga);
		
		JLabel lblNombreLiga = new JLabel("Nombre Liga");
		lblNombreLiga.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNombreLiga.setBounds(209, 88, 203, 25);
		contentPane.add(lblNombreLiga);
		
		textFieldNombreLiga = new JTextField();
		textFieldNombreLiga.setColumns(10);
		textFieldNombreLiga.setBounds(379, 94, 298, 20);
		contentPane.add(textFieldNombreLiga);
		
		JButton btnCargarInformacion = new JButton("Cargar Informacion Equipo");
		btnCargarInformacion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				JFileChooser seleccionarArchivo = new JFileChooser();
				FileNameExtensionFilter filtro = new FileNameExtensionFilter("Archivos csv","csv");
					
				seleccionarArchivo.setFileFilter(filtro);
					
				int seleccionar = seleccionarArchivo.showOpenDialog(btnCargarInformacion);
					
				if(seleccionar == JFileChooser.APPROVE_OPTION) 
					{
						File archivo = seleccionarArchivo.getSelectedFile();
						cargarArchivoEquipo(archivo);		
					}
				
				
			}

			private void cargarArchivoEquipo(File archivo) {
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
							Equipo E = new Equipo();
							
							E.setId(arreglo[0]);
							E.setEquipo_real(arreglo[1]);
							E.setJugadores(arreglo[2]);
							E.setNombre(arreglo[3]);
							E.setPresupuesto(arreglo[4]);
							E.setFechas(arreglo[5]);
							
						
							equipos.add(E);			
						}
					}
					
					llenarTablaEquipo();
					
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

			private void llenarTablaEquipo() {
				
				DefaultTableModel MD = new DefaultTableModel(new String[]{"ID", "Equipo", "Jugadores", "Nombre" , "Presupuesto" , "Fechas"}, equipos.size());
				
				table.setModel(MD);
				
				TableModel TM = table.getModel();
				
				for(int i = 0; i<equipos.size();i++){
					
					Equipo E = equipos.get(i);

					TM.setValueAt(E.getId(), i, 1);
					TM.setValueAt(E.getEquipo_real(), i, 2);
					TM.setValueAt(E.getJugadores(), i, 3);
					TM.setValueAt(E.getNombre(), i, 4);
					TM.setValueAt(E.getPresupuesto(), i, 5);
					TM.setValueAt(E.getFechas(), i, 5);
					
				}
				
			}
		});
		
		btnCargarInformacion.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnCargarInformacion.setBounds(64, 135, 368, 23);
		contentPane.add(btnCargarInformacion);
		
		table = new JTable();
		table.setBounds(64, 169, 787, 381);
		contentPane.add(table);
		
		JButton btnRegresarMenuRegistro = new JButton("Regresar Menu Registro de Nominas");
		btnRegresarMenuRegistro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				PantallaRegistroNominas RN = new PantallaRegistroNominas();
				RN.setVisible(true);
			}
		});
		
		btnRegresarMenuRegistro.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnRegresarMenuRegistro.setBounds(266, 605, 395, 31);
		contentPane.add(btnRegresarMenuRegistro);
		
		JButton btnCargarInformacionLiga = new JButton("Cargar Informacion Liga");
		btnCargarInformacionLiga.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				JFileChooser seleccionarArchivo = new JFileChooser();
				FileNameExtensionFilter filtro = new FileNameExtensionFilter("Archivos csv","csv");
					
				seleccionarArchivo.setFileFilter(filtro);
					
				int seleccionar = seleccionarArchivo.showOpenDialog(btnCargarInformacion);
					
				if(seleccionar == JFileChooser.APPROVE_OPTION) 
					{
						File archivo = seleccionarArchivo.getSelectedFile();
						cargarArchivoLiga(archivo);		
					}
				
			}

			private void cargarArchivoLiga(File archivo) {
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
							Temporada t = new Temporada();
							
							
							t.setId(Integer.parseInt(arreglo[0]));
							t.setEquipos(arreglo[1]);
							t.setFechas(arreglo[2]);
							t.setTemporada_activa(arreglo[3]);
							
							
							Temporada.add(t);
							
						}
					}
					
					llenarTablaLiga();
					
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

			private void llenarTablaLiga() {
				
				DefaultTableModel MD = new DefaultTableModel(new String[]{"ID", "Fechas", "Temporada Activa", "Equipo"}, temporadas.size());
				table.setModel(MD);
				
				TableModel TM = table.getModel();
				
				for(int i = 0; i<temporadas.size();i++){
					
					DesempenioPartido t = temporadas.get(i);

					TM.setValueAt(t.getId(), i, 1);
					TM.setValueAt(t.getEquipos(), i, 2);
					TM.setValueAt(t.getFechas(), i, 3);
					TM.setValueAt(t.getTemporada_activa(), i, 4);
					
				
			
				}
				
			}
		});
		btnCargarInformacionLiga.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnCargarInformacionLiga.setBounds(442, 135, 368, 23);
		contentPane.add(btnCargarInformacionLiga);
		
		JButton btnGuardar = new JButton("Guardar temporada");
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
					
					for (Temporada t: temporadas) {
						
						String linea = t.getId()+","+ t.getFechas()+ "," + t.getTemporada_activa() + "," + t.getEquipos();
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
		btnGuardar.setBounds(462, 561, 368, 23);
		contentPane.add(btnGuardar);
		
		JButton btnGuardarEquipo = new JButton("Guardar Equipo");
		btnGuardarEquipo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				JFileChooser seleccionarArchivo = new JFileChooser();
				FileNameExtensionFilter filtro = new FileNameExtensionFilter("Archivos csv","csv");
				
				seleccionarArchivo.setFileFilter(filtro);
				
				int seleccionar = seleccionarArchivo.showOpenDialog(btnGuardar);
				
				if(seleccionar == JFileChooser.APPROVE_OPTION) 
				{
					
					File archivo = seleccionarArchivo.getSelectedFile();
					guardarArchivoEquipo(archivo);		
				}
			}
			
			
			private void guardarArchivoEquipo(File archivo) {
				
				FileWriter archive = null;
				PrintWriter pw = null;
				
				try {
					
					archive = new FileWriter(archivo);
					pw = new PrintWriter(archive);
					
					for (Equipo e: equipos) {
						
						String linea = e.getId()+","+ e.getEquipo_real + "," + e.getJugadores() + "," + e.getNombre() + "," + e.getPresupuesto() + "," + e.getFechas();
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
		btnGuardarEquipo.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnGuardarEquipo.setBounds(84, 561, 368, 23);
		contentPane.add(btnGuardarEquipo);
	}


	

}
