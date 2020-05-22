package HomeWork1;

public class Book implements Printable {
	
	private String name;
	private String author;

	public Book(String name, String author) {
		this.name = name;
		this.author = author;
	}

	public Book() {
	}

	@Override
	public void print() {
		System.out.println("Book");
		
		}
	
	public static void printBooks(Printable[] printable) {
		for (Printable member : printable) {
			if (member instanceof Book) {
				System.out.println(((Book) member).getName());
			}
			
		}
	};

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	@Override
	public String toString() {
		return "Book [name=" + name + ", author=" + author + "]";
	}	
	
}


