/** ����� �޾ƺ���
 *	7 - 11718��: �Է¹��� ���ڸ� ����ϴ� ����1
 *  Scanner / while��
 */

package ch1;

import java.util.Scanner;

public class ch1_7 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(sc.hasNextLine()) {
				String input = sc.nextLine();
				System.out.println(input);
		}
		sc.close();
	}
}
