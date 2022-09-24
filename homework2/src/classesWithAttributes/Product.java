package classesWithAttributes;

public class Product {
	
	//Constructor Baþlangýcý
	public Product() {
		System.out.println("Yapýcý Blok Çalýþtý");
	}
	//Constructor Sonu

	
	
	
	
	// attiribute | field
	private int _id;
	private String _name;
	private String _description;
	private double _price;
	private int _stockAmoýnt;
	private String _kod;

	public int get_id() {
		return _id;
	}

	public void set_id(int _id) {
		this._id = _id;
	}

	public String get_name() {
		return _name;
	}

	public void set_name(String _name) {
		this._name = _name;
	}

	public String get_description() {
		return _description;
	}

	public void set_description(String _description) {
		this._description = _description;
	}

	public double get_price() {
		return _price;
	}

	public void set_price(double _price) {
		this._price = _price;
	}

	public int get_stockAmoýnt() {
		return _stockAmoýnt;
	}

	public void set_stockAmoýnt(int _stockAmoýnt) {
		this._stockAmoýnt = _stockAmoýnt;
	}

	public String get_kod() {
		return _name.substring(0, 1) + _id;
	}

}
