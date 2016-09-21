package datatypes;

public class StringPractice {

	public static void main(String[] args) {
		//String text1 = new String("Hello World");
		String text1 = "Hello World"; 
		String text2 = "Hello ";
		String text3 = "World";
		if(text1.equals(text2+text3))System.out.println("these strings are equal");
		System.out.println(text1);
		System.out.println(text2 + text3);
		
		String word1 = "Aardvark";
		String word2 = "Zyzzyva";
		if(word1.compareTo(word2) < 0)System.out.println("Word 1 is before word2," + " lexicongraphically");
	}
	// http://apcentral.collegeboard.com/apc/public/repository/ap_comp_sci_a_quick_reference.pdf
}
