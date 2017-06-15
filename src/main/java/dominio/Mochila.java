package dominio;

public class Mochila {
	
	//private ArrayList<Item> items;
	private int[] inventario = {1,0,0,0,0,1,0,1,0,1};
	
	public Mochila(){
		////items = new ArrayList<Item>();
	}
	
	public void add (Item item){
		inventario[item.getId() - 1]++;
	}

	public int[] getInventario() {
		return inventario;
	}

	public void setInventario(int[] inventario) {
		this.inventario = inventario;
	}
	
			
}
