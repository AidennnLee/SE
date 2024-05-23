import java.util.ArrayList;

public class BookList {
	ArrayList<Book> bookList = new ArrayList<Book>();
	
    // 조회 메소드
    public String getBookInfo() {
    	for(int i = 0; i < bookList.size(); i++) {
    		System.out.println("Title: " + bookList.get(i).title + ", Author: " + bookList.get(i).author);
    	}
        return "No book information available.";
    }

    // 삭제 메소드
    public void deleteBook(Book book) {
        bookList.remove(book);
    }

    // 등록 메소드
    public void registerBook(String title, String author) {
    	Book b = new Book(title, author);
    	bookList.add(b);
    }
}
