import javax.swing.JOptionPane;
import java.util.Random;

public class Interface {
	
	String[][] janela = new String[10][10];
		
	public void criarInterface() {
		for (int linha=0;linha<10;linha++)
		{
			for (int coluna=0;coluna<10;coluna++)
			{
				janela[linha][coluna] = "|_|";
				
			}
		}
	}
	
	public void Setship(int position_x,int position_y, String ship) {
		janela[position_x][position_y] = ship;
	}
		
	public void mostrarInteface(int lifepoint_a, int lifepoint_b) {
		System.out.println("Player ♥: " + lifepoint_a +" | Enemy ♥: " + lifepoint_b + " \n");
		for (int linha=0;linha<10;linha++)
		{
			for (int coluna=0;coluna<10;coluna++)
			{
				System.out.print(janela[linha][coluna]);		
			}
			System.out.println("");
		}
		System.out.println("\nRodada X");
		System.out.println("         5         ");
		System.out.println("         ^          ");
		System.out.println("         |          ");
		System.out.println(" 1 <-          -> 2 ");
		System.out.println("         |          ");
		System.out.println("         v          ");
		System.out.println("         2       ");
		
	}
	
	public Boolean Gameover(int player_life) {
		if(player_life == 0) {
			JOptionPane.showMessageDialog(null, "GAME OVER!!!");
			return true;
		} else {
			return false;
		}
	}
	
	public Boolean Win(int enemy_life) {
		if(enemy_life == 0) {
			JOptionPane.showMessageDialog(null, "VICTORY!!!");
			return true;
		} else {
			return false;
		}
	}
}
