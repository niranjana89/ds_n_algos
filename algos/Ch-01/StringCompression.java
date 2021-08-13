
public class StringCompression {

	public static void main(String[] args) {
		String s = "aabcccccaaa";
		StringBuffer sb = new StringBuffer();
		int count = 1;
		int i=0,j=1;
		while(j<s.length()) {
			if(s.charAt(i) == s.charAt(j)) {
				count++;
				j++;
			}
			else {
				sb.append(s.charAt(i));
				sb.append(count);
				i = j;
				j = i+1;
				count = 1;
			}
		}
		sb.append(s.charAt(s.length()-1));
		sb.append(count);
		System.out.println(sb.toString());
	}

}
