
public class BookSearch {
    // 조회 메소드
    public static Book search(Book[] books, int id) {
        for(int i = 0; i < books.length; i++) {
        	if(books[i].id == id) {
                System.out.println("author: " + books[i].author + ", title: " + books[i].title);
        		return books[i];
        	}
        }
        System.out.println("검색결과가 존재하지 않습니다.");
        return null;
    }
}
