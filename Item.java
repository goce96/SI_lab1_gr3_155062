class Item {
	int id;
	String name;
	double price;
	char tipDanok;

	public Item(int id, String name, double price, char tipDanok) {
		this.id = id;
		this.name = name;
		this.price = price;
		this.tipDanok = tipDanok;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public char getTipDanok() {
		return tipDanok;
	}

	public void setTipDanok(char tipDanok) {
		this.tipDanok = tipDanok;
	}
	//TODO add variable.

	//TODO constructor

	//TODO setters and getters

	double taxReturn () {
		return price*0.15;
		//TODO
	}
}