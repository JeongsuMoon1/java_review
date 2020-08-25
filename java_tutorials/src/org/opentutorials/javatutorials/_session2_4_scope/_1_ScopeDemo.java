package org.opentutorials.javatutorials._session2_4_scope;

// 유효범위 : 같은 이름을 누군가가 사용하면 충돌이 발생할 수도 있다는 것이다(right라는 변수이름을 사용하면 한명은 오른쪽, 한명은 권리라는 뜻으로 사용할 것이다).
// 이런 문제를 해결하기 위한 것이 스코프(scope)라고도 하는 유효범위의 개념이다.

// 이름이 같은 i변수를 두 곳에 선언
class ScopeDemo{
	static void a(){
		int i = 0;
	}
	

	public static void main(String[] args) {
		
		for(int i = 0; i < 5; i++){
			
			a(); // i변수가 a()메소드 안에 선언돼 있어서 a()메소드 바깥에 영향을 미칠 수 없어서 for문 안에 들어있는 i 변수의 값이 변경되지 않기 때문이다.
			     // 만약 a()메소드 안에서 i의 값을 선언했을 때 그 값이 for문에 있는 i변수에도 영향을 준다면 예제의 반복문은 제대로 동작하지 않을 것이다(무한반복 0이 될 것).
				 // 물론 a() 메소드 안에 어떤 값이 있을 때 그 값과 바깥쪽에 있는 값을 조심해서 걸정하면 문제가 발생하지 않을 것이다.
				 // 그런데 a()메소드를 내가 아닌 다른 누군가가 만들었다면 통제하기가 어렵기 때문에 i값이 들어있는지 없는지 파악하기 어려울 수도 있고,
			     // 변경하기에는 너무 규모가 큰 일이거나 변경이 불가능하도록 클래스 파일만 있는 경우도 있을 것이다.
			
			     // 프로그래밍에서는 a()메소드 안에서 변수를 선언하면 해당변수(예제에서는 i 변수)는 해당 메소드 안에서만 유효한, 즉 해당 메소드 안에서만 사용할 수 있는 변수가 된다. 
                 // 이 같은 개념을 유효범위(Scope)라고 한다.
			
			System.out.println(i);
		}

	}

}
