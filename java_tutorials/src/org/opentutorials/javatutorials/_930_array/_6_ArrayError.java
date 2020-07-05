package org.opentutorials.javatutorials._930_array;

public class _6_ArrayError {

	public static void main(String[] args) {
		
		
		// 오류발생 코드
		
		// 인덱스가 0,1,2만 있는데 존재하지 않는 3에 해당하는 값을 가져오려고 해서 발생한 오류이다.
		String[] members = {"최진혁","최유빈","한이람"};
		System.out.println(members[3]);
		// 현재 members배열에는 3에 해당하는 인덱스 값이 존재하지 않기 때문에, 오류가 발생되는 코드가 된다.
		// 이 에러는 배열이 갖고 있지 않은 인덱스(색인)로 어떤 데이터를 가져오려고 했기 떄문에 발생한 에러이다.
		// 이런 것들을 보통 예외라고 한다.(아직 예외는 배우지 않았고 나중에 배울 것이다.)
		
		// 이번에는 어떤 배열을 정의할 때 이 배열이 3개의 값을 가질 수 있다고 정의했는데, 끝에 정의하지 않은 어떤 값을 추가하려고 했을 때 발생하는 오류.
		String[] Members = new String[3]; // members 변수에 문자열 형식의 값으로 구성된 배열을 할당했다. 이 배열은 3개의 값을 가질 수 있는 배열이다.
		Members[0] = "최진혁";
		Members[1] = "최유빈";
		Members[2] = "한이람";
		Members[3] = "이고잉";
		// 이번 오류도 역시 그 배열의 크기를 벗어나는 일을 하려고 했기 때문에 발생한 오류라고 할 수 있다.
		// PHP나 python이나 자바스크립트에서는 이런 오류는 발생하지 않지만,
		// JAVA에서는 메모리(RAM)에 변수라는 공간을 확보하여 데이터 크기를 정해서 쓰기 때문에 효율적으로 사용할 수 밖에 없는 구조이다(오류의 원인)
		// 이런 비효울적인 부분을 개선하기 위해서 컬렉션(Collection)이라는 요소가 있다(=컨테이너(Container)라고도 한다 -> 객체지향을 배우고 난 후 학습할 것이다.
		
	}

}
