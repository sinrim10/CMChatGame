package CSGChat;

import java.awt.GridLayout;

import javax.swing.JPanel;

public class PlayerPanel extends JPanel{
	
	PlayerPanelInfo playerPanelInfo = null;
	PlayerPanelImg playerPanelImg = null;
	public PlayerPanel() {
		// TODO Auto-generated constructor stub
		super();
		initPPanel();
	}
	
	public void initPPanel(){
		playerPanelImg = new PlayerPanelImg();
		playerPanelInfo = new PlayerPanelInfo("sillim10");
		
		
		this.setLayout(new GridLayout(1, 1));
		this.add(playerPanelInfo);
		this.add(playerPanelImg);
		
		
		System.out.println("플레이패널 높이"+playerPanelInfo.getWidth());
	}

}
