package CSGChat;


import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.Label;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class PlayerPanelInfo extends JPanel implements PanelSize{
	
	private String player_ID = "";
	private JLabel label_Nick = null;
	private JLabel label_ID = null;
	private JLabel label_Jumsu = null;
	
	public static int jumsu = 0;
	
	
	public PlayerPanelInfo(String player_ID) {
		// TODO Auto-generated constructor stub
		super();
		this.player_ID = player_ID;
		initPPInfo();
		
	}
	
	public void initPPInfo(){
		System.out.println("높이"+this.getHeight());
		label_Nick = new JLabel("NickName",JLabel.CENTER);
		label_ID = new JLabel(player_ID,JLabel.CENTER);
		label_Jumsu = new JLabel("정답     "+ new Integer(jumsu).toString() , JLabel.CENTER);

		this.setLayout(new BorderLayout());
		this.add("North",label_Nick);
		this.add("Center",label_ID);
		this.add("South",label_Jumsu);

	}

}
