/** 1���� �迭 ����ϱ�
 *  1 - 1152��: �ܾ��� ���� 
 *  ������ ���ڿ� �迭���� �ܾ��� ������ ���غ��ϴ�
 */

package lv6;

import java.util.Scanner;
import java.util.StringTokenizer;

public class lv6_01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String N = sc.nextLine();
		
		// StringTokenizer : ���ڿ� ������
		StringTokenizer strToken = new StringTokenizer(N," ");
		// countTokens : ��ū ���� ����
		System.out.println(strToken.countTokens());	
		sc.close();
	}
}
