import static java.lang.Integer.parseInt;
import static javax.swing.JOptionPane.showInputDialog;
import static java.lang.Double.parseDouble;
public class oppgaveB4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	String brutto = "";
	int bruttolonn;
	
	brutto = showInputDialog("bruttolønn");
	bruttolonn = parseInt(brutto);
	
	if (bruttolonn >=0 && bruttolonn <= 164100) {
		System.out.println("lonn: " + (bruttolonn));
	}
	else if (bruttolonn >=164101 && bruttolonn <= 230950) {
		System.out.println("skattefradrag: " + (bruttolonn * 0.0093));
	}
	
	else if (bruttolonn >=230951 && bruttolonn <= 580650) {
		System.out.println("skattefradrag: " + (bruttolonn * 0.0241));
	}
	
	else if (bruttolonn >=580651 && bruttolonn <= 934050) {
		System.out.println("skattefradrag: " + (bruttolonn * 0.1152));
	}
	else if (bruttolonn > 934050) {
		System.out.println("skattefradrag: " + (bruttolonn * 0.1452));
	}
	}

}
