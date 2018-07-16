package template_method_comparator;

import java.util.ArrayList;
import java.util.Arrays;

public class Application {
	public static void main(String[] args) {
		ArrayList<String> arrLst = new ArrayList<String>();
		arrLst.add("Gustavo");
		arrLst.add("Martins");
		arrLst.add("Collaço");
		arrLst.add("Hi");
		arrLst.add("Test");
		arrLst.add("aaa");
		arrLst.add("hhh");
		arrLst.sort(new OrderFromLast());

		System.out.println("List ordered in by last char");
		for(String word : arrLst) {
			System.out.println("- " + word);		
		}

		System.out.println();
		System.out.println("or also");
		System.out.println("List ordered in by last char");
		
		String[] strLst = new String[7];
		strLst[0] = new String("Gustavo");
		strLst[1] = new String("Collaço");
		strLst[2] = new String("Martins");
		strLst[3] = new String("Test");
		strLst[4] = new String("Hi");
		strLst[5] = new String("hhh");
		strLst[6] = new String("aaa");
		Arrays.sort(strLst, new OrderFromLast());
		for(String word : strLst) {
			System.out.println("- " + word);		
		}
	}
}
