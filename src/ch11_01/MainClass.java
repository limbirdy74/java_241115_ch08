package ch11_01;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Long time1 = System.currentTimeMillis();  // 현재 시간을 1/1000 초 단위의 값으로 변환
		System.out.println(time1);
		
		int sum = 0;
		for(int i = 1; i <= 100000000; i++) {
			sum = sum + i;
		}
		System.out.println(sum);
		
		Long time2 = System.currentTimeMillis();
		System.out.println(time2);	
		
		System.out.println(time2 - time1);	
	}

}
