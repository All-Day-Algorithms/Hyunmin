/** �����غ���
 *  3 - 10989��: �� �����ϱ�3  
 *  ī���� ����(Counting Sort) Ȥ�� ��� ����(Radix Sort)�� ����� ���ϴ�
 */

package lv9;

	import java.io.BufferedReader;
	import java.io.IOException;
	import java.io.InputStreamReader;
	import java.util.Scanner;
	import java.util.StringTokenizer;
	
public class lv9_03 {		 

		    int[] numbers; //�Էµ� ����
		    int[] countArr;//���� ����
		    int[] result; //���ĵ� �� ���� ����
		    int max = 0;
		 
		    void inputNumbers() throws IOException {//���� �Է��ϱ�
		        Scanner sc = new Scanner(System.in);
		        int size = sc.nextInt();
		        numbers = new int[size];
		        for (int i = 0; i < numbers.length; i++) {
		            int num = sc.nextInt();
		            numbers[i] = num;
		            if (max < num) {
		                max = num;
		            }
		        }
		    }
		 
		    int findMaxNumber() {//�ִ� ã��
		        int max = 0;
		        for (int i = 0; i < numbers.length; i++) {
		            if (max < numbers[i]) {
		                max = numbers[i];
		            }
		        }
		        return max;
		    }
		 
		    void display() {
		        for (int i = 0; i < countArr.length; i++) {
		            System.out.print(countArr[i] + " ");
		        }
		        System.out.println();
		    }
		 
		    void display(int[] arr) {
		        for (int i = 0; i < arr.length; i++) {
		            System.out.print(arr[i]+" ");
		        }
		        System.out.println();
		    }
		 
		    void sort() throws IOException {
		        inputNumbers();
		        //int maxNumber = findMaxNumber();//�ִ� ����
		        int maxNumber = max;
		        countArr = new int[maxNumber + 1]; //0-maxNumber+1��ŭ ����
		        result = new int[numbers.length];
		 
		        for (int i = 0; i < numbers.length; i++) {
		            //�ش��ϴ� ���� ī����
		            countArr[numbers[i]]++;
		        }
		        //System.out.println("CountArr[]=");
		        //display();
		 
		        for (int i = 1; i < countArr.length; i++) {
		            //���� ���� ���ϱ�
		            countArr[i] += countArr[i - 1];
		        }
		        //System.out.println("���� �迭");
		        //display();
		 
		        for (int i = numbers.length - 1; i >= 0; i--) {
		            //�����ϱ�
		            result[--countArr[numbers[i]]] = numbers[i];
		            //countArr[numbers[i]]--;
		        }
		        display(result);
		    }
		 
		 
		    public static void main(String[] args) throws IOException {
		        new lv9_03().sort();
		 
		 
	}

}
