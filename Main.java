package HomeWork1;

public class Main {

	public static void main(String[] args) {
		
		
		Printable [] printable = new Printable[6];
		printable[0] = new Book("������ �����", "����� ����� ����");
		printable[1] = new Magazine("�����", 10000);
		printable[2] = new Book("�����", "����� ������");
		printable[3] = new Magazine("��������", 20000);
		printable[4] = new Book("������� �����", "���� �������");
		printable[5] = new Magazine("������ ���", 5000);
		
		
		for (Printable member : printable) {
			member.print();
		}
		
		Book.printBooks(printable);
		
		Magazine.printBooks(printable);

	}

}
