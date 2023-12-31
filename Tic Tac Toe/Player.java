package tic_tac_toe;

public class Player {
	
	private String name;
	private char symbol;
	
	public Player(String name, char symbol) {
		setName(name);
		setSymbol(symbol);
	}
	
	public void setName(String name) {
		if(!name.isEmpty()) {
			this.name = name;
		}
	}
	
	public String getName() {
		return name;
	}
	
	public void setSymbol(char symbol) {
		if(symbol != '\0') {
			this.symbol = symbol;  // \0 is null character
		}
	}
	
	public char getSymbol() {
		return symbol;
	}

}
