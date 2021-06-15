package ejemplos.rejillacompleja;

import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.AbstractCellEditor;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.TableCellEditor;

public class MyEditor extends AbstractCellEditor implements TableCellEditor, ActionListener {

	Boolean currentValue;
	JButton button;
	protected static final String EDIT = "edit";
	private JTable jTable1;

	public MyEditor(JTable jTable1) {
	        button = new JButton();
	        button.setActionCommand(EDIT);
	        button.addActionListener(this);
	        button.setBorderPainted(false);
	        this.jTable1 = jTable1;
	    }

	@Override
	public Object getCellEditorValue() {
		  return currentValue;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		  // mymodel t = (mymodel) jTable1.getModel();
        // t.addNewRecord();
//        fireEditingStopped();

	}

	@Override
	public Component getTableCellEditorComponent(JTable table, Object value, boolean isSelected, int row, int column) {
		 // Va a mostrar el botón solo en la última fila.
        // de otra forma muestra un espacio en blanco.
		System.out.println(value);
        if (row == table.getModel().getRowCount() - 1) {
            currentValue = (Boolean) value;
            return button;
        }
        return new JLabel();
	}

}
