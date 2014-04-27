package CSGChat;

import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class PlayerPanelImg extends JPanel implements PanelSize{
	
	
	private ImageIcon image1 = null;
	private JLabel jLabel = null;
	public PlayerPanelImg() {
		// TODO Auto-generated constructor stub
		super();
		initPPI();
	}
	
	public void initPPI(){
		
		image1 = new ImageIcon("2.jpg");
		jLabel = new JLabel(image1);
		
		this.setLayout(null);
		this.add(jLabel);
		//jLabel.setSize(PLAYER_P_WIDTH/2, (int)(PLAYER_P_HEIGHT*0.2));
		
		//jLabel.setBackground(Color.black);



	}
	
	

}
