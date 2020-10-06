
public class array_gugudan {
	public static void main(String[] args) {
		
	//이중for문
//		int[] result = new int[9];
//		for(int number=2; number<=9; number++) {
//		for(int i=0; i < result.length; i++) {
//				result[i] = number * (i+1);
//				System.out.println(result[i]);
//			}
//		}
//		
//	}
//}
		//배열 이용한 구구단
		int[] result = new int[9];
		
		for(int i=0; i < result.length; i++) {
			result[i] = 3 * (i+1);
		}
		
		for(int i = 0; i < result.length; i++) {
			System.out.println(result[i]);
		}
			
		result = new int[9];
		for(int i=0; i < result.length; i++) {
			result[i] = 4 * (i+1);
		}
		
		for(int i = 0; i < result.length; i++) {
			System.out.println(result[i]);
		}
	}
}
