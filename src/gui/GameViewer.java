package gui;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;

public class GameViewer extends JPanel {
	
	WindowFrame frame;
	
	public GameViewer(WindowFrame frame){
		this.frame =frame;
		
		DefaultTableModel model = new DefaultTableModel();
		model.addColumn("Name");
		model.addColumn("Type");
		model.addColumn("Playtime");
		model.addColumn("Distributor");
		model.addColumn("Price");
		
		JTable table = new JTable(model);
		JScrollPane sp = new JScrollPane(table);
		
		this.add(sp);
		
		
	}

}
