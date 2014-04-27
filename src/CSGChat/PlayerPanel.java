package CSGChat;

import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JPanel;

public class PlayerPanel extends JPanel implements PanelSize{
	
	PlayerPanelInfo playerPanelInfo = null;
	PlayerPanelImg playerPanelImg = null;
	private JPanel p = null;
	private int flag;
	public PlayerPanel() {
		// TODO Auto-generated constructor stub
		super();
	}
	
	public void initPPanel(int flag)  {
		this.setLayout(new GridLayout(1,2));

		playerPanelImg = new PlayerPanelImg();
		playerPanelInfo = new PlayerPanelInfo("sillim10");


		if(flag == POSITION_R_FLAG){
			this.add(playerPanelImg);
			this.add(playerPanelInfo);
		} else {
			this.add(playerPanelInfo);
			this.add(playerPanelImg);
		}
		System.out.println("플레이패널 높이"+playerPanelInfo.getWidth());
	}

}
