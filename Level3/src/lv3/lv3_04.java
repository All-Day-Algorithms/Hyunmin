/** for문 사용해보기
 *  4 - 2438번: 별찍기 -1
 *  첫째 줄에는 별 1개, 둘째 줄에는 별 2개, N번째 줄에는 별 N개 출력해 봅니다
 *  
 */

package lv3;

import java.util.*;

public class lv3_04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		sc.close();
		
		for(int i = 0; i < num; i++) {
			for(int j = 0; j <= i ; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
	
