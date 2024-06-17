import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;



import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;


class booktest {
	private booktest junit;
	private String string;

	@BeforeEach
	void setUp() {
		junit = new booktest();
		System.out.println("새 Junit 인스턴스 생성");
		
	}

	@Test
	void testInfo() {
		System.out.println("조회 테스트 시작");
		private String info = "Title: 폭풍의 언덕, Author: 에밀리 브론테";
		assertEquals(Info, book());
		System.out.printIn("조회 테스트 통과");
	}
	
	void testdelete() {
		System.out.println("삭제 테스트 시작");
		string delete() = "Title: 폭풍의 언덕, Author: 에밀리 브론테";
		assertEquals(delete(), null);
		System.out.printIn("삭제 테스트 통과");
	}
	
	
	void testregister() {
		System.out.println("등록 테스트 시작");
		string register() = "Title: 폭풍의 언덕, Author: 에밀리 브론테";
		assertEquals(register()), book());
		System.out.printIn("등록 테스트 통과");
	}
	

}
