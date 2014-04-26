package CSGChat;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class PlayerPanelInfo extends JPanel {
	
	String player_ID = null;
	JLabel label_Nick = null;
	JLabel label_ID = null;
	public PlayerPanelInfo(String player_ID) {
		// TODO Auto-generated constructor stub
		super();
		this.player_ID = player_ID;
	}
	
	public void initPPInfo(){
		label_Nick = new JLabel();
		label_ID = new JLabel();
		
		this.setLayout(null);
		
		
	}

}
