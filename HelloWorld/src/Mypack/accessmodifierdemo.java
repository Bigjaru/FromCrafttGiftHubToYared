package Mypack;

class Data {
    private String name;

    // getter method
    public String getName() {
        return this.name;
    }
    // setter method
    public void setName(String name) {
        this.name= name;
    }
}
public class accessmodifierdemo {
    public static void main(String[] main){
        Data d = new Data();

        // access the private variable using the getter and setter
        d.setName("Craft Software Professionals");
        System.out.println(d.getName());
        
     // create an object of Animal class
        Animal dog = new Animal();
         // access protected method within same package
        dog.display();
        
    }
}


