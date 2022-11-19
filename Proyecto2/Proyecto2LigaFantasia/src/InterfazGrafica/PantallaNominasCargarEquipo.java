package InterfazGrafica;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

import Clases.Equipo;
import Clases.Partido;

import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JTable;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.LinkedList;
import java.awt.event.ActionEvent;

public class PantallaNominasCargarEquipo extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JTable table;

	LinkedList<Equipo> equipos = new LinkedList<>();
	/**
	 * Create the frame.
	 */
	public PantallaNominasCargarEquipo() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 900, 700);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(192, 192, 192));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblCargarEquipo = new JLabel("CARGAR EQUIPO"); 
		lblCargarEquipo.setBounds(327, 33, 252, 37);
		lblCargarEquipo.setFont(new Font("Tahoma", Font.PLAIN, 30));
		contentPane.add(lblCargarEquipo);
		
		JLabel lblNombreEquipo = new JLabel("Nombre Equipo Real");
		lblNombreEquipo.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNombreEquipo.setBounds(211, 91, 203, 20);
		contentPane.add(lblNombreEquipo); 
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(424, 95, 298, 20);
		contentPane.add(textField);
		
		JButton btnCargarInformacion = new JButton("Cargar Informacion");
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
							
					//		E.setId(Integer.parseInt(arreglo[0]));
					//		E.setEquipo_real(arreglo[1]);
					//		E.setJugadores(arreglo[2]);
					//		E.setNombre(arreglo[3]);
					//		E.setPresupuesto(arreglo[4]);
					//		E.setFechas(arreglo[5]);
							
							
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
				//	TM.setValueAt(E.getEquipo_real(), i, 2);
					TM.setValueAt(E.getJugadores(), i, 3);
					TM.setValueAt(E.getNombre(), i, 4);
					TM.setValueAt(E.getPresupuesto(), i, 5);
					TM.setValueAt(E.getFechas(), i, 5);
				}
				
			}
		});
		btnCargarInformacion.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnCargarInformacion.setBounds(107, 138, 368, 23);
		contentPane.add(btnCargarInformacion);
		
		table = new JTable();
		table.setBounds(58, 172, 787, 425);
		contentPane.add(table);
		
		JButton btnRegresarMenuRegistro = new JButton("Regresar Menu Registro de Nominas");
		btnRegresarMenuRegistro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				PantallaRegistroNominas RN = new PantallaRegistroNominas();
				RN.setVisible(true);
			}
		});
		btnRegresarMenuRegistro.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnRegresarMenuRegistro.setBounds(263, 608, 395, 31);
		contentPane.add(btnRegresarMenuRegistro);
		
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
		btnGuardar.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnGuardar.setBounds(532, 134, 293, 31);
		contentPane.add(btnGuardar);
	}
}
