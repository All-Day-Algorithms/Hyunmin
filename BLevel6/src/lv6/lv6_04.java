/** 1���� �迭 ����ϱ�
 *  4 - 2920��: ���� 
 *  �־��� �迭�� ������������ �ƴ��� �Ǵ��ϴ� ����
 */
package lv6;

import java.io.*;

public class lv6_04 {
    public static void main(String[] args) throws IOException {
    	//���۸��� ����ϱ�
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        String note = br.readLine().trim();
        
        //���۸��� ����ϱ�
        if(note.equals("1 2 3 4 5 6 7 8")) {
            bw.write("ascending");
        }else if(note.equals("8 7 6 5 4 3 2 1")) {
            bw.write("descending");
        }else {
            bw.write("mixed");
        }
        bw.flush();
    }
 
}
