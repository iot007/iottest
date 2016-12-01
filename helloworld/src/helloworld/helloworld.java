package helloworld;

public class helloworld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		char [] hello =  {'h', 'e', 'l', 'l', 'o', ' ', 'W', 'o' , 'r', 'l', 'd'};
		
		String x = "";
		
		for(int i=0; i < hello.length;i++){
			x += hello[i];
		}
		
		System.out.println(x);
		System.out.println(x + x);
	}

}
