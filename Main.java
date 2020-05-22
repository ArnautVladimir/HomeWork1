package HomeWork1;

public class Main {

	public static void main(String[] args) {
		
		
		Printable [] printable = new Printable[6];
		printable[0] = new Book("Шерлок Холмс", "Артур Конан Дойл");
		printable[1] = new Magazine("Спорт", 10000);
		printable[2] = new Book("Пуаро", "Агата Кристи");
		printable[3] = new Magazine("Мурзилка", 20000);
		printable[4] = new Book("Комисар Мегре", "Жорж Сименон");
		printable[5] = new Magazine("Сделай сам", 5000);
		
		
		for (Printable member : printable) {
			member.print();
		}
		
		Book.printBooks(printable);
		
		Magazine.printBooks(printable);

	}

}
