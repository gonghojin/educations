package behavior.iterator;

public class Client {
	public static void main(String[] args) {
		BookShelf bookShelf = new BookShelf(4);
		bookShelf.appendBook(new Book("A around 1"));
		bookShelf.appendBook(new Book("B around 2"));

		MyIterator myIterator = bookShelf.iterator();
		while (myIterator.hasNext()) {
			Book book = (Book) myIterator.next();
			System.out.println(" " + book.getName());
		}

	}

}
