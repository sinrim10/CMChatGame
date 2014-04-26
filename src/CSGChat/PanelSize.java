package CSGChat;

import java.awt.Toolkit;

public interface PanelSize {
	static final int MAIN_F_WIDTH = (int) ((int)Toolkit.getDefaultToolkit().getScreenSize().getWidth()*0.6);
	static final int MAIN_F_HEIGHT = (int) ((int)Toolkit.getDefaultToolkit().getScreenSize().getHeight()*0.7);
	
	static final int PLAYER_P_WIDTH = (int) ((int)Toolkit.getDefaultToolkit().getScreenSize().getWidth()*0.2);
	static final int PLAYER_P_HEIGHT = (int) ((int)Toolkit.getDefaultToolkit().getScreenSize().getHeight()*0.2);
}
