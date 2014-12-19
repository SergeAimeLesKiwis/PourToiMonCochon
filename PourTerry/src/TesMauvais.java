
public class TesMauvais {
	
	private String mwahaha;
	
	public TesMauvais(){
		mwahaha="Bonjour, tu n'es pas bon. Cordialement, Serge.";
		pasBon();
	}
	
	private void pasBon(){
		System.out.println(mwahaha);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new TesMauvais();
	}

}
