
public class Book {
    public String title;
    public String author;
    public int id;

    // 생성자
    public Book(String title, String author, int id) {
        this.title = title;
        this.author = author;
        this.id = id;
    }

    // 조회 메소드
    public String getBookInfo() {
        if (title != null && author != null) {
            return "Title: " + title + ", Author: " + author;
        } else {
            return "No book information available.";
        }
    }

    // 삭제 메소드
    public void deleteBook() {
        this.title = null;
        this.author = null;
    }

    // 등록 메소드
    public void registerBook(String title, String author) {
        this.title = title;
        this.author = author;
    }
}