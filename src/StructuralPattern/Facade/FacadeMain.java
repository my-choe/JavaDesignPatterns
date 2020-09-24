package StructuralPattern.Facade;

public class FacadeMain {

	public static void main(String[] args) {
		HomeTheaterFacade homeTF = new HomeTheaterFacade(new Light(), 
								   new Projector(), new Screen(), new DvdPlayer());
		
		homeTF.watchMovie("Begin Again");
		homeTF.endMovie();
	}
}


