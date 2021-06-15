package ejemplos.tiempo;

import java.awt.EventQueue;
import java.awt.Font;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ElTiempo extends JFrame {
//	https://docs.oracle.com/javase/tutorial/uiswing/examples/components/index.html#DialogDemo

	private JPanel contentPane;
	private Intervalo dias=new Intervalo(1, 31, "dia");
	private Intervalo meses=new Intervalo(1, 12, "mes");
	private Intervalo annos=new Intervalo(1919, 2100, "año");
	private Intervalo horas=new Intervalo(0, 23, "hora");
	private Intervalo minutos=new Intervalo(0, 59, "minuto");
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ElTiempo frame = new ElTiempo();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public ElTiempo() {
		LocalDate fecha=LocalDate.of(2019,1,1);
		LocalTime hora=LocalTime.of(00, 0);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnTiempo = new JMenu("Tiempo");
		menuBar.add(mnTiempo);
		
		JMenuItem mntmCambiarHora = new JMenuItem("Cambiar Hora");
		mntmCambiarHora.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MiDialogo miDialogo=new MiDialogo(hora,horas,minutos);
				miDialogo.pack();
				miDialogo.setVisible(true);;
			}
		});
		mnTiempo.add(mntmCambiarHora);
		
		JMenuItem mntmCambiarFecha = new JMenuItem("Cambiar Fecha");
		mntmCambiarFecha.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					MiDialogo miDialogo=new MiDialogo(fecha, dias,meses,annos);
					miDialogo.pack();
					miDialogo.setVisible(true);;
			}
		});
		mnTiempo.add(mntmCambiarFecha);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BoxLayout(contentPane, BoxLayout.Y_AXIS));
		
		JLabel lblFecha = new JLabel(" ");
		lblFecha.setFont(new Font("Tahoma", Font.PLAIN, 25));
		contentPane.add(lblFecha);
		
		JLabel lblHora = new JLabel(" ");
		lblHora.setFont(new Font("Tahoma", Font.PLAIN, 25));
		contentPane.add(lblHora);
		lblFecha.setText(fecha.toString());
		lblHora.setText(hora.toString());
	}

}
