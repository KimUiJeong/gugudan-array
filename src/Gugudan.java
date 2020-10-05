import java.util.Scanner;
public class Gugudan {
	public static void main(String[] args) {

		//6단		
//        int i = 1;
//        while (i<10) {
//        	System.out.println(6 * i);
//        	i = i+1;
//        }
        
        //7단
//        for(int j = 1; j <10; j++) {
//        	System.out.println(7 * j);        	
//        }
       
		
		// 2단
//		System.out.println("2단");
//		System.out.println(2*2);
//		System.out.println(2*3);
//		System.out.println(2*4);
//		System.out.println(2*5);
//		System.out.println(2*6);
//		System.out.println(2*7);
//		System.out.println(2*8);
//		System.out.println(2*9);
		
		//3단
//		System.out.println("3단");
//		System.out.println(3*2);
//		System.out.println(3*3);
//		System.out.println(3*4);
//		System.out.println(3*5);
//		System.out.println(3*6);
//		System.out.println(3*7);
//		System.out.println(3*8);
//		System.out.println(3*9);
		
		//4단
//		System.out.println("4단");
//		int result = 4 * 1;
//		System.out.println(result);				
//		result = 4 * 2;
//		System.out.println(result);		
//		result = 4 * 3;
//		System.out.println(result);
//		result = 4 * 4;
//		System.out.println(result);
//		result = 4 * 5;
//		System.out.println(result);
//		result = 4 * 6;
//		System.out.println(result);
//		result = 4 * 7;
//		System.out.println(result);
//		result = 4 * 8;
//		System.out.println(result);
//		result = 4 * 9;
//		System.out.println(result);		
//		
		//number 입력
//		System.out.println("구구단 중 출력할 단은? : ");
//        Scanner scanner = new Scanner(System.in);
//        int number = scanner.nextInt();

//        int result = number * 2;                
//        System.out.println(result);		
//        result = number * 3;                
//        System.out.println(result);		
//        result = number * 4;                
//        System.out.println(result);		
//        result = number * 5;                
//        System.out.println(result);		
//        result = number * 6;                
//        System.out.println(result);		
//        result = number * 7;                
//        System.out.println(result);		
//        result = number * 8;                
//        System.out.println(result);		
//        result = number * 9;                
//        System.out.println(result);		
        // 구구단 출력하는 예제 구현        
        
		//8,9단	
//        System.out.println("구구단 중 출력할 단은? : ");
//        Scanner scanner = new Scanner(System.in);
//        int number = scanner.nextInt();
//        
//        if(number < 2) {
//        	System.out.println("2이상의 수를 입력하세요.");
//        }
//        else if (number > 9) {
//        	System.out.println("9이하의 수를 입력하세요.");
//        }
//        else { 
//        	for (int i = 1; i<10; i++) {
//        		System.out.println(number * i);
//        	}
//        }
		//배열 이용하여 구구단
		int[] result = new int[9];
		for(int i=0; i <= result.length; i++) {
			result[i] = 2 * (i+1);
		}
		
		for(int i = 0; i <= result.length; i++) {
			System.out.println(2*i);
		}
		}
}