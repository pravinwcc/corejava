package basics.clonetest;

class Student implements Cloneable {
	  //Contained object
	  private Subject subj;

	  private String name;

	  public Subject getSubj() {
		return subj;
	  }

	  public String getName() {
		return name;
	  }

	  public void setName(String s) {
		name = s;
	  }

	  public Student(String s, String sub) {
		name = s;
		subj = new Subject(sub);
	  }
	//shallow copy
	/*  public Object clone() throws CloneNotSupportedException {
		
		  return super.clone();
		
	  }*/
	  
	  
		//Deep copy
	 public Object clone() {
			Student s = new Student(name, subj.getName());
			return s;
	}
	}