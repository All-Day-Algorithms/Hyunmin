/** for�� ����غ���
 *  6 - 2440��: �� ��� - 3 
 *  ù° �ٿ��� �� N��, ��° �ٿ��� �� N-1��, ..., N��° �ٿ��� �� 1���� ����� ���ϴ�.
 */

package lv3;

import java.util.Scanner;

public class lv3_06 {
	public static void main(String[] args)
	{	
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		sc.close();
				
		for(int i = 1; i < num + 1 ; i++) {
			for(int j = num ; j > 0; j--) {
				if( i <= j )
					System.out.print("*");
				else
					System.out.print("");
			}
			System.out.println();
			
		}
		
	}
}