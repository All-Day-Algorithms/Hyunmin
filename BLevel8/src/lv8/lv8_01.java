/** ��Ģ ã��
 *  1 - 2438��: �� ��� - 1   
 *  ��� ������ �� ����� ���� ��Ģ�� ������ ���ϴ�
 */
package lv8;
	
import java.util.*;

public class lv8_01 {
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			int num = sc.nextInt();
			sc.close();
			
	        for(int i = 0; i < num; i++) {
	            for(int j = 0; j <= i ; j++){
	                System.out.print("*");
	            }
	            System.out.println();
	        }
		}
	}
		