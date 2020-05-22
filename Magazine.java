package HomeWork1;

public class Magazine implements Printable {
	
	private String name;
	private int edition;
	
	
	
	public Magazine(String name, int edition) {
		this.name = name;
		this.edition = edition;
	}



	public Magazine() {
	}



	@Override
	public void print() {
		
		System.out.println("Magazine");
		}
	
	public static void printBooks(Printable[] printable) {
		for (Printable member : printable) {
			if (member instanceof Magazine) {
				System.out.println(((Magazine) member).getName());
			}
		}
	}


	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public int getEdition() {
		return edition;
	}



	public void setEdition(int edition) {
		this.edition = edition;
	}



	@Override
	public String toString() {
		return "Magazine [name=" + name + ", edition=" + edition + "]";
	}

}
