/** for�� ����غ���
 *  10 - 11720��: ������ �� 
 *  �־��� ���� ��� ���ϴ� ����
 *  
 */

package lv3;

import java.util.*;

public class lv3_10 {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        int num = sc.nextInt();
	        int sum = 0;
	        String number = sc.next();
	        
	        sc.close();
	        for(int i=0; i<number.length(); i++) {
	        	//charAt-  source���� �ѹ��ھ� ���ʴ�� �о�� �� �ִ�
	            sum += number.charAt(i)-'0';
	        }
	        System.out.print(sum);
	    }
	
}
