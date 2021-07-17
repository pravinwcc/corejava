package java8.interfacedefaultmethods;

public class Animal implements Moveable, Dog{
	 static void move1(){
	        System.out.println("I am moving");
	    }
	public void move(){
	        System.out.println("I am running");
	    }
	public static void main(String[] args){
        Animal tiger = new Animal();
        tiger.move();
        Animal mv= new Animal();
        mv.move1();
        Moveable.move1();
        Dog.move1();
    }
}
