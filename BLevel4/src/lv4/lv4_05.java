/** if�� ����غ���
 *  5 - 4344��: ����� �Ѱ��� 
 *  ����� �Ѵ� �л����� �ۼ��������� ����ϴ� ����
 */
package lv4;

import java.util.*;

public class lv4_05 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int C = sc.nextInt();	// ���̽���
		int N = 0;				// �л���
		
		double avg = 0;			// �������
		int[] arr = new int[1000];
		
		// ���̽� �� Ȯ��
		for (int i=0; i < C; i++) {
			N = sc.nextInt();
			int total = 0;			// �հ�
		    int num = 0;			// ��ճѴ� �л���
		
		    for(int j=0; j < N; j++) {	// �Է� �ݺ���
				arr[j] = sc.nextInt();
				total += arr[j]; 		// �հ豸�ϱ�
			}
			avg = (double)total / N;    // ��ձ��ϱ�
			
			for(int j=0; j < N; j++) { // �л��� ����
				if(arr[j]>avg) {
					num++;
				}
			}
			System.out.printf("%.3f", 100.0 * num / N);
			System.out.println("%");
		}
		sc.close();
	}
}
