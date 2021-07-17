package basics.staticblock;

public class ParentClass {

public	ParentClass(){
		System.out.println("Parent Class default invoked");
	}

static {
	System.out.println("ParentClass Static block is invoked");
}

{
	System.out.println("ParentClass Anonymous block invoked");
}
}
