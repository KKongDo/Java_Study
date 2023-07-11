package s1210;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution{
	public static void main(String[] args) throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		int T;
		int start = 1, end = 98;
		int[][] data = new int[100][100];
		boolean[][] visit;

		for (int test_case = 1; test_case <= 10; test_case++) {
			StringTokenizer st=new StringTokenizer(br.readLine());
			T = Integer.parseInt(st.nextToken());
			visit = new boolean[100][100];
			end = 98;

			for (int i = 0; i < 100; i++) {
				st=new StringTokenizer(br.readLine());
				for (int j = 0; j < 100; j++) {
					data [i][j] = Integer.parseInt(st.nextToken());
				}
			}
			for (int k = 0; k < 100; k++) {
				if(data [end + 1][k] == 2) {
					start = k;
				}
			}
			while (true) {
				if(end == 0) {
					break;
				}
				else if (start - 1 > 0 && start + 1 < 100 && data [end][start - 1] == 0 && data [end][start + 1] == 0) {//좌우 길이 없고 벽이 아닐 때
					visit[end][start] = true;
					end--;
				}
				else if (start - 1 > 0 && data [end][start - 1] == 1 && visit[end][start - 1] == false) {//왼쪽 길																				
					visit[end][start] = true;
					start--;
				}
				else if (start + 1 < 100 && data [end][start + 1] == 1 && visit[end][start + 1] == false) {//오른쪽 길
					visit[end][start] = true;
					start++;
				}
				else if(start - 1 < 0 || start + 1 >= 100) {//왼쪽 또는 오른쪽이 벽일 때
					visit[end][start] = true;
					end--;
				}
				else if(visit[end][start - 1] == false || visit[end][start + 1] == false) {//왼쪽이나 오른쪽 길을 지나왔을 때
					visit[end][start] = true;
					end--;
				}
			}
			System.out.println("#" + T + " " + start);
		}
	}
}