package sec04.exam01_objects;
import java.util.Objects;

public class ToStringExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "ȫ�扥";
		String str2 = null;
 		
			
			System.out.println(Objects.toString(str1));
			System.out.println(Objects.toString(str2));
			System.out.println(Objects.toString(str2, "�̸��� �����ϴ�."));
	}

	}



