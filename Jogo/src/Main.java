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
			mensagem = JOptionPane.showInputDialog("Forne�a seu peso");
			
			JOptionPane.showMessageDialog(null, mensagem);
		}
	}

}