package Gui;

import java.net.URL;
/**
 * @author son
 * @since 2005-11-03
 * 
 *   ��Ŭ������ JAR���� ���� �����ϴ� �̹��� ������ URL�� ��� ���� Ŭ���� 
 */
public class URLGetter {
	
	private URLGetter() {}
	
	/**
	 * stitc �޼ҵ�μ�, ��ü�� ���� ������ �ʿ� ���� Ŭ���� �̸����� 
	 * ������ �����ϴ�. ��Ʈ������ �� �����̸��� �Ű������� ���ѱ�� URL��
	 * ������ �ִ�.
	 * 
	 * @param filename �����̸�.
	 * @return URL ��ü�� ��ȯ�Ѵ�.
	 */
	public static URL getResource(String filename) {
		 // jar�ȿ��� �а��Ѵ�.
		URL url = ClassLoader.getSystemResource(filename);

		//		 jar���Ͽ��� �߰ߵ��� ������ disk�κ��� �д´�.
		if (url == null) { 
			try {
				url = new URL("file", "localhost", filename);
			} catch (Exception urlException) {} // ignore
		}
		return url;
	}
}
