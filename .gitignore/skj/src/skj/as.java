package skj;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;




public class as {
	public static void main(String[] args) {

		String[] aa=new String[]{"aa","sdfghg"};;
		for(String match:aa){
			System.out.println(match);
		}
		System.out.println(aa[0]);

		List<String> abc=new ArrayList<String>();
		abc.add("dsf");
		abc.add("sdgfh");
		abc.add("sdgfh");
		System.out.println(abc);

		for(String as:abc){
			System.out.println(as);
							}

	
	Map<String,String> ss=new HashMap<String, String>();
	
	ss.put("dgfg","dfhgfgf");
	
//	for(Entry<String,String> abcds:ss){
	for ( Map.Entry<String, String> entry : ss.entrySet()) {	
		System.out.println("helol"+entry.getKey());
		System.out.println(entry.getValue());
	}
	
	
	
	
	
	}
}
