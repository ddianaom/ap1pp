import java.util.Random;
import javax.swing.JOptionPane;

public class Spaceship{
	
	public String spaceship;
	public int x, y, life_points;
	Random rand = new Random(); 
	
	public Spaceship(String ship, int pos_inicial_x, int pos_inicial_y, int life) {
		
		this.x = pos_inicial_x;
		this.y = pos_inicial_y;
		this.life_points = life;
	}
	
	public int Getposition_x() {
		return this.x;
	}
	
	public int Getposition_y() {
		return this.y;
	}
	
	public int Pegarvida() {
		return this.life_points;
	}
	
	public void Perdervida(Boolean colision) {
		if(colision) {
			this.life_points = this.life_points - 10;
			this.y -= 1;
			JOptionPane.showMessageDialog(null, "DOEU!!!");
		}
	}
	
	public void Perdervidaenemy(Boolean colisionenemy) {
		if(colisionenemy) {
			this.life_points = this.life_points - 10;
			this.y -= 1;
			JOptionPane.showMessageDialog(null, "BUUUM!!! ACERTOU!!!");
		}
	}
	
	public void Movimentacaoaleatoria() {
		int randomNum = rand.nextInt(10);
		this.x = randomNum;
		this.y = randomNum;
	}
	
	public void Movimentacao(String direction) {
		switch (direction) {
			
		case "9":
			this.y += 1;
			
		case "3":
			this.y += 1; // PARA DIREITA
			this.x += 1 - 2;
			
		case "2": // PARA BAIXO
			this.y += 1;
			this.x += 1;
			
		case "1": // PARA ESQUERDA
			this.y += 1 - 2;
			this.x += 1;
			
		case "5": // PARA CIMA
			this.x -= 1;
		}
	}
	
	public Boolean Colision(int pos_x_1, int pos_y_1, int pos_x_2, int pos_y_2) {
		if(pos_x_1 == pos_x_2 && pos_y_1 == pos_y_2) {
			return true;
		} else {
			return false;
		}
	}
	
	public Boolean Colisionenemy(int pos_y_1, int pos_y_2) {
		if(pos_y_1 == pos_y_2) {
			return true;
		}else {
			return false;
		}
	}
		
}
