/** if�� ����غ���
 *  1 - 9498��: ���� ���� 
 *  ���� ������ �Է¹ް� ���� ����غ���
 */
package lv4;

import java.util.*;

public class lv4_01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int score = sc.nextInt();
		sc.close();
		
		if (score >= 90 && score <= 100) {
			System.out.println("A");
		} else if(score >= 80 && score < 90) {
			System.out.println("B");
		} else if(score >= 70 && score < 80) {
			System.out.println("C");
		} else if(score >= 60 && score < 70) {
			System.out.println("D");
		} else {
			System.out.println("F");
		}
	}
}
