import javax.swing.JOptionPane;

public class Main {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String mensagem = null;
		
		Interface tela = new Interface();
		Boolean ingame = true;
		
		
		
		while(ingame) {
			tela.criarInterface();
			tela.mostrarInteface();
			mensagem = JOptionPane.showInputDialog("CAPITÃO, DIGA SUAS ORDENS!!!");
			JOptionPane.showMessageDialog(null, "SIM SENHOR!!!");
			
			switch (mensagem) {
			
			case "0":
				ingame = false;
				JOptionPane.showMessageDialog(null, "SAINDO DO JOGO");
				
			case "8":
				// mover para cima
				
			case "4":
				// mover para left
				
			case "6":
				// mover para right
				
			case "2":
				// mover para down
				
			case "5":
				// mover para shoot
			}
		}
	}

}