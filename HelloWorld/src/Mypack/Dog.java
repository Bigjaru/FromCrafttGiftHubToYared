package Mypack;

class Animal {
    // protected method
    protected void display() {
        System.out.println("I am an animal");
    }
}

public class Dog extends Animal {
    public static void main(String[] args) {

        // create an object of Dog class
        Dog dog = new Dog();
         // access protected method from subclass
        dog.display();
        
        Data d = new Data(); //accessing default class within same package under subclass

        // access the private variable using the getter and setter
        d.setName("Craft Software Professionals");
        System.out.println(d.getName());
    }
}


