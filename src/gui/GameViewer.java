package gui;

import java.awt.BorderLayout;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;

import games.GameInput;
import listener.BackListener;
import manager.GameManager;

public class GameViewer extends JPanel {
	
	WindowFrame frame;
	GameManager gamemanager;
	
	public GameViewer(WindowFrame frame, GameManager gamemanager){
		this.frame =frame;
		this.gamemanager = gamemanager;
		this.setLayout(new BorderLayout());
		System.out.println("***"+gamemanager.size()+"**");
		
		DefaultTableModel model = new DefaultTableModel();
		model.addColumn("Name");
		model.addColumn("Type");
		model.addColumn("Playtime");
		model.addColumn("Distributor");
		model.addColumn("Price");
		
		JTable table = new JTable(model);
		JScrollPane sp = new JScrollPane(table);
		JButton b1 = new JButton("Back");
		b1.addActionListener(new BackListener(this.frame));
		
		for( int i =0; i <gamemanager.size();i++) {
			Vector row = new Vector();
			GameInput gameinput = gamemanager.get(i);
			row.add(gameinput.getName());
			row.add(gameinput.getType());
			row.add(gameinput.getPlaytime());
			row.add(gameinput.getDistributor());
			row.add(gameinput.getPrice());
			model.addRow(row);
		}
		
		this.add(sp,BorderLayout.CENTER);
		this.add(b1,BorderLayout.SOUTH);
		
		
	}

}
