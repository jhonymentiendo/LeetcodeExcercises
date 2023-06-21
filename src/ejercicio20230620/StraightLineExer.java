package ejercicio20230620;

public class StraightLineExer {

	public static void main(String[] args) {
		
		int[][] coordinates =  new int[][] {{1,2},{2,3},{3,4},{4,5},{5,6},{6,7}};
		
		System.out.println(checkStraightLine(coordinates ) );

	}
	
	public static boolean checkStraightLine(int[][] c) {
		boolean resp = true;
		int xmedia = c[1][0] - c[0][0];
		int ymedia = c[1][1] - c[0][1];
		for(int i =1 ; i< c.length ; i++){
			int x = c[i][0] - c[i-1][0];
            int y = c[i][1] - c[i-1][1];
			if(y*xmedia != x * ymedia) {
				return false;
			}	
		}
		return resp;
    }

}
