package CSGChat;

import java.awt.BorderLayout;
import java.awt.Font;

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
		label_Nick = new JLabel("NickName");
		label_ID = new JLabel();
		
		label_Nick.setFont(new Font("고딕", 1, 12));
		
		this.setLayout(new BorderLayout());
		this.add(label_Nick , "North");
		this.add(label_ID, "Center");
		
		
		
	}

}
