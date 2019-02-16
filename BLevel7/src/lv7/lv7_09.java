/** ���ڿ� ����ϱ� �ܰ�
 *  9 - 2941 ��: ũ�ξ�Ƽ�� ���ĺ� 
 *  ��Ģ�� �´� ���ĺ��� ������ ����ϴ� ����2
 */

package lv7;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class lv7_09 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		String input = br.readLine().trim();
		int result = 0;
		int length = input.length();

		int i;
		for (i = 0; i < length; i++) {
			result++;
			// if ������ ���ĺ� Ȯ��
			switch (input.charAt(i)) {

			// 	c=, c-
			case 'c':
				if (i < length - 1 && (input.charAt(i + 1) == '=' || input.charAt(i + 1) == '-')) {
					i++;
				}
				break;
			//  dz=, d-
			case 'd':
				if (i < length - 2 && input.charAt(i + 1) == 'z' && input.charAt(i + 2) == '=') {
					i += 2;
				} else if (i < length - 1 && input.charAt(i + 1) == '-') {
					i++;
				}
				break;
			// lj, nj
			case 'l':
			case 'n':
				if (i < length - 1 && input.charAt(i + 1) == 'j') {
					i++;
				}
				break;
		    // s=, z=
			case 's':
			case 'z':
				if (i < length - 1 && input.charAt(i + 1) == '=') {
					i++;
				}
				break;
			}
		}

		bw.write(result + "");
		bw.flush();

		br.close();
		bw.close();
	}

}
