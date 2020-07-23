
public class HelloJenkins {

	public static void main(String[] args) {
		HelloJenkins hello = new HelloJenkins();
		
		System.out.println(hello.getWelcomeMessage("Jenkins & Son"));
	}

	
	public String getWelcomeMessage(String name)
	{
		String nessage = new String();
		nessage = "Hello " + name + "!";
		return nessage;
	}
}
