/** ���ڿ� ����ϱ� �ܰ�
 *  3 - 2675 ��: ���ڿ� �ݺ�
 *  ���ڿ��� �� ���ڸ� �ݺ��Ͽ� ����غ��ϴ�
 */

package lv7;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class lv7_03 {

	public static void main(String[] args) throws IOException {
	// ���۸��� - �Է� / ���۶����� - ���
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int t = Integer.parseInt(br.readLine());
		while (t-- > 0) { // ���ڴ� �ݺ����
			String[] temp = br.readLine().trim().split(" ");
			int r = Integer.parseInt(temp[0]);
			String s = temp[1];
			int i, j;
			for (i = 0; i < s.length(); i++) { // �ε��� ���̸�ŭ ��ŭ ���
				for (j = 0; j < r; j++) {
					bw.write(s.charAt(i));	
				}
			}
			bw.write("\n");
		}

		bw.flush();
		br.close();
		bw.close();
	}

}
