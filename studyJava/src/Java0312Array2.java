import java.util.Arrays;

public class Java0312Array2 {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 8, 3, 2, 2, 2, 5, 1};
        int[] fr = new int[arr.length];
        int visited = -1;
        // 1차 for문
        for (int i = 0; i < arr.length; i++) {
            if (fr[i] == visited) {
                continue;
            }
            int count = 1;
            // 이중 for문 시작
            for (int j = i + 1; j < arr.length; j++) {
                // j는 1차 for문 i값 + 1 이미 체크한 배열은 다시 체크할 필요가 없기 때문에
                if (arr[i] == arr[j]) {
                    count++;
                    fr[j] = visited;
                    // count를 +1 시키고
                    // fr i+1번째 배열에 -1 대입 시키고
                    // 이중 for문 탈출
                }
            }

                // count = 1 만 유지하고 이중for문 탈출

                if (fr[i] != visited)
                    // fr의 배열안에 -1이 존하지 않는 상태면
                    // fr의 i번째 배열에 1 대입 ( 이중 for문의 if가 true일시 count + 1값 대입 )
                    fr[i] = count;
                System.out.println(Arrays.toString(fr));

                // 2를 찾았을 시 다음 2를 찾지않고 넘어가는 코드 완성 <== 숙제

            } // 1차 for문 탈출

// 2차 포문
            for (int i = 0; i < fr.length; i++) {
                // fr의 배열만큼
                if (fr[i] != visited)
                    // 만약 fr의 배열이 -1과 같지 않을때만 출력 후 탈출 ( 이중 for문의 if가 true일시 fr[-1] )
                    System.out.println("    " + arr[i] + "    |    " + fr[i]);
            }
        }
    }
