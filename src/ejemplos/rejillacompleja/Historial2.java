package ejemplos.rejillacompleja;


import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellEditor;
import javax.swing.table.TableColumn;
import javax.swing.BoxLayout;
import javax.swing.DefaultCellEditor;

import java.awt.FlowLayout;

public class Historial2 extends JPanel {
	private JTable tableConsultas;
	private JTable tableTratamiento;

	/**
	 * Create the panel.
	 */
	public Historial2(String nombresColumnas[], String data[][], String observaciones[]) {
		JLabel lblCierreOperaciones = new JLabel("Historial Paciente ");
		lblCierreOperaciones.setFont(new Font("Tahoma", Font.PLAIN, 25));

		JScrollPane scrollPane = new JScrollPane();

		Font font = new Font("Tahoma", Font.PLAIN, 16);
		tableConsultas = new JTable();
		tableConsultas.setFont(font);
		tableConsultas.getTableHeader().setFont(font);
		DefaultTableModel defaultTableModel = new DefaultTableModel(data, nombresColumnas);
		tableConsultas.setModel(defaultTableModel);
		setLayout(new BoxLayout(this, BoxLayout.X_AXIS));
		scrollPane.setViewportView(tableConsultas);

		// TableColumn tc=tableConsultas.getColumnModel().getColumn(4);
		// tc.setCellEditor(new MyEditor(tableConsultas));
		// tc.setCellRenderer(new MyRenderer(true));

		 MyButton boton=new MyButton("el valor que sea");
		 TableCellEditor tce=new DefaultCellEditor(boton);
		 TableColumn tc=tableConsultas.getColumnModel().getColumn(4);
		 tc.setCellEditor(tce);

		// Es igual de complejo
		// https: //
		// foro.elhacker.net/java/colocar_boton_de_modificar_en_celda_de_jtable-t488028.0.html
		// TableColumn tc=tableConsultas.getColumnModel().getColumn(4);
		// BotonRenderizado cellRenderer = new BotonRenderizado();
		// cellRenderer.addActionListener(new ActionListener() {
		//
		// @Override
		// public void actionPerformed(ActionEvent e) {
		// System.out.println("aprentando");
		//
		// }
		// });
		// tc.setCellRenderer(cellRenderer);

		add(scrollPane);
	}

}
