public class endOther {
	public boolean endOther(String a, String b) {
		a = a.toLowerCase();
		b = b.toLowerCase();
		if (b.length() > a.length()) {
			if (b.substring(b.length() - a.length(), b.length()).equals(a)) {
				return true;
			}
		} else if (a.substring(a.length() - b.length(), a.length()).equals(b)) {
                        return true;
                }
		return false;
	}
	
	public static void main( String[] args ) {
		System.out.println(endOther("abc", "abXabc") + " ... should be true");
		System.out.println(endOther("abcXYZ", "abcDEF") + " ... should be false");
	}
}
