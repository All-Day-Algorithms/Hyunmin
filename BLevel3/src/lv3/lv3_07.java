/** for�� ����غ���
 *  7 - 2441��: �� ��� - 4
 *  ù° �ٿ��� �� N��, ��° �ٿ��� �� N-1��, ..., N��° �ٿ��� �� 1���� ����� ���ϴ�. (������ ����)
 */

package lv3;
import java.util.Scanner;
public class lv3_07 {
	public static void main(String[] args)
		{	
			Scanner sc = new Scanner(System.in);
			int num = sc.nextInt();
			sc.close();
			//int num = 5;
			
			for (int i = 1; i <= num; ++i) {
	            for (int j = 1; j <= i - 1; ++j) {
	                System.out.print(" ");
	            }
	            for (int j = 1; j <= num - i + 1; ++j) {
	                System.out.print("*");
	            }
	            System.out.println();
	        }
	    }
	}