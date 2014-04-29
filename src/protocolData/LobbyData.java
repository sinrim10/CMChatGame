package protocolData;

import java.util.Vector;

public class LobbyData implements Protocol{

	private static final long serialVersionUID = 1L;
	
	public static final short SEND_ROOMLIST = 5000; //방리스트를 요청했을경우 
	public static final short ENTER_TO_ROOM = 5100; // 방에 들어 갈경우
	public static final short CREATE_ROOM = 5200;//방을 만들때
	public static final short EXIT_GAME = 9999; // 게임을 나가기.
	
	private String name; //사용자 이름
	private Vector<String> roomList, userList; //방리스트, 유저리스트
	private String RoomName; //방이름
	private int roomNumber; //방번호
	private short protocol; //프로토콜
	
	public LobbyData(String name, String roomName, short protocol) {
		this.name = name;
		this.RoomName = roomName;
		this.protocol = protocol;
	}
	
	public LobbyData(Vector<String> roomList, short protocol) {
		this.roomList = roomList;
		this.protocol = protocol;
	}
	
	public Vector<String> getRoomList() {
		return roomList;
	}
	
	public String getRoomName() {
		return RoomName;
	}
	
	public Vector<String> getUserList() {
		return userList;
	}
	

	public void setUserList(Vector<String> userList) {
		this.userList = new Vector<String>();
		this.userList = userList;
	}

	public int getRoomNumber() {
		return roomNumber;
	}
	

	public void setRoomNumber(int roomNumber) {
		this.roomNumber = roomNumber;
	}
	
	
	@Override
	public short getProtocol() {
		return protocol;
	}
	@Override
	public String toString() {
		return "Lobby Data " + name + " " + RoomName + " roomList : " + roomList + " " + protocol;
	}
	@Override
	public String getName() {
		return name;
	}
	@Override
	public String getMessage() {
		return RoomName;
	}
	@Override
	public void setName(String name) {
		this.name = name;
		
	}
	@Override
	public void setMessage(String message) {
		// TODO Auto-generated method stub
		
	}
	
}
