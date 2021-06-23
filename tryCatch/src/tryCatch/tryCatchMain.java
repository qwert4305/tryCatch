package tryCatch;

public class tryCatchMain {

	public static void main(String[] args) {

		// 2021-06-24
		// 1. try catch throw

		// NullPointerException 발생 시킴
		String str = null;
		String str2 = "널아님";

		try {
			System.out.println(str); // == System.out.println(str.toString()); 둘 다 같음
			System.out.println(str2);
			throw new NullPointerException(); // 에러 강제 출력
			
		} catch (NullPointerException e) {
			e.printStackTrace();
			System.out.println("객체가 널이라서 오류떴다~~");
		}
		
		// ArrayIndexOutOfBoundsException
		String[] strs = {"아", "하"};
		
		try {
			System.out.println(strs[0]);
			System.out.println(strs[2]);
			throw new ArrayIndexOutOfBoundsException(); // 에러 강제 출력
			
		} catch (ArrayIndexOutOfBoundsException e){
			e.printStackTrace();
			System.out.println("배열 길이보다 더 큰 값 호출했다~~~");
		}
		
		
		// 2. try catch finally
		try {
			System.out.println(strs[2]);
		} catch (Exception e){ // ArrayIndexOutOfBoundsException
			e.printStackTrace(); 
		} finally {
			System.out.println("꼭 실행되야돼~~~");
		}
	}

}
