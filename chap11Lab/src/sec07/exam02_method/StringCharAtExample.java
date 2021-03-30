package sec07.exam02_method;

public class StringCharAtExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String ssn = "010624-1230123";
		char sex = ssn.charAt(7); // 1은 성별 1자리는 7번째
		switch(sex) {
		case '1':
		case '3':
			System.out.println("남자입니다.");
			break;
		case '2':
		case '4':
			System.out.println("여자입니다.");
			break;
		}

	}

}
