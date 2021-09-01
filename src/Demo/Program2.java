package Demo;

public class Program2 {
	public static void main(String[] args) {
		String str="Ni13shIAvi34";
		System.out.println(new Program2().getName(str)+"In Branch B");
	}
	String getName(String str) {
		String st="";
		for(int i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);
			if(Character.isUpperCase(ch))
			{
				ch=Character.toLowerCase(ch);
			}
			else if(Character.isLowerCase(ch))
			{
				ch=Character.toUpperCase(ch);
			}
			st+=ch;
		}
		return st;
	}

}
