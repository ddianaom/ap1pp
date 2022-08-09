import java.util.Arrays;

public class Interface {
	

	String[][] janela = new String[10][10];
	public Spaceship player = new Spaceship("[■]", 8, 3, 3);
	public Spaceship enemy = new Spaceship("|©|", 1, 6, 10);
	
		
	public void criarInterface() {
		for (int linha=0;linha<10;linha++)
		{
			for (int coluna=0;coluna<10;coluna++)
			{
				if(linha == player.x && coluna == player.y) {
					janela[linha][coluna] = player.spaceship;
				} else if(linha == enemy.x && coluna == enemy.y) {
					janela[linha][coluna] = enemy.spaceship;
				} else {
					janela[linha][coluna] = "|_|";
				}
			}
		}
	}
		
	public void mostrarInteface() {
		System.out.println("Player ♥: [X] | Enemy ♥: [XXX]\n");
		for (int linha=0;linha<10;linha++)
		{
			for (int coluna=0;coluna<10;coluna++)
			{
				System.out.print(janela[linha][coluna]);		
			}
			System.out.println("");
		}
		System.out.println("\nRodada X");
		System.out.println("         up         ");
		System.out.println("         ^          ");
		System.out.println("         |          ");
		System.out.println(" left <-   -> right ");
		System.out.println("         |          ");
		System.out.println("         v          ");
		System.out.println("        down         ");
		
	}
}
