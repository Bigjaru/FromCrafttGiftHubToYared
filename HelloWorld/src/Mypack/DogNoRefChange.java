package Mypack;

public class DogNoRefChange {
	 protected String name;
	 DogNoRefChange(String name) {
	        this.name = name;
	    }
	    public void setName(String name) {
	        this.name = name;
	    }
	    public String getName() {
	        return this.name;
	    }
	
	    public static void changeReference(DogNoRefChange dog) {
	    	DogNoRefChange newDog = new DogNoRefChange("Poo");
	        dog = newDog;
	    }

public static void main(String[] args) 
	{ 
	DogNoRefChange dog2 = new DogNoRefChange("Meek");
	System.out.println("Before change: " + dog2.getName());
	changeReference(dog2);
	System.out.println("After change: " + dog2.getName());
	}
}
