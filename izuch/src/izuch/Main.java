package izuch;

import java.util.ArrayList;
import java.util.Random;

public class Main {
	private static ArrayList<Mobile> mobiles = new ArrayList<Mobile>();
	private static Random r = new Random();

	public static void main (String[] args) {
		for(int i=0;i<300;i++){
			mobiles.add(new Mobile(r.nextInt(1000), "sdffadfr"));
}
		for(Mobile m: mobiles){
			System.out.println(m.getNumber()+" "+m.getName());
	}
}
}
