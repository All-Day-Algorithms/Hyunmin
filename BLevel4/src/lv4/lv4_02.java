/** if�� ����غ���
 *  2 - 10817��: �� �� 
 *  �� ���� A, B, C �߿� �� ��°�� ū ���� ã�ƺ���
 */
package lv4;

import java.util.*;

public class lv4_02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		sc.close();
		
		if (A >= B) {
			if (A >= C) {
				if(C >= B) {
					System.out.println(C);
				} else {
					System.out.println(B);
				}
			} else if (A <= C) {
				System.out.println(A);
			}
			
		} else if (B >= A) {
			if (B >= C) {
				if(A >= C) {
					System.out.println(A);
				} else {
					System.out.println(C);
				}
			} else if (B <= C) {
				System.out.println(B);
			}
		}
	}
}
	
