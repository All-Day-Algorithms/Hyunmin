/** 1���� �迭 ����ϱ�
 *  2 - 2577��: ������ ���� 
 *  �� ���� ���� ���� �� �ڸ����� �ش��ϴ� ������ ������ �����ϱ� ���� 1���� �迭�� �����Ͽ� ������ �ذ��غ��ϴ�
 */

package lv6;
import java.util.Scanner;

public class lv6_02 {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        sc.close();
         
        int[] counts = new int[10];
 
        int number = A * B * C;
        
        while (number > 0) {
            counts[number % 10]++;
            number = number / 10;
        }
         
        for (int i = 0; i < counts.length; ++i) {
            System.out.println(counts[i]);
        }
    }
}