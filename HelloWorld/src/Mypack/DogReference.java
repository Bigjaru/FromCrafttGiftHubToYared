package Mypack;

 class DogReference {
	
	    protected String name;
	    DogReference(String name) {
	        this.name = name;
	    }
	    public void setName(String name) {
	        this.name = name;
	    }
	    public String getName() {
	        return this.name;
	    }
	
 public static void modifyReference(DogReference dog) {
	    dog.setName("Rex");
	}
 
 public static void main(String[] args) 
	{ 
	 DogReference dog1 = new DogReference("Pun");
 System.out.println("Before modify: " + dog1.getName());
 modifyReference(dog1);
 System.out.println("After modify: " + dog1.getName());
	}
}