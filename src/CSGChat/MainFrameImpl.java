package CSGChat;

import java.awt.Color;
import java.awt.Container;
import java.awt.Point;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.WindowConstants;

public class MainFrameImpl extends JFrame implements MainFrame, PanelSize {

	/**
	 * @param args
	 */
	/*
	 * static final int MAIN_F_WIDTH = (int)
	 * ((int)Toolkit.getDefaultToolkit().getScreenSize().getWidth()*0.6); static
	 * final int MAIN_F_HEIGHT = (int)
	 * ((int)Toolkit.getDefaultToolkit().getScreenSize().getHeight()*0.7);
	 */

	private Container main_container = null; // 메인프래임 컨테이너

	private JPanel main_Top_Panel = null; // 탑패널
	private JPanel main_Bottom_Panel = null; // 바탐패널

	PlayerPanel playerPanel[] = null;

	Point main_Frame_point = null;

	public MainFrameImpl() {
		// TODO Auto-generated constructor stub
		super("초성 게임");
		main_container = getContentPane();
		main_container.setLayout(null);
		initGui();
		try {
			initPanel();
		} catch (Exception e) {
			// TODO: handle exception

			e.printStackTrace();
			System.out.println("오류남");

		}

		// pack();
		// this.setSize(750, 500);

		this.setResizable(false);
		this.setVisible(true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new MainFrameImpl();

	}

	@Override
	public void initGui() {
		// TODO Auto-generated method stub
		this.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		this.setSize(MAIN_F_WIDTH, MAIN_F_HEIGHT);

		main_Frame_point = new Point();
		main_Frame_point.x = (int) Toolkit.getDefaultToolkit().getScreenSize()
				.getWidth()
				/ 2 - MAIN_F_WIDTH / 2;
		main_Frame_point.y = (int) Toolkit.getDefaultToolkit().getScreenSize()
				.getHeight()
				/ 2 - MAIN_F_HEIGHT / 2;

		this.setLocation(main_Frame_point);

		main_Bottom_Panel = new JPanel();
		main_Top_Panel = new JPanel();

		main_container.add(main_Top_Panel);
		main_container.add(main_Bottom_Panel);

		main_Top_Panel.setLayout(null);
		main_Top_Panel.setBounds(0, 0, MAIN_F_WIDTH,
				(int) (MAIN_F_HEIGHT * 0.1));
		main_Top_Panel.setBackground(Color.GRAY);

		main_Bottom_Panel.setLayout(null);
		main_Bottom_Panel.setBounds(0, (int) (MAIN_F_HEIGHT * 0.1),
				MAIN_F_WIDTH, (int) (MAIN_F_HEIGHT * 0.9));
		// main_Bottom_Panel.setBackground(new Color(255,5,192));

	}

	@Override
	public void initPanel() throws Exception {
		// TODO Auto-generated method stub
		playerPanel = new PlayerPanel[6];
		float location_Y = 0.1f;
		float location_X = 0.05f;
		for (int i = 0, flag = 1; i < playerPanel.length; i++, flag *= -1) {

			playerPanel[i] = new PlayerPanel();
			main_Bottom_Panel.add(playerPanel[i]);

			if (flag == POSITION_L_FLAG) {

				playerPanel[i].setBounds((int) (MBOTTOM_P_WIDTH * location_X),
						(int) (MBOTTOM_P_HEIGHT * location_Y), PLAYER_P_WIDTH,
						PLAYER_P_HEIGHT);
				playerPanel[i].initPPanel(flag);
				location_X = 0.7f;

			} else {

				playerPanel[i].setBounds((int) (MBOTTOM_P_WIDTH * location_X),
						(int) (MBOTTOM_P_HEIGHT * location_Y), PLAYER_P_WIDTH,
						PLAYER_P_HEIGHT);
				playerPanel[i].initPPanel(flag);
				location_X = 0.05f;

			}

			if ((i + 1) % 2 == 0) {
				location_Y += 0.35f;
			}

		}

	}
}
