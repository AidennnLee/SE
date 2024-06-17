
public class BookSearch {
    // 조회 메소드
    public Book search(Book[] books, int id) {
        for(int i = 0; i < books.length; i++) {
        	if(books[i].id == id) {
        		return books[i];
        	}
        }
        return null;
    }
}
