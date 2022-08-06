import java.util.Arrays;

public class Interface {
	

	String[][] janela = new String[3][3]; 
	
		
	public void criarInterface() {
		for (int linha=0;linha<3;linha++)
		{
			for (int coluna=0;coluna<3;coluna++)
			{
				janela[linha][coluna] = "|_|";				
			}
		}
	}
		
	public void mostrarInteface() {
		System.out.println("Player ♥: [X] | Enemy ♥: [XXX]\n");
		for (int linha=0;linha<3;linha++)
		{
			for (int coluna=0;coluna<3;coluna++)
			{
				System.out.println(Arrays.deepToString(janela).replace("[", "").replace("]", "").replace(",", ""));		
			}
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
