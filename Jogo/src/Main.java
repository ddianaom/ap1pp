import javax.swing.JOptionPane;
import java.util.Random;

public class Main {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String mensagem = "";
		
		Interface tela = new Interface();
		Random rand = new Random(); 
		int randomNum = rand.nextInt(10);

		Spaceship player = new Spaceship("[■]", 5, 3, 30);
		Spaceship enemy = new Spaceship("|©|", randomNum, randomNum, 100);
		
		Boolean ingame = true;
		
		tela.mostrarIntro();
		
		while(ingame) {
			
			if(tela.Gameover(player.Pegarvida()) || tela.Win(enemy.Pegarvida())) {
				break;
			}
			
			tela.criarInterface();
			enemy.Movimentacaoaleatoria();
			player.Perdervida(player.Colision(player.x, player.y, enemy.x, enemy.y));
			tela.Setship(player.x, player.y, "[■]");
			tela.Setship(enemy.x, enemy.y, "[§]");
			enemy.Perdervidaenemy(enemy.Colisionenemy(player.y, enemy.y));
			tela.mostrarInteface(player.Pegarvida(), enemy.Pegarvida());
			
			
			mensagem = JOptionPane.showInputDialog("CAPITÃO, DIGA SUAS ORDENS!!!");
			player.Movimentacao(mensagem);
		}
	}

}