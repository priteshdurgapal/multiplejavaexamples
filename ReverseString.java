
public class ReverseString {

	public static void main(String[] args) throws ArrayIndexOutOfBoundsException {
		// TODO Auto-generated method stub
		String s="Pritesh";
		int size=s.length();
		System.out.println(s.length());
		char[] original=s.toCharArray();
		char[] ne= new char[s.length()];
		for(int i=0;i<s.length();i++) {
			//char temp=s.charAt(i);
			//System.out.println(temp + "at" + i);
			ne[i]=original[size-i-1];
			
			
		}
		//ne[size-1]=original[0];
		System.out.println(ne);
	}

}
