import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class BookSearchTest {
	
	private Book[] bookArray;

	@BeforeEach
	void setUp() {
		bookArray = new Book[5];
		
		bookArray[0] = new Book("부활", "톨스토이", 0);
		bookArray[1] = new Book("어린왕자", "생텍쥐페리", 1);
		bookArray[2] = new Book("신곡", "단테", 2);
		bookArray[3] = new Book("변신", "카프카", 3);
		bookArray[4] = new Book("동물농장", "조지 오웰", 4);
	}
	
	@Test
	void testSearch1() {
		System.out.println("search 테스트1");
		int id = 0;
        Book expected = bookArray[0];
        assertEquals(expected, BookSearch.search(bookArray, id));
        System.out.println("테스트 통과");
	}
	
	@Test
	void testSearch2() {
		System.out.println("search 테스트2");
		int id = 2;
        Book expected = bookArray[2];
        assertEquals(expected, BookSearch.search(bookArray, id));
        System.out.println("테스트 통과");
	}
	
	@Test
	void testSearch3() {
		System.out.println("search 테스트3");
		int id = 4;
        Book expected = bookArray[4];
        assertEquals(expected, BookSearch.search(bookArray, id));
        System.out.println("테스트 통과");
	}
	
	@Test
	void testSearch4() {
		System.out.println("검색결과가 없는 경우 search 테스트");
		int id = 5;
        Book expected = null;
        assertEquals(expected, BookSearch.search(bookArray, id));
        System.out.println("테스트 통과");
	}
}
