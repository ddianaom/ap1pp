
public class Spaceship{
	
	public String spaceship;
	public int x, y, life_points;
	
	public Spaceship(String ship, int pos_inicial_x, int pos_inicial_y, int life) {
		
		spaceship = ship;
		this.x = pos_inicial_x;
		this.y = pos_inicial_y;
		this.life_points = life;
	}
	
	public int Pegarvida() {
		return this.life_points;
	}
	
	public void Perdervida() {
		this.life_points = life_points - 1;
	}
		
}
