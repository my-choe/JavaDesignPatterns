package CreationalPattern.Builder;

public class PersonInfo {
	private String name;
	private Integer age;
	private String favoriteColor;
	private String favoriteAnimal;
	private String favoriteNumber;
	
	
	public PersonInfo(String name, Integer age, String favoriteColor, String favoriteAnimal, String favoriteNumber) {
		this.name = name;
		this.age = age;
		this.favoriteColor = favoriteColor;
		this.favoriteAnimal = favoriteAnimal;
		this.favoriteNumber = favoriteNumber;
	}


	public String getName() {
		return name;
	}

	public Integer getAge() {
		return age;
	}

	public String getFavoriteColor() {
		return favoriteColor;
	}

	public String getFavoriteAnimal() {
		return favoriteAnimal;
	}

	public String getFavoriteNumber() {
		return favoriteNumber;
	}
	
	public String getPersonInfo() {
		String personInfo = String.format("name:%s, age:%d, favoriteColor:%s, favoriteAnimal:%s, favoriteNumber:%d", name, age, favoriteColor, favoriteAnimal, favoriteNumber);
		return personInfo;
	}
	
	
	/*
	 * 한 사람의 정보를 담기 위한 클래스. 하지만 setter 메소드는 존재할 수 없고 
	 * 오로지 생성자를 통해서만 데이터를 입력받는다는 가정으로 만든 클래스이다.
	 * 생성자를 보면 모든 매개변수를 받도록 하고 있다. 하지만 어떤 사람들은 모든 데이터가 없을 수도 있다.
	 * */
	
}
