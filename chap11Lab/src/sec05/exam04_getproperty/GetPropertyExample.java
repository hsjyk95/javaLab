package sec05.exam04_getproperty;

import java.util.Properties;
import java.util.Set;

public class GetPropertyExample {

	public static void main(String[] args) {
		String osName = System.getProperty("os.name");
		String userName = System.getProperty("user.name");
		String userHome = System.getProperty("user.home");
		
		System.out.println("�ü�� �̸�: "+osName);
		System.out.println("����� �̸�: "+userName);
		System.out.println("����� Ȩ���丮 :"+userHome);
		
		System.out.println("-----------------------");
		System.out.println("[key] value");
		System.out.println("-----------------------");
		//map �ڷᱸ��: {key:value}  ��) {StringŸ��: StringŸ��}<-Properties
		Properties props = System.getProperties();
		//set �ڷᱸ��: ������ ����, �ڷᰡ �ߺ��� �� ����, null ���
		Set keys = props.keySet(); 
		for(Object objKey : keys) {
			String key = (String) objKey;
			String value = System.getProperty(key);
			System.out.println("["+key+"]"+value);
			
		}
	
	}

}