import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class BinarySearchBookTest {
	@BeforeEach
	void setUp() {
		
	}
	
	@Test
	void testBinarySearch_Small() {
		System.out.println("target ID가 작은 경우 테스트");
	    int[] bookIds = {1, 2, 3, 4, 5};
	    int targetId = 1;
	    int expected = 0;
	    assertEquals(expected, BinarySearchBook.search_bs(bookIds, targetId));
	    System.out.println("테스트 통과");
	   }
	
    @Test
    void testBinarySearch_Mid() {
       System.out.println("target ID가 중간 크기인 경우 테스트");
        int[] bookIds = {1, 2, 3, 4, 5};
        int targetId = 3;
        int expected = 2;
        assertEquals(expected, BinarySearchBook.search_bs(bookIds, targetId));
        System.out.println("테스트 통과");
    }

    @Test
    void testBinarySearch_Large() {
       System.out.println("target ID가 큰 경우 테스트");
        int[] bookIds = {1, 2, 3, 4, 5};
        int targetId = 5;
        int expected = 4;
        assertEquals(expected, BinarySearchBook.search_bs(bookIds, targetId));
        System.out.println("테스트 통과");
    }
    
    @Test
    void testBinarySearch_NoResult() {
       System.out.println("target ID가 존재하지 않는 경우 테스트");
        int[] bookIds = {1, 2, 3, 4, 5};
        int targetId = 6;
        int expected = -1;
        assertEquals(expected, BinarySearchBook.search_bs(bookIds, targetId));
        System.out.println("테스트 통과");
    }
}