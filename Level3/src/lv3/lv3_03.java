/** for�� ����غ���
 *  3 - 2739��: ������
 *  �������� ����� ���ϴ�. 
 *  
 */

package lv3;

import java.util.Scanner;

public class lv3_03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int dan = sc.nextInt();
		sc.close();
		
		for(int i=1; i < 10; i++) {
			System.out.printf("%d * %d = %d%n", dan, i, dan * i);
		}
	}
}

