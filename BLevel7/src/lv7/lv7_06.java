/** ���ڿ� ����ϱ� �ܰ�
 *  6 - 1152 ��: �ܾ��� ����  
 *  �ܾ��� ������ ���ϴ� ����
 */

package lv7;

import java.util.Scanner;

public class lv7_06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int result = 0;
		String s = sc.nextLine();

		String word = "";
		for (int i = 0; i < s.length(); i++) {
			String c = String.valueOf(s.charAt(i));
			if (c.equals(" ")) {
				// �����̽��� ã�Ƴ���
				word = "";
			} else {
				if (word.length() == 0) {
					result++; // �����̽��� ���� �̱�
				}
				word = c;
			}
		}
		System.out.println(result);
	}

}
