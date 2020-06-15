package org.opentutorials.javatutorials._5_constant;

public class _1_ConstantDemo {

	public static void main(String[] args) {
		
		// 상수 : 변하지 않는 값을 의미.
		
		// a = 1;  -> a : 변할 수 있는 변수,  1 : 1은 1이다. 2나 3이 될 수는 없다(상수의 의미가 된다. 항상 같은 수)

		// 상수 : 정수, 실수
		// 상수 또한 변수의 데이터 형식인 byte, short, int, long, float, double처럼 값도 여러가지 데이터 형식을 갖는다.
		
//		int a = 2.2;  -> int는 정수형이기 때문에 2.2 실수를 담을 수 없어서 에러가 발생. -> 2.2의 값을 바꾸어 값이 손실되기 보단 데이터 형식을 바꾸는 것이 바람직히다.
		
//		float a = 2.2;  -> double로 실수 데이터 형식을 바꿔볼 것
		
//		double a = 2.2; // 에러가 없어짐. 즉, 2.2라는 갑은 double이라는 데이터 타입을 갖고 있고, a라는 변수도 double이기 때문에 두 가지 데이터 타입이 일치하므로 에러가 사자진 것이다.
						// 알 수 있는 것은 2.2라는 실수는 데이터 타입이 double이라는 것이다.
		
		// float형을 사용하기 위해서는 명시적으로 지정을 해주어야 한다.
//		float a = 2.2F; -> 상수 2.2 뒤에 F라는 기호를 붙여서 F가 속한 숫자(상수)가 float 데이터 타입이라는 것을 명시적으로 지정했기 때문에 오류가 발생하지 않음.
		// 결국, 변수에도 데이터 타입이 있고, 상수 역시도 데이터 타입이 있다는 사실과 실수를 기본적으로 사용하게 되면 그 실수가 어떤 데이터 타입을 채택해야하는데 실수는 double 형의 데이터 타입을 기본적으로 채택하고,
		// double이 아닌 float으로 바꾸고 싶다면 상수에 F를 붙여야 한다는 점을 기억해야 한다.
		
		// 정수형도 똑같은 내용으로 이해하면 된다.
//		int a = 2147483648; -> 오류코드 : int의 범위를 넘어서서 long으로 바꿈
//		long a = 2147483648; -> 오류코드 : long으로 바꿔도 상수의 데이터타입이 여전히 int형이기 때문에 오류가 난다
//		long a = 2147483648L; -> 2147483648의 상수갑을 int형에서 long형으로 데이터 타입을 바꿔주면 변수 선언부의 데이터 타입과 같아 진다.(long=long)
		
		// 기본적으로 정수를 사용하고 뒤에 무언가를 붙이지 않는다면 기본적으로 int형으로 된다.
		// byte, short의 데이터 타입의 범위를 벗어나지 않는 선에서 사용하면 int형 데이터 타입인 정수를 byte, short로 받아서 사용이 가능하다.
		byte a = 100;
		short b = 200;
		
		
	}

}
