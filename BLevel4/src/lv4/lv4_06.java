/** if�� ����غ���
 *  6 - 1110��: ���ϱ� ����Ŭ 
 *  ������ ������ ������ ��� ���ϴ� ����
 */
package lv4;

import java.util.*;

public class lv4_06 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int cnt = 0;
		int tmp = N;
		
		
		while(true) {
			int a = tmp/10;
			int b = tmp%10;
			
			if (a+b < 10) {
				tmp = b*10 +a +b;
			} else {
				tmp = b* 10 + (a+b)%10;
			}
			
			cnt++;
			if(tmp == N)
				break;
		}
		System.out.println(cnt);
		sc.close();
	}
}
