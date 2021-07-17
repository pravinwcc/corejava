package basics.immutableclass;

public class ImmutableTest extends ImmutableClass {

	private  String name;
    private  String mobile;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public ImmutableTest(String name, String mobile) {
		super(name, mobile);
		this.name = name;
		this.mobile = mobile;
	}

	public static void main(String[] args) {
		ImmutableTest ii= new ImmutableTest("ABC","123");
		
		ImmutableClass iii=ii;
		System.out.println(iii.getMobile());
		
		
		 ii.mobile="changed";
		
		System.out.println(iii.getMobile());

	}

}
