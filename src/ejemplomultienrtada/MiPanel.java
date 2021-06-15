package ejemplomultienrtada;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;

public class MiPanel extends JPanel {
	public MiPanel(String... nombre) {
		
		for (int i = 0; i < nombre.length; i++) {
			
			JLabel lblHola = new JLabel("Hola "+nombre[i]);
			lblHola.setFont(new Font("Tahoma", Font.PLAIN, 18));
			add(lblHola);
		}
		
		
	}

}
