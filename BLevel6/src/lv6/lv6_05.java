/** 1���� �迭 ����ϱ�
 *  5 - 10039��: ��� ���� 
 *  ���ǿ� ���� �־��� �迭�� ����� ���ϴ� ����
 */
package lv6;

import java.util.Scanner;

public class lv6_05 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = 5;
		int[] arr = new int[N];
		int total=0;
		
		// arr �迭�� �� �ֱ�
		for(int i=0; i<arr.length;i++) {
			arr[i] = sc.nextInt();
			
			if(arr[i]>=40)
				total += arr[i];
			else
				total += 40;
		}
		
		System.out.println(total/5);
		sc.close();
	}

}
