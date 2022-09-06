import static java.lang.Integer.parseInt;
import static javax.swing.JOptionPane.showInputDialog;

public class oppgaveb6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int studenter = 10;

		String poengscore = "";
		int poengsumm;

		for (int i = 1; i <= studenter; i++) {
			poengscore = showInputDialog("poeng");
			poengsumm = parseInt(poengscore);
			while (poengsumm < 0 || poengsumm > 100) {
				poengscore = showInputDialog("poeng feil prøv på nytt");
				poengsumm = parseInt(poengscore);
			}

			if (poengsumm <= 100 && poengsumm >= 90) {
				System.out.println(poengsumm + ("= A"));
			} else if (poengsumm <= 89 && poengsumm >= 80) {
				System.out.println(poengsumm + ("= B"));
			} else if (poengsumm <= 79 && poengsumm >= 60) {
				System.out.println(poengsumm + ("= C"));
			} else if (poengsumm <= 59 && poengsumm >= 50) {
				System.out.println(poengsumm + ("= D"));
			} else if (poengsumm <= 49 && poengsumm >= 40) {
				System.out.println(poengsumm + ("= E"));
			} else if (poengsumm <= 39 && poengsumm >= 0) {
				System.out.println(poengsumm + ("= F"));
			} else {
				System.out.println("error");
			}
		}

	}

}
