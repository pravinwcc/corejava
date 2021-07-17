package basics.markerinterface;

public class TestMarkerInterface implements BankDraft {
public static void main(String[] args)
{
	TestMarkerInterface t=new TestMarkerInterface();
	if(t instanceof BankDraft) {
		System.out.println("Transaction is done through Bank Dreaft");
}
if(t instanceof Cheque) {
	System.out.println("Transaction is done through Cheaque");
}
}

}