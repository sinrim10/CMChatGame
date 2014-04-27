package CSGChat;


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
		//label_Nick.setFont(new Font("고딕", 1, 12));
		this.setLayout(null);
		this.add(label_Nick);
		this.add(label_ID);
		this.add(label_Jumsu);
		
		
		
		label_Nick.setBounds(0, 0, PLAYER_P_WIDTH/2, (int)(PLAYER_P_HEIGHT*0.2));
		label_ID.setBounds(0, (int)(PLAYER_P_HEIGHT*0.2), PLAYER_P_WIDTH/2 , (int)(PLAYER_P_HEIGHT*0.3));
		label_Jumsu.setBounds(0, (int)(PLAYER_P_HEIGHT*0.5), PLAYER_P_WIDTH/2, (int)(PLAYER_P_HEIGHT*0.5));
		

	}

}
