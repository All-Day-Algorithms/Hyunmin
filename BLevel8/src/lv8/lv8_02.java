/** ��Ģ ã��
 *  2 - 2292��: ����    
 *  ������ �����Ǵ� ��Ģ�� ������ ������ �ذ��� ���ϴ�
 */

package lv8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class lv8_02 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		System.out.print(solution(n));
	}

	private static int solution(int n) {
		// 1: 1 (1)
		// a(n) = a(n-1) + 6(n-1) | a(n): ù ��
		if (n == 1)
			return 1; 	// 1: 1 (1)
		
		int i = 2;
		int k = 1;

		while (i <= n) { // a(n) = a(n-1) + 6(n-1) | a(n): ù ��
			i += 6 * k++;
		}

		return k;
	}
}
