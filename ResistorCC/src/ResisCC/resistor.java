package ResisCC;
import java.util.HashMap;
import java.util.Scanner;
class data {
	
	int colors(String c1,String c2) {
		HashMap<String,String> map =new HashMap<>();
		map.put("black","0");
		map.put("brown","1");
		map.put("red","2");
		map.put("orange","3");
		map.put("yellow","4");
		map.put("green","5");
		map.put("blue","6");
		map.put("violet","7");
		map.put("grey","8");
		map.put("white","9");
		String m3 = map.get(c1)+map.get(c2);
		int m4 = Integer.parseInt(m3);
		return m4;
	}
		
	
	float tolerance(String c3){
		HashMap<String,Float> map3 =new HashMap<>();
		map3.put("black", 20f);
		map3.put("brown",1f);
		map3.put("red",2f);
		map3.put("green",0.5f);
		map3.put("blue",0.25f);
		map3.put("violet",0.1f);
		map3.put("grey",0.05f);
		map3.put("white",10f);
		map3.put("gold", 5f);
		map3.put("silver", 10f);
		return map3.get(c3);
	}
	float multiplier(String c4) {
		HashMap<String,Float> map2 =new HashMap<String,Float>();
		map2.put("black", 1f);
		map2.put("brown",10f);
		map2.put("red",100f);
		map2.put("orange",1000f);
		map2.put("yellow",10000f);
		map2.put("green",100000f);
		map2.put("blue",1000000f);
		map2.put("violet",10000000f);
		map2.put("grey",100000000f);
		map2.put("white",1000000000f);
		map2.put("gold",0.1f);
		map2.put("silver",0.01f);
		return map2.get(c4);
	}
}
public class resistor{

	public static void main(String[] args) {
		System.out.println("Enter first colour in smalls: ");
		Scanner sc = new Scanner(System.in);
		String c1 = sc.next();
		System.out.println("Enter second colour in smalls: ");
		String c2 = sc.next();
		System.out.println("Enter third colour in smalls: ");
		String c4 = sc.next() ;
		System.out.println("Enter fourth colour in smalls: ");
		String c3 = sc.next();
		data d = new data();
		float value = (int)(d.colors(c1, c2)*d.multiplier(c4)); 
		float fr = d.tolerance(c3);
		int finalValue1 = (int)(value+(100/fr));
		int finalValue2 =(int)( value-(100/fr));
		
		System.out.println("The value of resistor is " +value+ " \u00B1"+fr+"% ohms");
		System.out.println("The resistance values ranges between from: "+ finalValue2+ " to "+ finalValue1);
		sc.close();
	}
	
}