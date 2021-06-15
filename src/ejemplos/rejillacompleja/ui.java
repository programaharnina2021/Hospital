package ejemplos.rejillacompleja;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class ui extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ui frame = new ui();
					frame.setVisible(true);
					frame.pack();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public ui() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		String nombresColumnas[]={"Paciente	","tipo","fecha", "medico"};
		String data[][]={{"Gonzalo Berceo, Jonathan","Consulta primaria","16/06/2019","Jovellanos pursuy,Benito"},
				{"Gonzalo Berceo, Jonathan","Consulta primaria","16/06/2019","Jovellanos pursuy,Benito"}};
		String observaciones[]= {"Las observaciones","las ptras"};
		JPanel panel = new Historial(nombresColumnas,data,observaciones);
		contentPane.add(panel, BorderLayout.CENTER);
	}

}
