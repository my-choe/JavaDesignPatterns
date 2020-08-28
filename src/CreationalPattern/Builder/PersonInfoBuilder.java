package CreationalPattern.Builder;

public class PersonInfoBuilder {
	private String name;
	private Integer age;
	private String favoriteColor;
	private String favoriteAnimal;
	private String favoriteNumber;
	
	public void setName(String name) {
		this.name = name;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public void setFavoriteColor(String favoriteColor) {
		this.favoriteColor = favoriteColor;
	}
	public void setFavoriteAnimal(String favoriteAnimal) {
		this.favoriteAnimal = favoriteAnimal;
	}
	public void setFavoriteNumber(String favoriteNumber) {
		this.favoriteNumber = favoriteNumber;
	}
	
	public PersonInfo build() {
		PersonInfo personInfo = new PersonInfo(name, age, favoriteColor, favoriteAnimal, favoriteNumber);
		return personInfo;
	}
	
	/*
	 * 위의 빌더 클래스를 사용하면 PersonInfo 객체를 손쉽고 헷갈리지 않게 만들어 낼 수 있다.
	 * */
	
}
