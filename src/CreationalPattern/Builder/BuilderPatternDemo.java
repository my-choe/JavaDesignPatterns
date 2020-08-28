package CreationalPattern.Builder;

public class BuilderPatternDemo {

	public static void main(String[] args) {
		// 빌더객체 생성
		PersonInfoBuilder personInfoBuilder = new PersonInfoBuilder();
		/*
		 * 
		 * // 빌더 객체에 원하는 데이터 입력. 순서 상관 없음 PersonInfo result = personInfoBuilder
		 * .setName("홍길동") .setAge(28) .setFavoriteAnimal("cat")
		 * .setFavoriteColor("purple") .setName("이순신") //다시 같은 메소드를 호출하면 나중에 호출한 값이 들어간다
		 * .setFavoriteNumber(14) .build(); // 마지막에 build()메소드를 호출해서 최종적인 결과물을 만들어 반환한다.
		 * 
		 * 
		 * System.out.println(result.getPersonInfo());
		 */
	}

}
