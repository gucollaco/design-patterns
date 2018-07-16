package template_method_comparator;

import java.util.Comparator;

public class OrderFromLast implements Comparator<Object> {
	
	@Override
	public int compare(Object obj1, Object obj2) {
		String str1 = (String) obj1;
		String str2 = (String) obj2;
		char[] chArr1 = str1.toCharArray();
		char[] chArr2 = str2.toCharArray();
		int intLength1 = chArr1.length-1;
		int intLength2 = chArr2.length-1;
		
		if(Character.toLowerCase(chArr1[intLength1]) > Character.toLowerCase(chArr2[intLength2])) return 1;
		if(Character.toLowerCase(chArr1[intLength1]) < Character.toLowerCase(chArr2[intLength2])) return -1;
		return 0;
	}

}
