package ejemplos.rejillacompleja;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class MyButton extends JCheckBox {
	private String cadena;

	public MyButton(String cadena) {
		super();
		setText("Abrir");
//		setEditable(false);
		setBackground(Color.DARK_GRAY);
		this.cadena = cadena;
		addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				super.mousePressed(e);
				actionPropia(cadena);
			}
		});
	}

	private void actionPropia(String cadena) {
		System.out.println("enfocando");
		JDialog jDialog = new JDialog();
		jDialog.add(new JLabel(cadena));
		JButton boton = new JButton("salir");
		boton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				jDialog.setVisible(false);

			}
		});
		jDialog.add(boton);
		jDialog.pack();
		jDialog.setVisible(true);
	}
}
