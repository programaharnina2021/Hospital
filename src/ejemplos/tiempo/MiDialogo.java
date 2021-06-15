package ejemplos.tiempo;

import javax.swing.JDialog;
import java.awt.Panel;
import java.awt.BorderLayout;
import java.awt.Font;

import javax.swing.BoxLayout;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.time.LocalDate;
import java.time.LocalTime;
import java.awt.event.ActionEvent;

public class MiDialogo extends JDialog {
	private JSpinner[] spinners;
	private JButton btnNewButton;

	/**
	 * @wbp.parser.constructor
	 */
	private MiDialogo(Intervalo... intervalos) {
		Panel panel = new Panel();
		getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(new BoxLayout(panel, BoxLayout.X_AXIS));
		btnNewButton = new JButton("Aplicar");
		getContentPane().add(btnNewButton, BorderLayout.SOUTH);
		spinners = new JSpinner[intervalos.length];
		for (int i = 0; i < intervalos.length; i++) {
			SpinnerNumberModel miModelo=new SpinnerNumberModel(intervalos[i].getMin(), intervalos[i].getMin(), intervalos[i].getMax(), 1);
			spinners[i]=new JSpinner(miModelo);
			spinners[i].setName(intervalos[i].getNombre());
			spinners[i].setFont(new Font("Tahoma", Font.PLAIN, 25));
			panel.add(spinners[i]);
		}		
	}
	
	public MiDialogo(LocalTime time,Intervalo... intervalos) {
		this(intervalos);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				time.of((int)spinners[0].getValue(),(int)spinners[1].getValue());
				System.out.println("ya");
			}
		});
	}
	public MiDialogo(LocalDate date,Intervalo... intervalos) {
		this(intervalos);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				date.of((int)spinners[2].getValue(),(int)spinners[1].getValue(),(int)spinners[0].getValue());
				System.out.println("ya");
			}
		});
		
		
	}

}
