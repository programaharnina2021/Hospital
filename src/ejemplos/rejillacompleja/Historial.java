package ejemplos.rejillacompleja;


import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

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

public class Historial extends JPanel {
	private JTable tableConsultas;
	private JTable tableTratamiento;

	/**
	 * Create the panel.
	 */
	public Historial(String nombresColumnas[], String data[][], String observaciones[]) {
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
		tableConsultas.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				JTable table=((JTable)e.getSource());
				int selectedRow = table.getSelectedRow();
				new MiDialogo(observaciones[selectedRow]);
			}
		});
		add(scrollPane);
	}

}
