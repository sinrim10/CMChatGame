package CSGChat;

import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class PlayerPanelImg extends JPanel implements PanelSize {
	

	private ImageIcon image1 = null;

	public PlayerPanelImg() {
		// TODO Auto-generated constructor stub
		super();
		initPPI();
		
	}
	
	public void initPPI() {
		
		image1 = new ImageIcon("2.jpg");
		this.setLayout(new GridLayout(1,1));
		this.add(new JLabel(image1));
	}
}
