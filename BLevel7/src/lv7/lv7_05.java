/** ���ڿ� ����ϱ� �ܰ�
 *  5 - 1316��: �׷� �ܾ� üĿ 
 *  ��Ģ�� �´� ���ĺ��� ������ ����ϴ� ����1
 */

package lv7;

import java.util.Scanner;

public class lv7_05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); // �ܾ� ���� n
		String[] words = new String[n];
		char[] seg;

		int check = 0;
		int answer = 0;

		for (int i = 0; i < n; i++) {
			words[i] = sc.next();
			seg = words[i].toCharArray(); // ����

			for (int a = 0; a < seg.length; a++) {
				for (int b = a + 1; b < seg.length; b++) { // ���� ���ڿ� ��
					if (seg[a] == seg[b] & seg[a] != seg[b - 1]) { // �ٸ� ���
						check = 1; // �ƴ��� check
					}
				}
			}
			if (check == 0) {
				answer += 1;
			}
			check = 0; // check ����
		}
		System.out.println(answer);
	}
}