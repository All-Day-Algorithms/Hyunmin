/** if�� ����غ���
 *  4 - 1546��: ��� 
 *  �ִ밪�� ã��, �� ������ �ٸ� ������ �ٲ� �� ����� ���ϴ� ����
 */
package lv4;

import java.util.Arrays;
import java.util.Scanner;

public class lv4_04 {
	public static void main(String[] args) {
		int M = 0; // �ִ�
		int cnt = 0; // ����
		double result = 0; // ���ο� ���
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] arr = new int[N];
		
		// arr �迭�� �� �ֱ�
		for(int i=0; i<arr.length;i++) {
			arr[i] = sc.nextInt();
			cnt += arr[i];
		}
		sc.close();
		
		// arr �迭 ���� �� �ִ밪(M)ã��
		Arrays.sort(arr);
		M = arr[arr.length-1];
		
		
		result = 100.0 * cnt / M / N;
		System.out.printf("%.2f",result);
		
	}

}
