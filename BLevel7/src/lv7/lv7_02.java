/** 문자열 사용하기 단계
 *  2 - 10809번:  알파벳 찾기
 *  한 단어에서 각 알파벳이 처음 등장하는 위치를 찾아봅니다
 */

package lv7;

import java.util.Arrays;
import java.util.Scanner;

public class lv7_02 {

	public static void main(String[] args) {
		        Scanner sc = new Scanner(System.in); 
		        
		        String input = sc.nextLine();
		        
		        //배열 사용
		        int[] arr = new int[26];
		        Arrays.fill(arr, -1);	// 배열 초기화
		        
		        for (int i=0; i<input.length(); i++){
		            char tmp  = input.charAt(i);		// 인덱스 위치 해당 문자 춫출
		            int index = input.indexOf(tmp);
		            
		            arr[tmp-97] = index;	// 인트형 배열에 담기
		        }
		        
		        for (int i = 0; i < arr.length; i++)
		            System.out.print((i != arr.length -1) ? arr[i] + " " : arr[i]);
		        //람다식으로 인덱스 추출
		      sc.close();  
	}

}
