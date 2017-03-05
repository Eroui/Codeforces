import java.util.*;


/**
 * @Author : Eroui Abdelaziz
 * @Verdic : AC
 */

public class CF279D2A {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		
		int x = in.nextInt();
		int y = in.nextInt();
		int cx = 0, cy=0, ans = 0;
		int minx = 0, maxx = 0, miny = 0, maxy = 0;

		int dir = 0;
		while(true) {

			int tmpx = cx;
			int tmpy = cy;

			if(dir == 0) {
				tmpx = ++maxx;
			}else if(dir == 1) {
				tmpy = ++maxy;
			}else if(dir == 2) {
				tmpx = --minx;
			}else {
				tmpy = --miny;
			}


			if(x == cx || y == cy) {
				if(minx <= x && maxx >= x && miny <= y && maxy >= y) 
					break;
			}


			cx = tmpx;
			cy = tmpy;

			ans++;
			dir = (dir+1) % 4;
		}

		System.out.println(ans);
	}

}