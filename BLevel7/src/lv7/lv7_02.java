/** ���ڿ� ����ϱ� �ܰ�
 *  2 - 10809��:  ���ĺ� ã��
 *  �� �ܾ�� �� ���ĺ��� ó�� �����ϴ� ��ġ�� ã�ƺ��ϴ�
 */

package lv7;

import java.util.Arrays;
import java.util.Scanner;

public class lv7_02 {

	public static void main(String[] args) {
		        Scanner sc = new Scanner(System.in); 
		        
		        String input = sc.nextLine();
		        
		        //�迭 ���
		        int[] arr = new int[26];
		        Arrays.fill(arr, -1);	// �迭 �ʱ�ȭ
		        
		        for (int i=0; i<input.length(); i++){
		            char tmp  = input.charAt(i);		// �ε��� ��ġ �ش� ���� ����
		            int index = input.indexOf(tmp);
		            
		            arr[tmp-97] = index;	// ��Ʈ�� �迭�� ���
		        }
		        
		        for (int i = 0; i < arr.length; i++)
		            System.out.print((i != arr.length -1) ? arr[i] + " " : arr[i]);
		        //���ٽ����� �ε��� ����
		      sc.close();  
	}

}
