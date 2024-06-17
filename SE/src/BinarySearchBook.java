public class BinarySearchBook {

    public static int binarySearch(int[] bookIds, int targetId) {
        int left = 0;
        int right = bookIds.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            // 타겟 아이디를 찾은 경우
            if (bookIds[mid] == targetId) {
                return mid;
            }
            
            // 타겟 아이디가 중간 값보다 큰 경우
            if (bookIds[mid] < targetId) {
                left = mid + 1;
            } 
            
            // 타겟 아이디가 중간 값보다 작은 경우
            else {
                right = mid - 1;
            }
        }

        // 타겟 아이디를 찾지 못한 경우
        return -1;
    }
}