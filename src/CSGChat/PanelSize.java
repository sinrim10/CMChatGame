package CSGChat;

import java.awt.Toolkit;

public interface PanelSize {
	//현재 스크린화면 사이즈
	static final int SCREEN_S_WIDTH = (int)Toolkit.getDefaultToolkit().getScreenSize().getWidth();
	static final int SCREEN_S_HEIGHT = (int)Toolkit.getDefaultToolkit().getScreenSize().getHeight();
	
	//메인 프레임 사이즈.
	static final int MAIN_F_WIDTH = (int) (SCREEN_S_WIDTH*0.6);
	static final int MAIN_F_HEIGHT = (int) (SCREEN_S_HEIGHT*0.7);
	
	//메인 바텀 패널 사이즈
	static final int MBOTTOM_P_WIDTH = (int) (SCREEN_S_WIDTH*0.6);
	static final int MBOTTOM_P_HEIGHT = (int) (SCREEN_S_HEIGHT*0.6);
	
	//플레이어 정보 패널
	static final int PLAYER_P_WIDTH = (int) (SCREEN_S_WIDTH*0.15);
	static final int PLAYER_P_HEIGHT = (int) (SCREEN_S_HEIGHT*0.15);
	
	//게임 문제 보여주는 패널
	static final int SHOW_P_WIDTH = (int) (SCREEN_S_WIDTH*0.3);
	static final int SHOW_P_HEIGHT = (int) (SCREEN_S_HEIGHT*0.5);
	
	static final int POSITION_R_FLAG = 0;
	static final int POSITION_L_FLAG = 1;
	
}
