/** ��Ģ���� �����ϱ�
 *	6 - 10430��: ������ ������ �ϰ� ����� ����� ����� �� ����� ������ ������ ����� ������ ���캸��
 * 
 */

package lv2;

import java.util.Scanner;

public class lv2_6 {
	    public static void main(String[] args){
	        Scanner sc = new Scanner(System.in);
	        int A = sc.nextInt();
	        int B = sc.nextInt();
	        int C = sc.nextInt();
	        sc.close();
	        
	        System.out.println((A+B)%C);
	        System.out.println((A%C + B%C)%C);
	        System.out.println((A*B)%C);
	        System.out.println((A%C * B%C)%C);
	    }
}
