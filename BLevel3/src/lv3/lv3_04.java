/** for�� ����غ���
 *  4 - 2438��: ����� -1
 *  ù° �ٿ��� �� 1��, ��° �ٿ��� �� 2��, N��° �ٿ��� �� N�� ����� ���ϴ�
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
	
