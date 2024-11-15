package ch10_02;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThrowTest test = new ThrowTest();
		
//		test.goRun();  //오류발생. 힌트를 2번을 선택하면 자동으로 아래처럼 됨
		try {
			test.goRun();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
//		교재 문제
		String[] strArray = { "10", "2a" };
		int value = 0;
		for(int i=0; i <= 2; i++) {
			try {
				value = Integer.parseInt(strArray[i]);
			} catch(ArrayIndexOutOfBoundsException e) {
				System.out.println("인덱스를 초과했음");
			} catch (NumberFormatException e) {
				System.out.println("숫자로 변환할 수 없음");
			} finally {
				System.out.println(value);
			}
		}
	}

}
