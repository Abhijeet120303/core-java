package arryList;
import java.util.ArrayList;
import java.util.Iterator;
public class althetero {

	public static void main(String[] args) {
		ArrayList altheter=new ArrayList();
		altheter.add("abc");
		altheter.add(123);
		altheter.add('c');
		
//		for(int i=0;i<altheter.size();i++) {
//			System.out.println(altheter.get(i));
//		}
		
//		for(Object o:altheter) {
//			System.out.println(o);
//			
//		}
		
		Iterator<Object> itr=altheter.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
