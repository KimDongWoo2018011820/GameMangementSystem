package gui;

import javax.swing.JFrame;
import javax.swing.JPanel;

import manager.GameManager;

public class WindowFrame extends JFrame {
	GameManager gamemanager;
	MenuSelection menu;
	GameAdder gameadd;
	GameViewer gameviewer;
	GameDelete gamedelete;
	GameEdit   gameedit;
	



	public WindowFrame(GameManager gameManager) {
		this.setSize(500,400);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
		this.gamemanager = gameManager;
	
		this.menu = new MenuSelection(this);
		this.gameadd = new GameAdder(this);
		this.gameviewer = new GameViewer(this,this.gamemanager);
		this.gamedelete = new GameDelete(this);
		this.gameedit = new GameEdit(this);
		this.setupPanel(menu);
		
	
		this.setVisible(true);
	}
	
	


	public MenuSelection getMenu() {
		return menu;
	}
	public void setMenu(MenuSelection menu) {
		this.menu = menu;
	}
	public GameAdder getGameadd() {
		return gameadd;
	}
	public void setGameadd(GameAdder gameadd) {
		this.gameadd = gameadd;
	}
	public GameViewer getGameviewer() {
		return gameviewer;
	}
	public void setGameviewer(GameViewer gameviewer) {
		this.gameviewer = gameviewer;
	}
	
	public GameDelete getGamedelete() {
		return gamedelete;
	}


	public void setGamedelete(GameDelete gamedelete) {
		this.gamedelete = gamedelete;
	}
	
	public GameEdit getGameedit() {
		return gameedit;
	}

	public void setGameedit(GameEdit gameedit) {
		this.gameedit = gameedit;
	}

	
	
	public void setupPanel(JPanel panel){
		this.getContentPane().removeAll();
		this.getContentPane().add(panel);
		this.revalidate();
		this.repaint();
	}

}
