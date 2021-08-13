public class OneAway {

	public static void main(String[] args) {
		String s1 ="pal";
		String s2 ="pale";
		int s1Len = s1.length();
		int s2Len = s2.length();
		String operation = "";
		boolean isOneAway = false;
		
		if(s1Len == s2Len) {
			operation = "replace";
			isOneAway = isOneAwayReplace(s1, s2);
		}else if (s1Len+1 == s2Len) {
			operation = "insertInS1";
			isOneAway = isOneAwayInsert(s1, s2);
		}else if(s1Len-1 == s2Len){
			operation = "insertInS2";
			isOneAway = isOneAwayInsert(s2, s1);
		}
		if(isOneAway) {
			System.out.println(operation);
		}
	}

	private static boolean isOneAwayReplace(String s1, String s2) {
		boolean isOneAway = false;
		for(int i=0; i<s1.length(); i++) {
			if(s1.charAt(i) != s2.charAt(i)) {
				if(isOneAway) return false;
				isOneAway = true;
			}
		}
		return isOneAway;
	}
	
	private static boolean isOneAwayInsert(String s1, String s2) {
		int s1Start = 0;
		int s2Start = 0;
		
		while(s1Start < s1.length() && s2Start < s2.length()) {
			if(s1.charAt(s1Start) != s2.charAt(s2Start)) {
				if(s1Start != s2Start) {
					return false;
				}
			}else {
				s1Start++;
			}
			s2Start ++;
		}
		
		return true;
	}
	
	

}
